package com.lab1marcposth.lab1_marcposth.beans;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Marc
 */
public class Loan implements Serializable {

    private double principal;
    private double rateOfInterest;
    private int term;
    private String monthlyPayment;

    public Loan() {
        principal = 0;
        rateOfInterest = 0;
        term = 0;
        monthlyPayment = "";
    }

    public Loan(double principal, double rateOfInterest, int term) {
        this.principal = principal;
        this.rateOfInterest = rateOfInterest;
        this.term = term;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public String getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(String monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.principal) ^ (Double.doubleToLongBits(this.principal) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.rateOfInterest) ^ (Double.doubleToLongBits(this.rateOfInterest) >>> 32));
        hash = 59 * hash + this.term;
        hash = 59 * hash + Objects.hashCode(this.monthlyPayment);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Loan other = (Loan) obj;
        if (Double.doubleToLongBits(this.principal) != Double.doubleToLongBits(other.principal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rateOfInterest) != Double.doubleToLongBits(other.rateOfInterest)) {
            return false;
        }
        if (this.term != other.term) {
            return false;
        }
        if (!Objects.equals(this.monthlyPayment, other.monthlyPayment)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Loan{" + "principal=" + principal + ", rateOfInterest=" + rateOfInterest + ", term=" + term + ", monthlyPayment=" + monthlyPayment + '}';
    }

}
