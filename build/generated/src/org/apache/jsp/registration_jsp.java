package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <title>Registration</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"row justify-content-center\">\n");
      out.write("\t\t\t<div class=\"col-sm-6\">\n");
      out.write("\t\t\t\t<h1>Registration</h1>\n");
      out.write("\t\t\t\t<form action=\"JSP/addClient.jsp\" method=\"get\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                          <label for=\"name\">Name</label>\n");
      out.write("                                          <input type=\"text\" name=\"name\" class=\"form-control\"  placeholder=\"Enter Name\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"gender\">Gender :</label><br>\n");
      out.write("                                          <input type=\"radio\" name=\"gender\" value=\"male\">Male\n");
      out.write("                                          <input type=\"radio\" name=\"gender\" value=\"female\">Female<br>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                          <label for=\"phone\">Phone No</label>\n");
      out.write("                                          <input type=\"text\" name=\"phone\" class=\"form-control\"  placeholder=\"Phone number\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                          <label for=\"address\">Address:</label>\n");
      out.write("                                          <input type=\"text\" name=\"address\" class=\"form-control\"  placeholder=\"Address\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                          <label for=\"password\">House No</label>\n");
      out.write("                                          <input type=\"text\" name=\"house\" class=\"form-control\"  placeholder=\"House No\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <button type=\"submit\" name=\"registration\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
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
