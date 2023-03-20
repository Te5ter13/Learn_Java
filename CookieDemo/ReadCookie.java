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

public class ReadCookie extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie[] ck = request.getCookies();
        if(ck != null){
            out.println("Hello "+ck[0].getValue());
        }
    }
}
