/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Patient;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WIllyRivey
 */
public class PatientDetails2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        {
            
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
        processRequest(request, response);
        
        PrintWriter out=response.getWriter();
        
        String sid=request.getParameter("id");
        int id=Integer.parseInt(sid);
        String name = request.getParameter("name");
        
        Patient p = new Patient();
        p.setName(name);
        
        int status = PatientDBHandler.update(p);
        if(status>0) {
            response.sendRedirect("ViewPatient?page=1");        
        }else{
            out.println("Sorry! unable to update the patient's data");
        }
        out.close();
    }
    
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
