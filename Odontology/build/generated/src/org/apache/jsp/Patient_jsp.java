package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class Patient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Reading Patient JSP</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Connection connect = null;
            Statement sqlStatement = null;

            try {
              Class.forName("com.mysql.jdbc.Driver");

                connect = DriverManager.getConnection("jdbc:mysql://localhost:3309/odontology" + "?user=root&password=12345678");

                sqlStatement = connect.createStatement();
                String sql = "SELECT * FROM employee";

                ResultSet rec = sqlStatement.executeQuery(sql);
        
      out.write("\n");
      out.write("        <table width=\"800\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th width=\"91\"><div align=\"center\">ID Patient</div></th>\n");
      out.write("                <th width=\"91\"><div align=\"center\">First Name</div></th>\n");
      out.write("                <th width=\"91\"><div align=\"center\">Last Name</div></th>\n");
      out.write("                <th width=\"91\"><div align=\"center\">Id Number</div></th>\n");
      out.write("                <th width=\"91\"><div align=\"center\">Phone Number</div></th>\n");
      out.write("                <th width=\"91\"><div align=\"center\">Direction</div></th>\n");
      out.write("                <th width=\"91\"><div align=\"center\">Single</div></th>\n");
      out.write("                <th width=\"91\"><div align=\"center\">Married</div></th>\n");
      out.write("                <th width=\"91\"><div align=\"center\">Widower</div></th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
while ((rec != null) && (rec.next())) {
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><div align=\"center\">");
      out.print(rec.getString("idEmployee"));
      out.write("</div></td>\n");
      out.write("                <td><div align=\"center\">");
      out.print(rec.getString("firstName"));
      out.write("</div></td>\n");
      out.write("                <td><div align=\"center\">");
      out.print(rec.getString("lastName"));
      out.write("</div></td>\n");
      out.write("                <td><div align=\"center\">");
      out.print(rec.getString("idNumber"));
      out.write("</div></td>\n");
      out.write("                <td><div align=\"center\">");
      out.print(rec.getString("phoneNumber"));
      out.write("</div></td>\n");
      out.write("                <td><div align=\"center\">");
      out.print(rec.getString("direction"));
      out.write("</div></td>\n");
      out.write("                <td><div align=\"center\">");
      out.print(rec.getString("single"));
      out.write("</div></td>\n");
      out.write("                <td><div align=\"center\">");
      out.print(rec.getString("married"));
      out.write("</div></td>\n");
      out.write("                <td><div align=\"center\">");
      out.print(rec.getString("widower"));
      out.write("</div></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        ");

            } catch (Exception e) {
                out.println(e.getMessage());
                out.println("Stack in the catch -> " + e.toString());
                e.printStackTrace();
            }
            try {
                if (sqlStatement != null) {
                    sqlStatement.close();
                }
            } catch (SQLException e) {
                out.println(e.getMessage());
                e.printStackTrace();
            }
        
      out.write("\n");
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
