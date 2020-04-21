package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class AboutCandidates_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
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
      out.write("<center><h3>About Candidates</h3></center>\n");
      out.write("<center>\n");
      out.write("<table>\n");
      out.write("\n");
      out.write("                <tr><td align=\"centre\"><b>The Bharatiya Janata Party is one of the two major political parties in India, along with the Indian National Congress.\n");
      out.write("As of 2016, it is the country's largest political party in terms of representation in the national parliament and state assemblies, and it is the world's largest party in terms of primary membership. \n");
      out.write("The BJP is a right-wing party, with close ideological and organisational links to the Hindu nationalist Rashtriya Swayamsevak Sangh.\n");
      out.write("The official ideology of the BJP is \"integral humanism\", first formulated by Deendayal Upadhyaya in 1965. \n");
      out.write("The party expresses a commitment to Hindutva, and its policy has historically reflected Hindu nationalist positions.                                                        </b><b>\n");
      out.write("                                                      <br> <br> The Indian National Congress (INC), often called Congress) is a broad-based political party in India. \n");
      out.write("Founded in 1885, it was the first modern nationalist movement to emerge in the British Empire in Asia and Africa.\n");
      out.write("From the late 19th-century, and especially after 1920, under the leadership of Mahatma Gandhi, Congress became the principal leader of the Indian independence movement, with over 15 million members and over 70 million participants.\n");
      out.write("The Congress led India to independence from Great Britain,and powerfully influenced other anti-colonial nationalist movements in the British Empire.\n");
      out.write("From 2004 to 2014, the Congress-led United Progressive Alliance, a coalition of several regional parties, formed the Indian government and was headed by Prime Minister Manmohan Singh. \n");
      out.write("As of July 2017, the party is in power in five states: Punjab, Himachal Pradesh, Karnataka, Meghalaya and Mizoram. \n");
      out.write("The Congress has previously directly ruled Andhra Pradesh, Tamil Nadu, Gujarat, Madhya Pradesh, Rajasthan, Uttar Pradesh and Goa.\n");
      out.write("\n");
      out.write("                                                   <br>   <br>  The Communist Party of India (CPI)is a communist party in India. \n");
      out.write("There are different views on exactly when the Communist Party of India was founded, but the date maintained as the foundation day by the CPI is 26 December 1925.\n");
      out.write("However, the Communist Party of India (Marxist), which separated from the CPI, has a different version that it was founded in 1920.  \n");
      out.write("            </b></td><td></td></tr>\n");
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
