<%-- 
    Document   : newjsp
    Created on : Feb 23, 2023, 5:30:51 PM
    Author     : tester13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="index.html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            try{
                int x = Integer.parseInt(request.getParameter("first"));
                int y = Integer.parseInt(request.getParameter("second"));
                int z = x+y;
                out.println("Sum is "+z);
            }catch(Exception e){
                out.println("Sum is 0");
            }
            
        %>
        
    </body>
</html>
