import Servlet.PatientDBHandler;
import Model.Patient;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewPatient extends HttpServlet {

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
        out.println("<a href='index.jsp'>Add Patient</a>");  
        out.println("<h1>Humber Patient List</h1>");  
          
        List<Patient> list=PatientDBHandler.getAllPatients();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Address</th><th>City</th><th>Doctor</th><th>Type</th><th>Update</th><th>Delete</th></tr>");  
        for(Patient p:list){  
         out.print("<tr><td>"+p.getId()+"</td><td>"+p.getName()+"</td><td>"+p.getEmail()+"</td><td>"+p.getAddress()+"</td><td>"+p.getCity()+"</td><td>"+p.getDoctor()+"</td><td>"+p.getType()+"</td><td><a href='UpdatePatient?id="+p.getId()+"'>Update</a></td><td><a href='DeletePatient?id="+p.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
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
