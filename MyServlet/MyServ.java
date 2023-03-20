/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyServlet;

/**
 *
 * @author tester13
 */
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.HttpServlet;

public class MyServ extends HttpServlet {
    public void service(ServletRequest req, ServletResponse res) throws ServletException,IOException{
        res.setContentType("Text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.println("First Servlet");
        out.println("</body></html>");
    }
}
