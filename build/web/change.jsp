<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String vno=request.getParameter("rno");
String pre=request.getParameter("pre");
String changed=request.getParameter("changed");

String s="111";
        try{
         Class.forName("org.apache.derby.jdbc.ClientDriver");
    //Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/testing", "root", "");
    java.sql.Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/kcregist","kc","kc");
    java.sql.Statement st1 = con1.createStatement();
     s="222"  ;    
    int i=st1.executeUpdate("update kc.registration set address='"+changed+"' where vno='"+vno+"'");
      
    
   
           out.println("Data is successfully altered!");
 //response.sendRedirect("homepage.html");   
               }
        catch(Exception e){
        out.print(e+s);
        e.printStackTrace();
        }
       
        
        %>
