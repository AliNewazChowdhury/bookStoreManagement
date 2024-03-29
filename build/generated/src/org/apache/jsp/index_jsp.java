package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import dao.DataAccess;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- == stylesheet == -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\t<header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                    <div class=\"row p-0\">\n");
      out.write("                           <div class=\"col-12 p-0\">\n");
      out.write("                                <nav class=\"navbar navbar-expand-md navbar-dark p-0\">\n");
      out.write("                                            <!-- ==Company Name & logo== -->\n");
      out.write("                                        <div class=\"company float-left \" >\n");
      out.write("                                           <img src=\"images/logo.png\" alt=\"Company Logo\">\n");
      out.write("                                           <h2>National Library</h2>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"collapse navbar-collapse \" id=\"navbarsExample04\">\n");
      out.write("                                            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                                              <li class=\"nav-item active mx-3\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                                              </li>\n");
      out.write("                                              <li class=\"nav-item mx-3\">\n");
      out.write("                                                <a class=\"nav-link\" href=\"registration.jsp\">Registration</a>\n");
      out.write("                                              </li>\n");
      out.write("                                            </ul>\n");
      out.write("                                        </div>\n");
      out.write("                                </nav>\n");
      out.write("                           </div>\n");
      out.write("                    </div>\n");
      out.write("            </div>\t\t\t\n");
      out.write("\t</header>\n");
      out.write("        <section id=\"project\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Library Books</h1>\n");
      out.write("                <!-- ==Portfolio Content== -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                 ");

                    DataAccess da= new DataAccess();
                    ResultSet rs=da.getImage();
                    while(rs.next())
                    {
                  
      out.write("\n");
      out.write("                    <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                         <div class=\"content text-center\">\n");
      out.write("                              <img src=\"images/");
out.println(rs.getString("image"));
      out.write("\" >\n");
      out.write("                            <div class=\"overlay\">\n");
      out.write("                                <a href=\"/Orders\">Borrow</a>\n");
      out.write("                            </div>\n");
      out.write("                         </div>  \n");
      out.write("                    </div>  \n");
      out.write("                    ");

                    }
                    rs.close();
                    
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
