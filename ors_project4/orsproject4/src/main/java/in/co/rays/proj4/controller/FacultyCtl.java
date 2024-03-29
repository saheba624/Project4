package in.co.rays.proj4.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import in.co.rays.proj4.bean.BaseBean;
import in.co.rays.proj4.bean.FacultyBean;
import in.co.rays.proj4.bean.SubjectBean;
import in.co.rays.proj4.exception.ApplicationException;
import in.co.rays.proj4.exception.DuplicateRecordException;
import in.co.rays.proj4.model.CollegeModel;
import in.co.rays.proj4.model.CourseModel;
import in.co.rays.proj4.model.FacultyModel;
import in.co.rays.proj4.model.SubjectModel;
import in.co.rays.proj4.util.DataUtility;
import in.co.rays.proj4.util.DataValidator;
import in.co.rays.proj4.util.PropertyReader;
import in.co.rays.proj4.util.ServletUtility;

/**
 * Servlet implementation class FacultyCtl
 * 
 * @author Saheba
 * @version 1.0
 * @Copyright (c) SunilOS
 */

@WebServlet(name = "FacultyCtl", urlPatterns = "/ctl/FacultyCtl")

public class FacultyCtl extends BaseCtl {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(FacultyCtl.class);

	/**
	 * Validates input data entered by User
	 * 
	 * @param request
	 * @return
	 */

