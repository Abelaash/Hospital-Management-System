package Servlet;

import Model.Doctor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewDoctor extends HttpServlet {

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
        out.println("<a href='index2.jsp'>Add Doctor</a>");  
        out.println("<h1>Humber Doctor List</h1>");  
          
        List<Doctor> list=DoctorDBHandler.getAllDoctors();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Name</th><th>Email</th><th>Office</th><th>Phone</th><th>Update</th><th>Delete</th></tr>");  
        for(Doctor d:list){  
         out.print("<tr><td>"+d.getId()+"</td><td>"+d.getName()+"</td><td>"+d.getEmail()+"</td><td>"+d.getOffice()+"</td><td>"+d.getPhone()+"</td><td><a href='UpdateDoctor?id="+d.getId()+"'>Update</a></td><td><a href='DeleteDoctor?id="+d.getId()+"'>delete</a></td></tr>");  
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
