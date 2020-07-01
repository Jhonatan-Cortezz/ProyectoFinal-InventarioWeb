
package Controller;

import DAO.LoginUsuario;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author JHONATAN CORTEZ
 */
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String correo = request.getParameter("txtUsername");
        String contra = request.getParameter("txtPassword");
        
        LoginUsuario loginU = new LoginUsuario();
        
        try {
            Usuario usuario = loginU.login(correo, contra);
            String pagina = "login.jsp";
            
            if (usuario != null) {
                String emial = usuario.getCorreo();
                String pass = usuario.getClave();
                String nombre = usuario.getNombre();
                String apellido = usuario.getApellido();
                
                String entrada = emial + pass;
                String nombreCompleto = nombre + apellido;
                String aleatorio = emial;
                HttpSession session = request.getSession();
                
                session.setAttribute("user", entrada);
                session.setAttribute("alea", aleatorio);
                session.setAttribute("name", nombre);
                pagina = "index.jsp";
            } else {
                String error = "Usuario o contraseña invalido";
                request.setAttribute("error", error);
            }
            
            RequestDispatcher dispatcher = request.getRequestDispatcher(pagina);
            dispatcher.forward(request, response);
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
