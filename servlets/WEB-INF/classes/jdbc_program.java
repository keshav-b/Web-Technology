import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class jdbc_program extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String n=request.getParameter("name");
      String p=request.getParameter("pw");
      String q=request.getParameter("mail");
      try{       
            Class.forName("com.mysql.jdbc.Driver");              
   			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");             
 			PreparedStatement stmt=con.prepareStatement("insert into table1 values(?,?,?)");
 			stmt.setString(1,n);
 			stmt.setString(2,p);
 			stmt.setString(3,q);


 			int i = stmt.executeUpdate();
 			if(i>0){
 				out.println("you are successfully registered");
 			}
 		}
 		catch(Exception e2){
 			System.out.println(e2);
 		}
 		out.close();
 	}
 }
