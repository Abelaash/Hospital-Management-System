package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Hospital</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body, html {\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            \n");
      out.write("            .bg-image {\n");
      out.write("                /* The image used */\n");
      out.write("                background-image: url(\"resources/frontpage.jpeg\");\n");
      out.write("\n");
      out.write("                /* Add the blur effect */\n");
      out.write("                filter: blur(5px);\n");
      out.write("                -webkit-filter: blur(5px);\n");
      out.write("\n");
      out.write("                /* Full height */\n");
      out.write("                height: 100%; \n");
      out.write("\n");
      out.write("                /* Center and scale the image nicely */\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Position text in the middle of the page/image */\n");
      out.write("            .bg-text {\n");
      out.write("                color: black;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border: 3px solid #f1f1f1;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                z-index: 2;\n");
      out.write("                width: 80%;\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            table {\n");
      out.write("                width:100%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            table, th, td {\n");
      out.write("                border: 1px solid black;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                padding: 15px;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("            td {\n");
      out.write("                border: 0px;\n");
      out.write("            }\n");
      out.write("            table#t01 tr:nth-child(even) {\n");
      out.write("                background-color: #eee;\n");
      out.write("            }\n");
      out.write("            table#t01 tr:nth-child(odd) {\n");
      out.write("                background-color: #fff;\n");
      out.write("            }\n");
      out.write("            table#t01 th {\n");
      out.write("                background-color: rgb(0, 51, 204);\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .button {\n");
      out.write("                background-color: rgb(0, 51, 204); /* Blue */\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px 32px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 12px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"adregister.jsp\">Admin Registration</a>\n");
      out.write("        <a href=\"adlogin.jsp\">Admin Login</a>\n");
      out.write("        <div class=\"bg-image\"></div>   \n");
      out.write("        <div class=\"bg-text\">\n");
      out.write("            <h2 style=\"text-align : center\"> Hospitals </h2>\n");
      out.write("\n");
      out.write("            <form action=\"HospitalServlet\">\n");
      out.write("                <table id=\"t01\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\">Name</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Sunnybrook Health Sciences Centre</td>\n");
      out.write("                        <td><button class=\"button\" name=\"hospital\" value=\"1\"> Visit </button></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Trillium Health Partners - Credit Valley Hospital</td>\n");
      out.write("                        <td><button class=\"button\" name=\"hospital\" value=\"2\"> Visit </button></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Trillium Health Partners - Mississauga Hospital</td>\n");
      out.write("                        <td><button class=\"button\" name=\"hospital\" value=\"3\"> Visit </button></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Milton District Hospital</td>\n");
      out.write("                        <td><button class=\"button\" name=\"hospital\" value=\"4\"> Visit </button></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
