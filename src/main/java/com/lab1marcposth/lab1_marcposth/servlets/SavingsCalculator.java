package com.lab1marcposth.lab1_marcposth.servlets;

import com.lab1marcposth.lab1_marcposth.beans.Savings;
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
@WebServlet(name = "SavingsCalculator", urlPatterns = {"/SavingsCalculator"})
public class SavingsCalculator extends HttpServlet {

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
        String targetAmountString = request.getParameter("targetAmount");
        String rateOfInterestString = request.getParameter("rateOfInterest");
        String termInYearsString = request.getParameter("termInYears");

        //Converting the Strings to their appropriate types to pass to the object
        double targetAmount = Double.parseDouble(targetAmountString);
        double rateOfInterest = Double.parseDouble(rateOfInterestString);
        double termInYears = Double.parseDouble(termInYearsString);

        //Create the bean instance with the user inputted data
        Savings savings = new Savings(targetAmount, rateOfInterest, termInYears);

        //Calculating the result of the  savings
        double savingsResult = this.calculateSavings(savings);

        //Setting the currency format to Canada
        NumberFormat CAFormat = NumberFormat.getCurrencyInstance(Locale.CANADA);

        //Setting the monthly Payment as a formatted currency onto the bean 
        savings.setMonthlyPayment(CAFormat.format(savingsResult));

        //Attaching the bean with the information onto the payload to forward
        request.setAttribute("savings", savings);
  
        //Forward the information to the results page
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
    
    
    private Double calculateSavings(Savings savings) {

        //Setting up the values for the  savings calculation
        double rate = (savings.getRateOfInterest() / 100);
        double n = savings.getTermInYears() * 12;
        double futureValue = savings.getTargetAmount();
        
        double result = futureValue * (rate / ((Math.pow((1+rate), n)) -1));
        
        //Returning the future value savings amount
        return result;
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
            out.println("<title>Servlet SavingsCalculator</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SavingsCalculator at " + request.getContextPath() + "</h1>");
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
