package com.mycompany.calculator.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Connor
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        String num1S = "";
        String num2S = "";
        try {
            num1S = request.getParameter("arith1");
            num2S = request.getParameter("arith2");
            int num1I = Integer.parseInt(num1S);
            int num2I = Integer.parseInt(num2S);
            String operator = request.getParameter("submit");
            int result = 0;
            if (operator.equals("+")) {
                result = num1I + num2I;
            } else if (operator.equals("-")) {
                result = num1I - num2I;
            } else if (operator.equals("*")) {
                result = num1I * num2I;
            } else if (operator.equals("%")) {
                result = num1I % num2I;
            }
            request.setAttribute("message", result);
        } catch(Exception ex) {
            request.setAttribute("message", "invalid");
        }
        request.setAttribute("arith1", num1S);
        request.setAttribute("arith2", num2S);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
