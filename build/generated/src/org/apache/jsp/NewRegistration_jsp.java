package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class NewRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/MasterPage.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head><title></title></head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head><Title></title></head>\n");
      out.write("<body>\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td><img src=\"vote1.jpg\" width=\"350\" height=\"300\"></td>\n");
      out.write("<td><img src=\"opm.png\" width=\"1000\" height=\"300\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"5\"><b><marquee behavior=\"scroll\" bgcolor=\"yellow\">\n");
      out.write("Welcome For Voting and Giving your contribution in India's development</marquee></b>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<center><h2><u>New Customer Registration</u></h2></center>\n");
      out.write("<center>\n");
      out.write("<table>\n");
      out.write("<form action=\"ncac.jsp\">\n");
      out.write("<center><tr><td>Account No</td><td><input type=\"text\" name=\"accountno\"/></td></tr></center>\n");
      out.write("<center><tr><td>Name</td><td><input type=\"text\" name=\"name\"/></td></tr></center>\n");
      out.write("<center><tr><td>Introducy Acc. No</td><td><input type=\"text\" name=\"iac\"/></td></tr></center>\n");
      out.write("<center><tr><td>Address</td><td><input type=\"text\" name=\"address\"/></td></tr></center>\n");
      out.write("<center><tr><td>Date</td><td><input type=\"text\" name=\"date\"/></td></tr></center>\n");
      out.write("<center><tr><td>Mobile No</td><td><input type=\"text\" name=\"mobileno\"/></td></tr></center>\n");
      out.write("<center><tr><td>Opening Balance</td><td><input type=\"text\" name=\"OpeningBalance\"/></td></tr></center>\n");
      out.write("<center><tr><td>Password</td><td><input type=\"password\" name=\"password\"/></td></tr></center>\n");
      out.write("<center><tr><td><input type=\"Submit\" value=\"Submit\"/></td><td><input type=\"reset\" value=\"Cancel\"/></td></tr></center>\n");
      out.write("</form>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>");
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
