package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class new_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String vno=request.getParameter("vno");
String nwheels=request.getParameter("nwheels");
String vtype=request.getParameter("model");
String rtono=request.getParameter("rtono");
String owname=request.getParameter("oname"); 
String email=request.getParameter("email");
String phno=request.getParameter("phone"); 
String owaddr=request.getParameter("addr");
String s="111";
        try{
         Class.forName("org.apache.derby.jdbc.ClientDriver");
    //Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/testing", "root", "");
    java.sql.Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/kcregist","kc","kc");
    java.sql.Statement st1 = con1.createStatement();
     s="222"  ;    
    int i=st1.executeUpdate("insert into kc.registration(vno,nwheels,type,lic,name,email,phno,address) values('"+vno+"','"+nwheels+"','"+vtype+"','"+rtono+"','"+owname+"','"+email+"','"+phno+"','"+owaddr+"')");
    out.println("Data is successfully inserted!");
 //response.sendRedirect("homepage.html");  
   
   
    
               }
        catch(Exception e){
        out.print(e+s);
        e.printStackTrace();
        }
       
        
        
      out.write('\n');
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
