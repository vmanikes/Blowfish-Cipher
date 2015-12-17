<%-- 
    Document   : login
    Created on : Oct 17, 2013, 10:30:36 PM
    Author     : krishna
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<% String oname=request.getParameter("rnumber");
String s="111";
    try {
		Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/kcregist","kc","kc");
                Statement stmt=conn.createStatement();
                s="222";
                %>
                  <table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td><b>VEHICLE NUMBER</b></td>
<td><b>NUMBER OF WHEELS</b></td>
<td><b>VEHICLE TYPE</b></td>
<td><b>LICENSE NO:</b></td>
<td><b>OWNER'S EMAIL ID</b></td>
<td><b>OWNER'S PHONE NUMBER</b></td>
<td><b>OWNER'S ADDRESS</b></td>
</tr>
                <%
                String sql="select * from registration where name='"+oname+"'";
                ResultSet rs=stmt.executeQuery(sql);
                while(rs.next()){%>
                     <tr bgcolor="#DEB887">
                    <td><%=rs.getString("vno")%></td>
                    <td><%=rs.getString("nwheels")%></td>
                    <td><%=rs.getString("type")%></td>
                    <td><%=rs.getString("lic")%></td>
                   <td><%=rs.getString("email")%></td>
                    <td><%=rs.getString("phno")%></td>
                    <td><%=rs.getString("address")%></td>
                    </tr>
                    <%
                }
       }
   catch(Exception e){
        out.print(e+s);
        e.printStackTrace();
        }

   %></table>