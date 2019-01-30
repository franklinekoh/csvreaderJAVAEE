package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Cellulant - life is mobile</title>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <meta name=\"viewport\"  />\n");
      out.write("    <!-- Latest compiled and minified CSS for bootstrap-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"assets/fa/css/font-awesome.css\">\n");
      out.write("    <!--Custom css links-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/custom.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/component.css\">\n");
      out.write("    <title>Cellulant - life is mobile</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:400,500,700,300\">\n");
      out.write("</head>\n");
      out.write("<body class=\"body\">\n");
      out.write("<div class=\"container-fluid\" style=\"background-color: #ffffff\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <!--nav start-->\n");
      out.write("        <nav class=\"navbar navbar-default\" role=\"navigation\" style=\"background: #ffffff; border: 0px !important;\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\" id=\"brand\"><img src=\"assets/images/logo.png\" style=\"height: 30px;\"></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("    <!--nav end-->\n");
      out.write("</div>\n");
      out.write("<!--Main content-->\n");
      out.write("<div class=\"main\">\n");
      out.write("        <h1>Restricted Access!</h1>\n");
      out.write("        ");
String msg = (String) request.getAttribute("msg");
      out.write("   \n");
      out.write(" ");
if (msg != null) {
      out.write("\n");
      out.write("             <div  class=\"alert alert-success\">\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss =\"alert\" aria-hidden=\"true\">&times;</button>\n");
      out.write("           ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            </div>\n");
      out.write("     ");
 }
      out.write("\n");
      out.write("    <h2 style=\"color:#00d5ea; margin-left: 30px;\">Upload XLS file</h2>\n");
      out.write("\n");
      out.write("    <div class=\" col-md-12\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("            <div class=\"panel-heading\"><i class=\"fa fa-balance-scale fa-2x\" style=\"margin-right: 410px;\"></i></div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("                <form method=\"post\" action=\"uploadCsv\" enctype=\"multipart/form-data\">\n");
      out.write("            <div class=\"form-group box js\">\n");
      out.write("                <label class=\"btn btn-default btn-sm center-block btn-file\">\n");
      out.write("                    <i class=\"fa fa-upload fa-4x\" aria-hidden=\"true\"></i>\n");
      out.write("                    <input type=\"file\" name=\"name\" value=\"\" required=\"\">\n");
      out.write("                    \n");
      out.write("                </label>\n");
      out.write("                <button type=\"submit\" id=\"balancesubmit\" class=\"btn-group btn btn-default \">Submit</button>\n");
      out.write("            </div>\n");
      out.write("               </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("<!--    <div class=\"checkbalancepanel col-md-5\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("            <div class=\"panel-heading\"><i class=\"fa fa-cogs fa-2x\" style=\"margin-left: 470px;\"></i></div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("                <form method=\"post\" action=\"\" enctype=\"multipart/form-data\">\n");
      out.write("                    <div class=\"form-group box js\" >\n");
      out.write("\n");
      out.write("                        <label class=\"btn btn-default btn-sm center-block btn-file\">\n");
      out.write("                            <i class=\"fa fa-upload fa-4x\" aria-hidden=\"true\"></i>\n");
      out.write("                            <input type=\"file\" name=\"reset_document\" style=\"\" required>\n");
      out.write("                        </label>\n");
      out.write("                        <button type=\"submit\" id=\"pinsubmit\" class=\"btn-group btn btn-default \">Submit</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>-->\n");
      out.write("    <!--<vr />-->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!--end of main content-->\n");
      out.write("<section>\n");
      out.write("    <footer id=\"footer\">\n");
      out.write("        <div class=\"row \" style=\"margin-left: 150px; margin-right: 150px; font-size: 12px;\" >\n");
      out.write("            <div class=\"col-md-2\">\n");
      out.write("                <a href=\"\"><img src=\"assets/images/inspired.png\" style=\"margin-top: 32px; margin-left: 20px; margin-bottom: 20px; height: 30px; width: 130px;\" ></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-8\" >\n");
      out.write("                <p style=\"margin-left: 60px; margin-top: 25px; \"> &copy; 2017 Cellulant Nigeria Limited. All Rights Reserved | <a href=\"https://www.tingg.com.ng/privacy-policy.jsp\"> Privacy Policy</a> | <a href=\"https://www.tingg.com.ng/code-of-practice.jsp\"> Code of practice</a></p>\n");
      out.write("                <p style=\"font-size: 10px; margin-left: 25px; color: #00d5ea\">Cellulant is wallet licenced and regulated by central bank of Nigeria(CBN) to provide mobile payment service</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-2\">\n");
      out.write("                <a href=\"https://play.google.com/store/apps/details?id=com.cellulant.wallet\"><img src=\"assets/images/googleplay.png\" style=\"height: 100px; width: 120px\"></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</body>\n");
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
