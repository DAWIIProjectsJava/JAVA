/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jikan
 */
public class CalculatorController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CalculatorController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
            double numero1 = Double.parseDouble(request.getParameter("num1"));
            double numero2 = Double.parseDouble(request.getParameter("num2"));
            Integer oper = Integer.parseInt(request.getParameter("oper"));
            double solution;
            
        switch (oper) {
            case 1:
                solution=(numero1+numero2);
                request.setAttribute("solution", solution);
                request.setAttribute("num1", numero1);
                request.setAttribute("num2", numero2);
                request.setAttribute("oper", oper);
                request.getRequestDispatcher("calcSolution.jsp").forward(request, response);
                break;
            case 2:
                request.setAttribute("num1", numero1);
                request.setAttribute("num2", numero2);
                request.setAttribute("oper", oper);
                solution=numero1-numero2;
                request.setAttribute("solution", solution);
                request.getRequestDispatcher("calcSolution.jsp").forward(request, response);
                break;
            case 3:
                request.setAttribute("num1", numero1);
                request.setAttribute("num2", numero2);
                request.setAttribute("oper", oper);
                solution=numero1*numero2;
                request.setAttribute("solution", solution);
                request.getRequestDispatcher("calcSolution.jsp").forward(request, response);
                break;
            case 4:
                request.setAttribute("num1", numero1);
                request.setAttribute("num2", numero2);
                request.setAttribute("oper", oper);
                
                if (numero1>numero2) {
                    solution=numero1/numero2;
                    request.setAttribute("solution", solution);
                    request.getRequestDispatcher("calcSolution.jsp").forward(request, response);
                } else  {
                    response.sendRedirect("errorcalc.jsp");
                }
                
                break;
            default:
                break;
        }
            
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
