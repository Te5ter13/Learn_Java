/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CookieDemo;

/**
 *
 * @author tester13
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ServletCookie extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        out.print("Welcome "+name);
        Cookie cookie = new Cookie("name",name);
        cookie.setMaxAge(60*60*24);
        response.addCookie(cookie);
        
        //add go button for reading
        
        out.print("<form action='readcookie' method='post'>");
        out.print("<input type='submit' value='Submit'>");
        out.print("</form>");
        
    }
    
}