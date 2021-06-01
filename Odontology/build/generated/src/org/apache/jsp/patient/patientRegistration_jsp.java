package org.apache.jsp.patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patientRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Patient Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>PATIENT REGISTRATION FORM, FROM JSP</h1>\n");
      out.write("        <form action=\"savePatient.jsp\" method=\"POST\">\n");
      out.write("            <table style=\"with: 50%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>First Name </td>\n");
      out.write("                    <td><input type=\"text\" name=\"firstName\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Last Name </td>\n");
      out.write("                    <td><input type=\"text\" name=\"lastName\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>ID Number </td>\n");
      out.write("                    <td><input type=\"numer\" name=\"idNumber\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone Number </td>\n");
      out.write("                    <td><input type=\"number\" name=\"phone\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Direction </td>\n");
      out.write("                    <td><input type=\"text\" name=\"direction\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Civil Status</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"checkbox\" name=\"single\" checked=\"checked\"/>Single<br>\n");
      out.write("                        <input type=\"checkbox\" name=\"married\"/>Married<br>\n");
      out.write("                        <input type=\"checkbox\" name=\"windower\" checked=\"checked\"/>Widower<br>\n");
      out.write("                       \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Save\"/>\n");
      out.write("            <input type=\"reset\" value=\"Empty Fields\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
