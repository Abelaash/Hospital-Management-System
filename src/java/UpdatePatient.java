import Servlet.PatientDBHandler;
import Model.Patient;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdatePatient extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
         PrintWriter out=response.getWriter();  
        out.println("<h1>Update Patient</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        Patient p=PatientDBHandler.getPatientById(id);  
          
        out.print("<form action='UpdatePatient2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+p.getId()+"'/></td></tr>");  
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+p.getName()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+p.getEmail()+"'/></td></tr>");  
        out.print("<tr><td>Address:</td><td><input type='text' name='address' value='"+p.getAddress()+"'/></td></tr>");
        out.print("<tr><td>City:</td><td><input type='text' name='city' value='"+p.getCity()+"'/></td></tr>");
        out.print("<tr><td>Doctor Available:</td><td>");  
        out.print("<select name='doctorid' style='width:150px'>");  
        out.print("<option>Charlie Parks</option>");  
        out.print("<option>Patricia Hawkins</option>");  
        out.print("<option>Marc Williams</option>");  
        out.print("<option>Rosalee Loper</option>");  
        out.print("</select>");  
        out.print("</td></tr>");
        out.print("<tr><td>Reason for Visit:</td><td>");  
        out.print("<select name='type' style='width:150px'>");  
        out.print("<option>Common cold</option>");  
        out.print("<option>Insomnia</option>");  
        out.print("<option>Food poisoning</option>");  
        out.print("<option>Coronavirus (COVID-19)</option>");  
        out.print("</select>");  
        out.print("</td></tr>");
        out.print("<tr><td colspan='2'><input type='submit' value='Update'/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
