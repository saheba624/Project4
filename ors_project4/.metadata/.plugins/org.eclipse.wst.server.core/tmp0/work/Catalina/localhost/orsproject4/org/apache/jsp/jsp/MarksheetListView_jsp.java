/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.61
 * Generated at: 2022-05-15 12:22:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.proj4.util.HTMLUtility;
import in.co.rays.proj4.model.MarksheetModel;
import in.co.rays.proj4.controller.MarksheetListCtl;
import in.co.rays.proj4.controller.BaseCtl;
import in.co.rays.proj4.util.ServletUtility;
import in.co.rays.proj4.bean.MarksheetBean;
import java.util.List;
import java.util.Iterator;
import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.controller.LoginCtl;
import in.co.rays.proj4.bean.UserBean;
import in.co.rays.proj4.controller.ORSView;
import in.co.rays.proj4.controller.ORSView;

public final class MarksheetListView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1649653613980L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1651308036769L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.proj4.controller.MarksheetListCtl");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("in.co.rays.proj4.model.MarksheetModel");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("in.co.rays.proj4.controller.ORSView");
    _jspx_imports_classes.add("in.co.rays.proj4.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.proj4.bean.UserBean");
    _jspx_imports_classes.add("in.co.rays.proj4.util.HTMLUtility");
    _jspx_imports_classes.add("in.co.rays.proj4.controller.BaseCtl");
    _jspx_imports_classes.add("in.co.rays.proj4.util.ServletUtility");
    _jspx_imports_classes.add("in.co.rays.proj4.bean.MarksheetBean");
    _jspx_imports_classes.add("in.co.rays.proj4.bean.RoleBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<title>MarkSheet List</title>\n");
      out.write("<style>\n");
      out.write("input[type=submit] {\n");
      out.write("\twidth: 90px;\n");
      out.write("\theight: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text] {\n");
      out.write("\twidth: 200px;\n");
      out.write("\theight: 26px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers {\n");
      out.write("\tborder-collapse: collapse;\n");
      out.write("\twidth: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#customers td, #customers th {\n");
      out.write("\tborder: 1px solid #A9A9A9;\n");
      out.write("\tpadding: 8px;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* #customers tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write(" */\n");
      out.write("#customers th {\n");
      out.write("\tpadding: 12px;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\t/* \tbackground-color: #A9A9A9;  */\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ss {\n");
      out.write("\theight: auto;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".header {\r\n");
      out.write("   position: relative;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   bottom: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   color: black;\r\n");
      out.write("  /*  background-color:#efefef; */\r\n");
      out.write("  background-color: #f5f5f5;\r\n");
      out.write("  \r\n");
      out.write("<<<<<<< HEAD\r\n");
      out.write("   /* height: 25%; */\r\n");
      out.write("=======\r\n");
      out.write("   height: 25%;\r\n");
      out.write(">>>>>>> 59f793d437a2b8fa345466a54bce9893925f1ab7\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("       <!--   <script type=\"text/javascript\" src=\"src/main/webapp/js/calendar.js\"></script> -->\r\n");
      out.write("<script>\r\n");
      out.write("var d = new Date(90,0,1);\r\n");
      out.write("$(function() {\r\n");
      out.write("\t$( \"#datepicker\" ).datepicker({\r\n");
      out.write("                defaultDate:d, //set the default date to Jan 1st 1990\r\n");
      out.write("\t\tchangeMonth: true,\r\n");
      out.write("\t\tchangeYear: true,\r\n");
      out.write("\t\t yearRange: '-40:-18', //set the range of years\r\n");
      out.write("        dateFormat: 'dd-mm-yy' //set the format of the date\r\n");
      out.write("\t});\r\n");
      out.write("});</script>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\" style=\";\">\r\n");
      out.write("<hr>\r\n");
      out.write("\t");

UserBean userBean=(UserBean)session.getAttribute("user");
boolean userLoggedIn = (userBean!=null);
String welcomeMsg="Hi,";
//String r=userBean.getFirstName();
if(userLoggedIn)
{
	String role = (String) session.getAttribute("role");
    welcomeMsg += userBean.getFirstName() + " (" + role + ")";

}
else 
{
    welcomeMsg += "Guest" ;
}

      out.write("\r\n");
      out.write("\t<table style=\"width: 100%; border: 0; height: 10%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td width=\"90%\"><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</b></a>|\r\n");
      out.write("\t\t\t\t");

if(userLoggedIn)
{

      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</b></a>\r\n");
      out.write("\t\t\t\t");

}
else {
 
      out.write(" \r\n");
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</b></a> \r\n");
      out.write(" ");

     }
 
      out.write("\r\n");
      out.write(" </td>\r\n");
      out.write("\t\t\t<td rowspan=\"2\"><img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/customLogo.png\" width=\"309px\"\r\n");
      out.write("\t\t\t\theight=\"88px\" align=\"Right\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<h3>");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t");
 
		if (userLoggedIn) {
        
      out.write("\r\n");
      out.write("       \r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<td colspan=\"2\"><a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</b></a> |       \r\n");
      out.write("         <a href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</b></a> |\r\n");
      out.write("       \t <a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</b></a> |              \r\n");
      out.write("       \t <a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet MeritList</b></a> |\r\n");
      out.write("        \r\n");
      out.write("        ");

            if (userBean.getRoleId() == RoleBean.ADMIN) {
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</b></a> | \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</b></a> |         \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</b></a> |        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</b></a> |        \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</b></a> |\r\n");
      out.write("        <br>\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_CTL );
      out.write("\" >Add Course</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_CTL );
      out.write("\" >Add Subject</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\" >Subject List</b></a> |          \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_CTL );
      out.write("\" >Add Faculty</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" >Add TimeTable</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a target=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java Doc</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (userBean.getRoleId() == RoleBean.STUDENT) {
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL );
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write(" \t\t");

            if (userBean.getRoleId() == RoleBean.KIOSK) {
        
      out.write(" \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (userBean.getRoleId() == RoleBean.FACULTY) {
           // System.out.println("======>><><>"+userBean.getRoleId());	
        
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_CTL );
      out.write("\" >Add Subject</b></a> |   \r\n");
      out.write("        <br>    \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_CTL );
      out.write("\" >Add TimeTable</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t ");

            if (userBean.getRoleId() == RoleBean.College) {
       //    System.out.println("======>><><>"+userBean.getRoleId());	
          
      out.write(" \r\n");
      out.write("       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</b></a> |       \r\n");
      out.write("        <a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL );
      out.write("\">Faculty List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL );
      out.write("\">TimeTable List</b></a> |\r\n");
      out.write("        <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL );
      out.write("\">Course List</b></a> |       \r\n");
      out.write("       ");

     		}
 		
      out.write("\r\n");
      out.write(" \t\t\r\n");
      out.write(" \t\t</font>\r\n");
      out.write(" \t\t</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    \t");

        	}
   		 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<hr>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("\t<div style=\"height: 600px; width: 100%\">\n");
      out.write("\t\t<h1 align=\"center\">Marksheet List</h1>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t");
      in.co.rays.proj4.bean.UserBean sbean = null;
      sbean = (in.co.rays.proj4.bean.UserBean) _jspx_page_context.getAttribute("sbean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (sbean == null){
        sbean = new in.co.rays.proj4.bean.UserBean();
        _jspx_page_context.setAttribute("sbean", sbean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t<form action=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<h3 colspan=\"8\" align=\"center\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font>\n");
      out.write("\t\t\t\t\t\t\t<font color=\"green\">");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font>\n");
      out.write("\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<script type=\"text/javascript\"\n");
      out.write("\t\t\t\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\t\t\t<script language=\"javascript\">\n");
      out.write("\t\t\t\t$(function() {\n");
      out.write("\n");
      out.write("\t\t\t\t\t// add multiple select / deselect functionality\n");
      out.write("\t\t\t\t\t$(\"#selectall\").click(function() {\n");
      out.write("\t\t\t\t\t\t$('.case').attr('checked', this.checked);\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t// if all checkbox are selected, check the selectall checkbox\n");
      out.write("\t\t\t\t\t// and viceversa\n");
      out.write("\t\t\t\t\t$(\".case\").click(function() {\n");
      out.write("\n");
      out.write("\t\t\t\t\t\tif ($(\".case\").length == $(\".case:checked\").length) {\n");
      out.write("\t\t\t\t\t\t\t$(\"#selectall\").attr(\"checked\", \"checked\");\n");
      out.write("\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t$(\"#selectall\").removeAttr(\"checked\");\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

					List list1 = ServletUtility.getList(request);

					if (list1 == null || list1.size() == 0) {
				
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<td><input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\tvalue=\" ");
      out.print(MarksheetListCtl.OP_BACK);
      out.write("\"></td>\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<table width=\"100%\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<td align=\"center\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t&nbsp; <label>RollNo: </label> <input type=\"text\" name=\"rollNo\"\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter Roll No\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(ServletUtility.getParameter("rollNo", request));
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t");
 List slist=(List)request.getAttribute("slist");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<label>Student Name:</label>\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(HTMLUtility.getList("sname",String.valueOf(ServletUtility.getParameter("sname", request)), slist));
      out.write("\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\n");
      out.write("\t\t\t\t\t\t\t <input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_SEARCH);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\n");
      out.write("\t\t\t\t\t\t\t <input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_RESET);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("<br>\n");
      out.write("\t\t\t\t<table id=\"customers\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!--  <table border=\"1\" width=\"100%\"> -->\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

							if (userBean.getRoleId() == RoleBean.ADMIN || userBean.getRoleId() == RoleBean.FACULTY) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<th><input type=\"checkbox\" id=\"selectall\" />Select All</th>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<th>S.No</th>\n");
      out.write("\t\t\t\t\t\t<th>RollNo</th>\n");
      out.write("\t\t\t\t\t\t<th>Student Name</th>\n");
      out.write("\t\t\t\t\t\t<th>Physics</th>\n");
      out.write("\t\t\t\t\t\t<th>Chemistry</th>\n");
      out.write("\t\t\t\t\t\t<th>Maths</th>\n");
      out.write("\t\t\t\t\t\t<!--   <th>Edit</th> -->\n");
      out.write("\t\t\t\t\t\t");

							if (userBean.getRoleId() == RoleBean.ADMIN || userBean.getRoleId() == RoleBean.FACULTY) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<th>Edit</th>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t");

						int pageNo = ServletUtility.getPageNo(request);
							int pageSize = ServletUtility.getPageSize(request);
							/*  System.out.println(pageNo);
							 System.out.println(pageSize); */
							int index = ((pageNo - 1) * pageSize) + 1;
							//System.out.println(index);

							List list = ServletUtility.getList(request);//request,getAttribute("list");
							Iterator<MarksheetBean> it = list.iterator();

							while (it.hasNext()) {

								MarksheetBean bean = it.next();
					
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t");

							if (userBean.getRoleId() == RoleBean.ADMIN || userBean.getRoleId() == RoleBean.FACULTY) {
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"><input type=\"checkbox\" class=\"case\"\n");
      out.write("\t\t\t\t\t\t\tname=\"ids\" value=\"");
      out.print(bean.getId());
      out.write("\"></td>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(index++);
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(bean.getRollNo());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(bean.getName());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(bean.getPhysics());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(bean.getChemistry());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(bean.getMaths());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

							if (userBean.getRoleId() == RoleBean.ADMIN || userBean.getRoleId() == RoleBean.FACULTY) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<td><a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("?id=");
      out.print(bean.getId());
      out.write("\">Edit</a></td>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\t\t\t\t<table width=\"99%\">\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<td><input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_PREVIOUS);
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t");
      out.print((pageNo == 1) ? "disabled" : "");
      out.write("></td>\n");
      out.write("\t\t\t\t\t\t");

							if (userBean.getRoleId() == RoleBean.ADMIN || userBean.getRoleId() == RoleBean.FACULTY) {
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"><input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_DELETE);
      out.write("\"></td>\n");
      out.write("\t\t\t\t\t\t<td align=\"center\"><input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_NEW);
      out.write("\"></td>\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

							MarksheetModel model = new MarksheetModel();
								MarksheetBean b = new MarksheetBean();
								/* System.out.println("nexy pk id= "+model.nextPK());
								System.out.println("b id= "+b.getId()); */
						
      out.write("\n");
      out.write("\t\t\t\t\t\t<td align=\"right\"><input type=\"submit\" name=\"operation\"\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(MarksheetListCtl.OP_NEXT);
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(((list.size() < pageSize) || model.nextPK() - 1 == b.getId()) ? "disabled" : "");
      out.write("></td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\n");
      out.write("\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"pageNo\" value=\"");
      out.print(pageNo);
      out.write("\"> <input\n");
      out.write("\t\t\t\t\ttype=\"hidden\" name=\"pageSize\" value=\"");
      out.print(pageSize);
      out.write("\">\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<div>\n");
      out.write("\t\t<br> <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Welcome Page</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".footer {\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\t/* left: 0; */\r\n");
      out.write("\t   top:94%; \r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tbackground-color: #dddddd;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\r\n");
      out.write("   /*   height: 10% */ ;\r\n");
      out.write(" \t padding-bottom: 14px; \r\n");
      out.write("\r\n");
      out.write("\theight: 8%;\r\n");
      out.write("\t/padding-bottom: 1px;\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write(".text{\r\n");
      out.write("color:\"red\";\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <div  class=\"footer\" style=\"height:25px; margin-top: ;\">\r\n");
      out.write("<hr>\r\n");
      out.write("\t<b>&copy;Rays Technologies</b>\r\n");
      out.write("\t<hr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
