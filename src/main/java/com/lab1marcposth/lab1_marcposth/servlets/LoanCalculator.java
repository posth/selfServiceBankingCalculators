package com.lab1marcposth.lab1_marcposth.servlets;

import com.lab1marcposth.lab1_marcposth.beans.Loan;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marc
 */
@WebServlet(name = "LoanCalculator", urlPatterns = {"/LoanCalculator"})
public class LoanCalculator extends HttpServlet {

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
        
        String url = "/calculator_result.jsp";
        
        //Grabbing the information from the form in the calculator_choice.jsp file
        String principalString = request.getParameter("principal");
        String rateOfInterestString = request.getParameter("rateOfInterest");
        String termString = request.getParameter("term");
        
        //Converting the Strings to their appropriate types to pass to the object
        double principal = Double.parseDouble(principalString);
        double rateOfInterest = Double.parseDouble(rateOfInterestString);
        Integer term = Integer.parseInt(termString);
        
        //Create the bean instance with the user inputted data
        Loan loan = new Loan(principal, rateOfInterest, term);
        
        //Get calculated monthly payment of the loan and place it into the bean
        double monthlyPaymentCalculated = this.calculateLoan(loan);
        
        //Setting the currency format to Canada
        NumberFormat CAFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);
        
        //Setting the monthly Payment as a formatted currency onto the bean 
        loan.setMonthlyPayment(CAFormat.format(monthlyPaymentCalculated));
        
        //Attaching the bean with the information onto the payload to forward
        request.setAttribute("loan", loan);
        
        //Forward the information to the results page
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request,response);
    }
    
    private Double calculateLoan(Loan loan) {
        
        //Setting up the values for the monthly payment calculation
        double rate = loan.getRateOfInterest() / 12;
        Integer n = loan.getTerm();
        double presentValue = loan.getPrincipal();
        
        //Returning the monthly payment
        return presentValue * (rate / (1 - (Math.pow((1+rate), -n))));
    }

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
            out.println("<title>Servlet LoanCalculator</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoanCalculator at " + request.getContextPath() + "</h1>");
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
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
