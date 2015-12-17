<%-- 
    Document   : login
    Created on : Oct 17, 2013, 10:30:36 PM
    Author     : krishna
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<% String uname=request.getParameter("username");
   String pass=request.getParameter("hiddenField");
   try {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/kcregist","kc","kc");
                Statement stmt=conn.createStatement();
                String sql="select * from kc.adminlogin where username='"+uname+"'and password='"+pass+"'";
                ResultSet rs=stmt.executeQuery(sql);
                if(rs.next()){
                    response.sendRedirect("Tracing.html");
                                       }
                               else{
                    response.sendRedirect("adminlogin.html");
                              
                         }
                }
    catch(ClassNotFoundException e){
        System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
                out.println(e);
		return;
        }
    catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
                out.println(e);
		return;
                   }
    %>