package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class DashBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("    <title>Dashboard</title>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("       <nav class=\"navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow\">\n");
      out.write("            <a class=\"navbar-brand col-sm-3 col-md-2 mr-0\" href=\"#\">Library Management System</a>\n");
      out.write("            \n");
      out.write("            <ul class=\"navbar-nav px-3\">\n");
      out.write("                <li class=\"nav-item text-nowrap \" style=\"width: 300px; \">\n");
      out.write("                  <h4 style=\"color: white; padding-right: 36px; padding-top: 4px;\" class=\"float-left\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                <a class=\"nav-link\" href=\"login.html\">Sign out</a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("      </nav>\n");
      out.write("      <div class=\"container-fluid justify-content-center\">\n");
      out.write("            <div class=\"row \">\n");
      out.write("              <nav class=\"col-md-2 d-none d-md-block bg-light sidebar\">\n");
      out.write("                <div class=\"sidebar-sticky\">\n");
      out.write("                  <ul class=\"nav flex-column\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link active\" href=\"#\">\n");
      out.write("                        Dashboard <span class=\"sr-only\">(current)</span>\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"#\">\n");
      out.write("                       Orders\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"#\">\n");
      out.write("                        Products\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"#\">\n");
      out.write("                        Customers\n");
      out.write("                      </a>\n");
      out.write("                    </li>\n");
      out.write("                </div>\n");
      out.write("              </nav>\n");
      out.write("\n");
      out.write("              <div class=\"col-md-9  justify-content-center\">\n");
      out.write("                  <div style =\"width: 67%; margin-left: auto; margin-right: auto;\" class=\"pt-5\">\n");
      out.write("                    <table class=\"table table-hover \" cellpadding =\"10\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Previous Login Time</th>\n");
      out.write("                            <th>Number of Log-in</th>\n");
      out.write("                           \n");
      out.write("                        </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.Date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                                <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.visitCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>  \n");
      out.write("                \n");
      out.write("                <form method=\"POST\" action=\"JSP/ManagerAddNew.jsp\" class=\"justify-content-center pt-5\" style=\"width: 450px;\">\n");
      out.write("                  <h1>Dashboard</h1>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                        <label for=\"title\">Title</label>\n");
      out.write("                        <input type=\"text\" name=\"title\" class=\"form-control\" id=\"title\" placeholder=\"Enter Your Full Name\">\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                        <label for=\"subject\">Subject</label>\n");
      out.write("                        <select name=\"subject\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                          <option value=\"math\">Math</option>\n");
      out.write("                          <option value=\"phy\">Physics</option>\n");
      out.write("                          <option value=\"che\">Chemistry</option>\n");
      out.write("                          <option value=\"bio\">Biology</option>\n");
      out.write("                          <option value=\"cse\">CSE</option>\n");
      out.write("                          <option value=\"eee\">EEE</option>\n");
      out.write("                          <option value=\"civil\">Civil</option>\n");
      out.write("                          <option value=\"detect\">Detective</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                        <label for=\"pubisher\">Publisher</label>\n");
      out.write("                        <input type=\"text\" name=\"pubisher\" class=\"form-control\" id=\"pubisher\" placeholder=\"Pubisher's name\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                        <label for=\"lang\">Language</label>\n");
      out.write("                        <select name=\"lang\" class=\"form-control\" id=\"lang\">\n");
      out.write("\n");
      out.write("                          <option value=\"bangla\">Bangla</option>\n");
      out.write("                          <option value=\"english\">English</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                        <label for=\"number_page\">Number of page</label>\n");
      out.write("                        <input type=\"text\" name=\"number_page\" class=\"form-control\" placeholder=\"Enter number of page\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                        <label for=\"number_book\">Total number of book</label>\n");
      out.write("                        <input type=\"text\" name=\"number_book\" class=\"form-control\" placeholder=\"Enter number of books\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                        <label for=\"image\">Upload image</label>\n");
      out.write("                        <input type=\"file\" name=\"image\" class=\"form-control\"  placeholder=\"Enter image name\">\n");
      out.write("                  </div>\n");
      out.write("                  <button type=\"submit\" name=\"registration\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                </form>\n");
      out.write("              \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <script src=\"js/popper.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  </body>\n");
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
