<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
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
       
        
        %>
