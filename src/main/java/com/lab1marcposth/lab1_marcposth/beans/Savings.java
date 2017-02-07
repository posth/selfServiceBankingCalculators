package com.lab1marcposth.lab1_marcposth.beans;

import java.util.Objects;

/**
 *
 * @author Marc
 */
public class Savings {

    private double targetAmount;
    private double rateOfInterest;
    private double termInYears;
    private String monthlyPayment;

    public Savings() {
        targetAmount = 0;
        rateOfInterest = 0;
        termInYears = 0;
        monthlyPayment = "";
    }

    public Savings(double targetAmount, double rateOfInterest, double termInYears) {
        this.targetAmount = targetAmount;
        this.rateOfInterest = rateOfInterest;
        this.termInYears = termInYears;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getTermInYears() {
        return termInYears;
    }

    public void setTermInYears(double termInYears) {
        this.termInYears = termInYears;
    }

    public String getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(String monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.targetAmount) ^ (Double.doubleToLongBits(this.targetAmount) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.rateOfInterest) ^ (Double.doubleToLongBits(this.rateOfInterest) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.termInYears) ^ (Double.doubleToLongBits(this.termInYears) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.monthlyPayment);
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
        final Savings other = (Savings) obj;
        if (Double.doubleToLongBits(this.targetAmount) != Double.doubleToLongBits(other.targetAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rateOfInterest) != Double.doubleToLongBits(other.rateOfInterest)) {
            return false;
        }
        if (Double.doubleToLongBits(this.termInYears) != Double.doubleToLongBits(other.termInYears)) {
            return false;
        }
        if (!Objects.equals(this.monthlyPayment, other.monthlyPayment)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Savings{" + "targetAmount=" + targetAmount + ", rateOfInterest=" + rateOfInterest + ", termInYears=" + termInYears + ", monthlyPayment=" + monthlyPayment + '}';
    }

}
