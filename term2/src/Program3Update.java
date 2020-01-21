import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/Program3Update")
public class Program3Update extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        String name=request.getParameter("uname");
        long addharId=Long.parseLong(request.getParameter("aid"));
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cname=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            PreparedStatement ps=cname.prepareStatement("update program set addhar_id =? where user_name=?");
            ps.setLong(1, addharId);
            ps.setString(2, name);
            int result=ps.executeUpdate();
            if(result>0)
            {
                cname.commit();
                PrintWriter out=response.getWriter();
                out.println("Updation done "+addharId);
                
            }
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        }
        
        catch(SQLException s)
        {
            System.out.println(s);
        }
    }
}
