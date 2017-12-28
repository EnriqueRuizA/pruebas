
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Redireccionamiento")
public class Redireccionamiento extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Redireccionamiento() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          for (int i=0;i<users.length;i++){
		    if(users[i].getUsername.equals(user.input)){
		      if(users[i].getPassword.equals(password.input)){
		        String dire=request.getParameter("http://wwww.google.com");
        		response.sendRedirect(dire);
		    }else{
		        System.out.println("password incorrecto");
		      }
		    }else if(users[i].getPassword.equals(password.input)){
		        System.out.println("user incorrecto");
		    }
         }
    }
        String dire=request.getParameter("http://wwww.google.com");
        response.sendRedirect(dire);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}