	@Override
	protected boolean validate(HttpServletRequest request) {
		log.debug("FacultyCtl Method validate Started");

		boolean pass = true;

		String op = DataUtility.getString(request.getParameter("operation"));
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");

		if (DataValidator.isNull(request.getParameter("courseId"))) {
			request.setAttribute("courseId", PropertyReader.getValue("error.require", "Course Name"));
			pass = false;
		}
		if (DataValidator.isNull(request.getParameter("subjectId"))) {
			request.setAttribute("subjectId", PropertyReader.getValue("error.require", "Subject Name"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("collegeId"))) {
			request.setAttribute("collegeId", PropertyReader.getValue("error.require", "College Name"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("firstName"))) {
			request.setAttribute("firstName", PropertyReader.getValue("error.require", "First Name"));
			pass = false;
		}

		else if (DataValidator.isName(request.getParameter("firstName"))) {
			request.setAttribute("firstName", PropertyReader.getValue("error.name", "First Name"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("lastName"))) {
			request.setAttribute("lastName", PropertyReader.getValue("error.require", "Last Name"));
			pass = false;
		}

		else if (DataValidator.isName(request.getParameter("lastName"))) {
			request.setAttribute("lastName", PropertyReader.getValue("error.name", "Last Name"));
			pass = false;
		}

		if (DataValidator.isNull(request.getParameter("mobileNo"))) {
			request.setAttribute("mobileNo", PropertyReader.getValue("error.require", "Mobile No"));
			pass = false;
		} else if (DataValidator.isPhoneNo(request.getParameter("mobileNo"))) {
			request.setAttribute("mobileNo", PropertyReader.getValue("error.number", "Mobile No"));
			pass = false;
		}
		if (DataValidator.isNull(email)) {
			request.setAttribute("email", PropertyReader.getValue("error.require", "Email "));
			pass = false;
		} else if (!DataValidator.isEmailId(email)) {
			request.setAttribute("email", PropertyReader.getValue("error.email", "Email "));
			pass = false;
		}

		if (DataValidator.isNull(dob)) {
			request.setAttribute("dob", PropertyReader.getValue("error.require", "Date Of Birth"));
			pass = false;
		} else if (!DataValidator.isDate(dob)) {
			request.setAttribute("dob", PropertyReader.getValue("error.date", "Date Of Birth"));
			pass = false;
		}

		log.debug("FacultyCtl Method validate Ended");

		return pass;

	}

	/**
	 * Loads list and other data required to display at HTML form
	 * 
	 * @param request
	 */

	@Override
	protected void preload(HttpServletRequest request) {
		CourseModel model = new CourseModel();
		try {
			List list = model.list();
			request.setAttribute("courseList", list);
			System.out.println("courseList" + list);
		} catch (ApplicationException e) {
			log.error(e);
		}
		SubjectModel sModel = new SubjectModel();
		try {
			List list2 = sModel.list();
			request.setAttribute("subjectList", list2);
			Iterator<SubjectBean> itr = list2.iterator();

			while (itr.hasNext()) {
				SubjectBean bean = itr.next();
				System.out.println("Subject bean value "+bean.getCourseId() + bean.getCourseName() + bean.getDescription() + bean.getId()
						+ bean.getKey() + bean.getSubjectName() + bean.getValue());
			}
			System.out.println("courseList" + list2);
		} catch (ApplicationException e) {
			log.error(e);
		}
		CollegeModel cModel = new CollegeModel();
		try {
			List list3 = cModel.list();
			request.setAttribute("collegeList", list3);
			System.out.println("courseList" + list3);
		} catch (ApplicationException e) {
			log.error(e);
		}

		FacultyModel fModel = new FacultyModel();
		try {
			List list4 = cModel.list();
			request.setAttribute("facultyList", list4);
		} catch (ApplicationException e) {
			log.error(e);
		}

	}

	/**
	 * Populates bean object from request parameters
	 * 
	 * @param request
	 * @return
	 */

	@Override
	protected BaseBean populateBean(HttpServletRequest request) {
		log.debug("FacultyCtl Method populatebean Started");

		FacultyBean bean = new FacultyBean();

		bean.setId(DataUtility.getLong(request.getParameter("id")));

		bean.setFirstName(DataUtility.getString(request.getParameter("firstName")));

		bean.setLastName(DataUtility.getString(request.getParameter("lastName")));

		bean.setDob(DataUtility.getDate(request.getParameter("dob")));

		bean.setMobileNo(DataUtility.getString(request.getParameter("mobileNo")));

		bean.setEmail(DataUtility.getString(request.getParameter("email")));

		bean.setCourseId(DataUtility.getLong(request.getParameter("courseId")));

		bean.setSubjectId(DataUtility.getLong(request.getParameter("subjectId")));

		bean.setCollegeId(DataUtility.getLong(request.getParameter("collegeId")));

		populateDTO(bean, request);

		log.debug("FacutlyCtl Method populatebean Ended");

		return bean;

	}

	/**
	 * Contains display logics
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("FacutlyCtl Method doGet Started");

		String op = DataUtility.getString(request.getParameter("operation"));
		long id = DataUtility.getLong(request.getParameter("id"));

		// get model

		FacultyModel model = new FacultyModel();
		if (id > 0 || op != null) {
			FacultyBean bean;
			try {
				bean = model.findByPK(id);
				ServletUtility.setBean(bean, request);
			} catch (ApplicationException e) {
				log.error(e);
				ServletUtility.handleException(e, request, response);
				return;
			}
		}
		try {
			ServletUtility.forward(getView(), request, response);
		} catch (Exception e) {

			e.printStackTrace();
		}
		log.debug("FacutlyCtl Method doGett Ended");

	}

	/**
	 * Contains submit logics
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("FacutlyCtl Method doPost Started");

		String op = DataUtility.getString(request.getParameter("operation"));

		// get model

		FacultyModel model = new FacultyModel();

		long id = DataUtility.getLong(request.getParameter("id"));

		if (OP_SAVE.equalsIgnoreCase(op) || OP_UPDATE.equalsIgnoreCase(op)) {

			FacultyBean bean = (FacultyBean) populateBean(request);

			try {
				if (id > 0) {
					model.update(bean);
					ServletUtility.setBean(bean, request);
					ServletUtility.setSuccessMessage("Data is successfully updated", request);
					ServletUtility.forward(getView(), request, response);

				} else {
					long pk = model.add(bean);
					// ServletUtility.setBean(bean, request);
					ServletUtility.setSuccessMessage("Data is successfully saved", request);
					ServletUtility.forward(getView(), request, response);
					bean.setId(pk);
				}
				return ;
			} catch (ApplicationException e) {
				log.error(e);
				e.printStackTrace();
				ServletUtility.handleException(e, request, response);
				return;
			} catch (DuplicateRecordException e) {
				ServletUtility.setBean(bean, request);
				ServletUtility.setErrorMessage("Faculty Email Id is already exists", request);
			}

		}

		else if (OP_DELETE.equalsIgnoreCase(op)) {

			FacultyBean bean = (FacultyBean) populateBean(request);
			try {
				model.delete(bean);
				ServletUtility.redirect(ORSView.FACULTY_LIST_CTL, request, response);
				return;

			} catch (ApplicationException e) {
				log.error(e);
				ServletUtility.handleException(e, request, response);
				return;
			}

		} else if (OP_CANCEL.equalsIgnoreCase(op)) {

			ServletUtility.redirect(ORSView.FACULTY_LIST_CTL, request, response);
			return;

		}

		ServletUtility.forward(getView(), request, response);

		log.debug("FacutlyCtl Method doPost Ended");

	}

	/**
	 * Returns the VIEW page of this Controller
	 * 
	 * @return
	 */

	@Override
	protected String getView() {
		return ORSView.FACULTY_VIEW;
	}

}
