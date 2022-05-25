package in.co.rays.proj4.bean;

import in.co.rays.proj4.bean.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * 
 * The Class SubjectBean.
 * 
 * @author Saheba
 * @version 1.0
 * @Copyright (c) SunilOS
 */
public class SubjectBean extends BaseBean {

	private long id;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/** The course id. */
	private long courseId;

	/** The course name. */
	private String courseName;

	private String subjectName;

	private String description;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	/**
	 * Gets the course id.
	 *
	 * @return the course id
	 */
	public long getCourseId() {
		return courseId;
	}

	/**
	 * Sets the course id.
	 *
	 * @param courseId the new course id
	 */
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	/**
	 * Gets the course name.
	 *
	 * @return the course name
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * Sets the course name.
	 *
	 * @param courseName the new course name
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.co.sunrays.proj4.bean.DropdownListBean#getKey()
	 */
	public String getKey() {
		// TODO Auto-generated method stub
		return id + "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.co.sunrays.proj4.bean.DropdownListBean#getValue()
	 */
	public String getValue() {
		// TODO Auto-generated method stub
		return subjectName;
	}

}
