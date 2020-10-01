import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PostRequest extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		String dept=req.getParameter("dp");
		
		PrintWriter pw=resp.getWriter();
		pw.println("<html><body bgcolor='yellow'>"
				+ "<h1>student details are:"+name+"</h1>");
		
		Connection con=null;
		PreparedStatement ps=null;
		String inqry="insert into user.information values(?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			ps=con.prepareStatement(inqry);
			ps.setString(1, name);
			ps.setString(2, place);
			ps.setString(3, dept);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if(ps!=null)
			{
				try 
				{
					ps.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try 
				{
					con.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}	
	}
}
