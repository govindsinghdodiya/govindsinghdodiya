import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class serverdemo14 extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
	PrintWriter out= response.getWriter();
	String s1= request.getParameter("u1");
	String s2= request.getParameter("u2");
	String s3= request.getParameter("u3");
	//tring s4= request.getParameter("ul");
	//String s5= request.getParameter("um");
	try 
	{	
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql:///RG","root","root");

		Statement st=con.createStatement();
		String s11= "insert into rg11 values('"+s1+"','"+s2+"','"+s3+"')";
				  st.executeUpdate(s11);

		out.println("Data Insert");
		con.close();
	}
	catch (Exception e)
	{
		out.println(e);
	}
	out.close();
}
	
}

//set classpath=C:\Program Files\Apache Software Foundation\Tomcat 8.5\lib\servlet-api.jar;.;%classpath%
