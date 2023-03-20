<%-- 
    Document   : MovieJsp
    Created on : Feb 23, 2023, 6:22:26 PM
    Author     : tester13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.sql.*" %>
<%@page import = "java.sql.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
            
            
        
        <% 
            
            
            try{
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaDemoDatabase","test","password");
                PreparedStatement stmnt = conn.prepareStatement("Insert into Marvel values(?,?)");
                stmnt.setInt(1, id);
                stmnt.setString(2,name);
                stmnt.executeUpdate();
                out.println("Data is Added Successfully");
                
                //Retrieving data from database
                PreparedStatement fetch = conn.prepareStatement("Select * from Marvel");
                ResultSet rs = fetch.executeQuery();
                
        %>
        <h3>Data on the Database</h3>
                <table border="1">
                    <tr>
                        <td>Id</td>
                        <td>Name</td>
                    </tr>
        <%
            while(rs.next()){
            %>
            <tr>
                <td><%=rs.getInt("id") %></td><!-- comment -->
                <td><%=rs.getString("name") %></td><!-- comment -->
                
            </tr>
            <%
            }
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        %>
        </table>
    </body>
</html>
