package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class duplicate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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

      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<!-- TemplateBeginEditable name=\"doctitle\" -->\n");
      out.write("<title>Duplicate Registration</title>\n");
      out.write("<!-- TemplateEndEditable -->\n");
      out.write("<!-- TemplateBeginEditable name=\"head\" -->\n");
      out.write("<!-- TemplateEndEditable -->\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("\tfont: 100%/1.4 Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("\tbackground-color: #42413C;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tcolor: #000;\n");
      out.write("}\n");
      out.write("/* ~~ Element/tag selectors ~~ */\n");
      out.write("ul, ol, dl { /* Due to variations between browsers, it's best practices to zero padding and margin on lists. For consistency, you can either specify the amounts you want here, or on the list items (LI, DT, DD) they contain. Remember that what you do here will cascade to the .nav list unless you write a more specific selector. */\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("}\n");
      out.write("h1, h2, h3, h4, h5, h6, p {\n");
      out.write("\tmargin-top: 0;\t /* removing the top margin gets around an issue where margins can escape from their containing block. The remaining bottom margin will hold it away from any elements that follow. */\n");
      out.write("\tpadding-right: 15px;\n");
      out.write("\tpadding-left: 15px; /* adding the padding to the sides of the elements within the blocks, instead of the block elements themselves, gets rid of any box model math. A nested block with side padding can also be used as an alternate method. */\n");
      out.write("}\n");
      out.write("a img { /* this selector removes the default blue border displayed in some browsers around an image when it is surrounded by a link */\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write("/* ~~ Styling for your site's links must remain in this order - including the group of selectors that create the hover effect. ~~ */\n");
      out.write("a:link {\n");
      out.write("\tcolor: #42413C;\n");
      out.write("\ttext-decoration: underline; /* unless you style your links to look extremely unique, it's best to provide underlines for quick visual identification */\n");
      out.write("}\n");
      out.write("a:visited {\n");
      out.write("\tcolor: #6E6C64;\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("}\n");
      out.write("a:hover, a:active, a:focus { /* this group of selectors will give a keyboard navigator the same hover experience as the person using a mouse. */\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("/* ~~ This fixed width container surrounds all other blocks ~~ */\n");
      out.write(".container {\n");
      out.write("\twidth: 960px;\n");
      out.write("\tbackground-color: #FFFFFF;\n");
      out.write("\tmargin: 0 auto; /* the auto value on the sides, coupled with the width, centers the layout */\n");
      out.write("}\n");
      out.write("/* ~~ The header is not given a width. It will extend the full width of your layout. ~~ */\n");
      out.write("header {\n");
      out.write("\tbackground-color: #ADB96E;\n");
      out.write("}\n");
      out.write("/* ~~ These are the columns for the layout. ~~ \n");
      out.write("\n");
      out.write("1) Padding is only placed on the top and/or bottom of the block elements. The elements within these blocks have padding on their sides. This saves you from any \"box model math\". Keep in mind, if you add any side padding or border to the block itself, it will be added to the width you define to create the *total* width. You may also choose to remove the padding on the element in the block element and place a second block element within it with no width and the padding necessary for your design.\n");
      out.write("\n");
      out.write("2) No margin has been given to the columns since they are all floated. If you must add margin, avoid placing it on the side you're floating toward (for example: a right margin on a block set to float right). Many times, padding can be used instead. For blocks where this rule must be broken, you should add a \"display:inline\" declaration to the block element's rule to tame a bug where some versions of Internet Explorer double the margin.\n");
      out.write("\n");
      out.write("3) Since classes can be used multiple times in a document (and an element can also have multiple classes applied), the columns have been assigned class names instead of IDs. For example, two sidebar blocks could be stacked if necessary. These can very easily be changed to IDs if that's your preference, as long as you'll only be using them once per document.\n");
      out.write("\n");
      out.write("4) If you prefer your nav on the left instead of the right, simply float these columns the opposite direction (all left instead of all right) and they'll render in reverse order. There's no need to move the blocks around in the HTML source.\n");
      out.write("\n");
      out.write("*/\n");
      out.write(".sidebar1 {\n");
      out.write("\tfloat: right;\n");
      out.write("\twidth: 180px;\n");
      out.write("\n");
      out.write("\tpadding-bottom: 10px;\n");
      out.write("}\n");
      out.write(".content {\n");
      out.write("\tpadding: 10px 0;\n");
      out.write("\twidth: 780px;\n");
      out.write("\tfloat: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ~~ This grouped selector gives the lists in the .content area space ~~ */\n");
      out.write(".content ul, .content ol {\n");
      out.write("\tpadding: 0 15px 15px 40px; /* this padding mirrors the right padding in the headings and paragraph rule above. Padding was placed on the bottom for space between other elements on the lists and on the left to create the indention. These may be adjusted as you wish. */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ~~ The navigation list styles (can be removed if you choose to use a premade flyout menu like Spry) ~~ */\n");
      out.write("ul.nav {\n");
      out.write("\tlist-style: none; /* this removes the list marker */\n");
      out.write("\tborder-top: 1px solid #666; /* this creates the top border for the links - all others are placed using a bottom border on the LI */\n");
      out.write("\tmargin-bottom: 15px; /* this creates the space between the navigation on the content below */\n");
      out.write("}\n");
      out.write("ul.nav li {\n");
      out.write("\tborder-bottom: 1px solid #666; /* this creates the button separation */\n");
      out.write("}\n");
      out.write("ul.nav a, ul.nav a:visited { /* grouping these selectors makes sure that your links retain their button look even after being visited */\n");
      out.write("\tpadding: 5px 5px 5px 15px;\n");
      out.write("\tdisplay: block; /* this gives the link block properties causing it to fill the whole LI containing it. This causes the entire area to react to a mouse click. */\n");
      out.write("\twidth: 160px;  /*this width makes the entire button clickable for IE6. If you don't need to support IE6, it can be removed. Calculate the proper width by subtracting the padding on this link from the width of your sidebar container. */\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tbackground-color: #C6D580;\n");
      out.write("}\n");
      out.write("ul.nav a:hover, ul.nav a:active, ul.nav a:focus { /* this changes the background and text color for both mouse and keyboard navigators */\n");
      out.write("\tbackground-color: #ADB96E;\n");
      out.write("\tcolor: #FFF;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ~~ The footer ~~ */\n");
      out.write("footer {\n");
      out.write("\tpadding: 10px 0;\n");
      out.write("\tbackground-color: #CCC49F;\n");
      out.write("\tposition: relative;/* this gives IE6 hasLayout to properly clear */\n");
      out.write("\tclear: both; /* this clear property forces the .container to understand where the columns end and contain them */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*HTML 5 support - Sets new HTML 5 tags to display:block so browsers know how to render the tags properly. */\n");
      out.write("header, section, footer, aside, article, figure {\n");
      out.write("\tdisplay: block;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style><!--[if lt IE 9]>\n");
      out.write("<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("<![endif]--></head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <header>\n");
      out.write("    <a href=\"#\"><img src=\"prjc.jpg\" alt=\"Insert Logo Here\" width=\"960\" height=\"92\" id=\"Insert_logo\" style=\"background-color: #C6D580; display:block;\" /></a>\n");
      out.write("  </header>\n");
      out.write("  <div class=\"sidebar1\">\n");
      out.write("    <ul class=\"nav\">\n");
      out.write("       <li><a href=\"mainpage.HTML\">Home page</a></li>\n");
      out.write("      <li><a href=\"NewRegistration.html\">New Registration</a></li>\n");
      out.write("      <li><a href=\"DuplicateRegistration.html\">Duplicate Registration</a></li>\n");
      out.write("      <li><a href=\"ChangeOfRegistration.html\">Change Of Address</a></li>\n");
      out.write("      <li><a href=\"Stolen.html\">Stolen Vehicle</a></li>\n");
      out.write("      <li><a href=\"Tracing.html\">Tracing Vehicle</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <aside>\n");
      out.write("      <p>&nbsp;</p>\n");
      out.write("</aside>\n");
      out.write("  <!-- end .sidebar1 --></div>\n");
      out.write("  <article class=\"content\">\n");
      out.write("    <h1>&nbsp;</h1>\n");
      out.write("    \n");
      out.write("     <form method=\"post\" action=\"dreg.jsp\" name=\"duplicate form\">\n");
      out.write("<h1 align=\"center\"><u>DUPLICATE REGISTRATION</u></h1>\n");
      out.write("<table align=\"center\">\n");
      out.write("<tr>\n");
      out.write("<th>Enter Your Name As In Registration Form</th>\n");
      out.write("<td><input type=\"text\" name=\"rnumber\" id=\"rnumber\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\" align=\"center\"><input type=\"submit\" value=\"submit\"/></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <section>\n");
      out.write("      <h2>&nbsp;</h2>\n");
      out.write("    </section>\n");
      out.write("    <section> </section>\n");
      out.write("    <!-- end .content --></article>\n");
      out.write("  <footer>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("  </footer>\n");
      out.write("  <!-- end .container --></div>\n");
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
