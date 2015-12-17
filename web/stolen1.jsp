<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String vno=request.getParameter("rno");
String day=request.getParameter("day");
String month=request.getParameter("month");
String year=request.getParameter("year");
String place=request.getParameter("place");
String s="111";
        try{
         Class.forName("org.apache.derby.jdbc.ClientDriver");
    //Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/testing", "root", "");
    java.sql.Connection con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/kcregist","kc","kc");
    java.sql.Statement st1 = con1.createStatement();
     s="222"  ;    
    int i=st1.executeUpdate("insert into kc.stolen(vno,dat,mont,yea,place) values('"+vno+"','"+day+"','"+month+"','"+year+"','"+place+"')");
      
    
   
           out.println("Data is successfully inserted!");
 //response.sendRedirect("homepage.html");   
               }
        catch(Exception e){
        out.print(e+s);
        e.printStackTrace();
        }
       
        
        %>
