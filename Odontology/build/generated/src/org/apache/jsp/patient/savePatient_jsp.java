package org.apache.jsp.patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.util.Enumeration;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class savePatient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Saving Patient</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Saving Patient!</h1>\n");
      out.write("        \n");
      out.write("           ");

            Connection connect = null;
            Statement sqlStatement = null;

            try {
              Class.forName("com.mysql.jdbc.Driver");

                connect = DriverManager.getConnection("jdbc:mysql://localhost:3309/odontology" + "?user=root&password=12345678");
                   String consult = "INSERT INTO employee (firstName,lastName,idNumber,phoneNumber,direction,single,married,widower) VALUES (?,?,?,?,?,?,?,?)";
                
                   String firstName = request.getParameter("firstName") ;
               String lastName =request.getParameter("lastName");
               String idNumber = request.getParameter("idNumber");
               String phone =request.getParameter("phone");
               String direction= request.getParameter("direction") ;
               String single= request.getParameter("single");
               String married =request.getParameter("married");
               String windower = request.getParameter("windower") ;
                   
                   
                   
                   
             PreparedStatement sentencia= connect.prepareStatement(consult);
             
                sentencia.setString(1, firstName);
                sentencia.setString(2, lastName);
                sentencia.setString(3, idNumber);
                sentencia.setString(4, phone);
                sentencia.setString(5, direction);
                sentencia.setString(6, single);
                sentencia.setString(7, married);
                sentencia.setString(8, windower);
                
                
                         
                sentencia.executeUpdate(consult);
                
            } catch (Exception e) {
                out.println(e.getMessage());
                out.println("Stack in the catch -> " + e.toString());
                e.printStackTrace();
            }
            

        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        We are using de method ->\n");
      out.write("        ");
      out.print( request.getMethod() );
      out.write("\n");
      out.write("        \n");
      out.write("        ");

         String method = request.getMethod();
         out.println(method);
        
      out.write("\n");
      out.write("        \n");
      out.write("        <ul>\n");
      out.write("            <li> <p><b> First Name: </b>\n");
      out.write("                        ");
      out.print( request.getParameter("firstName") );
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </li>\n");
      out.write("             <li> <p><b> Last Name: </b>\n");
      out.write("                        ");
      out.print( request.getParameter("lastName") );
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </li>\n");
      out.write("             <li> <p><b> Id Number: </b>\n");
      out.write("                        ");
      out.print( request.getParameter("idNumber") );
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </li>\n");
      out.write("             <li> <p><b> Phone: </b>\n");
      out.write("                        ");
      out.print( request.getParameter("phone") );
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </li>\n");
      out.write("             <li> <p><b> Direction: </b>\n");
      out.write("                        ");
      out.print( request.getParameter("direction") );
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </li>\n");
      out.write("            <li> <p><b> Single: </b>\n");
      out.write("                        ");
      out.print( request.getParameter("single") );
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </li>\n");
      out.write("             <li> <p><b> Married: </b>\n");
      out.write("                        ");
      out.print( request.getParameter("married") );
      out.write("                       \n");
      out.write("                </p>\n");
      out.write("            </li>\n");
      out.write("             <li> <p><b> Windower: </b>\n");
      out.write("                        ");
      out.print( request.getParameter("windower") );
      out.write("\n");
      out.write("                </p>\n");
      out.write("            </li>     \n");
      out.write("        </ul>   \n");
      out.write("                \n");
      out.write("                <hr>\n");
      out.write("                <h2>HTTP param requests, i.e., every value in the form</h2>\n");
      out.write("                <table width=\"100%\" border=\"1\">\n");
      out.write("                    <tr bgcolor=\"#090909\">\n");
      out.write("                        <th>Parameter Name</th>\n");
      out.write("                        <th>Parameter Value(s)</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        Enumeration paramNames=request.getParameterNames();
                        while (paramNames.hasMoreElements()){
                            String paramName =(String) paramNames.nextElement();
                            out.println("<tr><td>"+paramName+"</td>\n");
                            String paramValue =request.getParameter(paramName);
                            out.println("<td>"+paramValue+"</td></tr>\n");
                        } 
                        
      out.write("\n");
      out.write("                </table>\n");
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
