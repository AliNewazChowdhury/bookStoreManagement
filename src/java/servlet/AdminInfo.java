/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.DataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Ishmam
 */

public class AdminInfo extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String pass =request.getParameter("password");
            
            DataAccess da= new DataAccess();
            ResultSet pw = da.getName(pass, email);
            
            if(pw.next()){
                HttpSession session = request.getSession(true);
                
                session.setAttribute("name",pw.getString("name"));
                Date createTime = new Date(session.getCreationTime());
                session.setAttribute("Date",createTime);
                // Get last access time of this web page.
                Date lastAccessTime = new Date(session.getLastAccessedTime());
                
                Integer visitCount = new Integer(0);
                String visitCountKey = new String("visitCount");
                String userIDKey = new String("userID");
                String userID = new String("ABCD");
                
                // Check if this is new comer on your web page.
                if (session.isNew()) {
                    
                    session.setAttribute(userIDKey, userID);
                } else {
                    visitCount = (Integer)session.getAttribute(visitCountKey);
                    visitCount = visitCount + 1;
                    userID = (String)session.getAttribute(userIDKey);
                }
                session.setAttribute(visitCountKey,  visitCount);
                response.sendRedirect("/LibraryManagement/DashBoard.jsp");
            }
            else{
                response.sendRedirect("/LibraryManagement/login.html");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        

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
