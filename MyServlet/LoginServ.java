 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyServlet;

/**
 *
 * @author tester13
 */
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class LoginServ extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("userName");
        String password = request.getParameter("userPass");
        if(password.equals("servlet")){
            RequestDispatcher rd = request.getRequestDispatcher("/servlet2");
            rd.forward(request, response);
        }
        else{
            out.print("Username or password errror");
            RequestDispatcher rd = request.getRequestDispatcher("/index.html");
            rd.include(request, response);
            
        }
    }
}
