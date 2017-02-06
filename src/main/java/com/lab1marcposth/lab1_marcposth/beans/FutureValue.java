package com.lab1marcposth.lab1_marcposth.beans;

import java.util.Objects;

/**
 *
 * @author Marc
 */
public class FutureValue {

    private double paymentPerPeriod;
    private double rateOfInterest;
    private int termInYears;
    private String futureValue;

    public FutureValue() {
        paymentPerPeriod = 0;
        rateOfInterest = 0;
        termInYears = 0;
        futureValue = "";
    }

    public FutureValue(double paymentPerPeriod, double rateOfInterest, int termInYears) {
        this.paymentPerPeriod = paymentPerPeriod;
        this.rateOfInterest = rateOfInterest;
        this.termInYears = termInYears;
    }

    public double getPaymentPerPeriod() {
        return paymentPerPeriod;
    }

    public void setPaymentPerPeriod(double paymentPerPeriod) {
        this.paymentPerPeriod = paymentPerPeriod;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getTermInYears() {
        return termInYears;
    }

    public void setTermInYears(int termInYears) {
        this.termInYears = termInYears;
    }

    public String getFutureValue() {
        return futureValue;
    }

    public void setFutureValue(String futureValue) {
        this.futureValue = futureValue;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.paymentPerPeriod) ^ (Double.doubleToLongBits(this.paymentPerPeriod) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.rateOfInterest) ^ (Double.doubleToLongBits(this.rateOfInterest) >>> 32));
        hash = 53 * hash + this.termInYears;
        hash = 53 * hash + Objects.hashCode(this.futureValue);
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
        final FutureValue other = (FutureValue) obj;
        if (Double.doubleToLongBits(this.paymentPerPeriod) != Double.doubleToLongBits(other.paymentPerPeriod)) {
            return false;
        }
        if (Double.doubleToLongBits(this.rateOfInterest) != Double.doubleToLongBits(other.rateOfInterest)) {
            return false;
        }
        if (this.termInYears != other.termInYears) {
            return false;
        }
        if (!Objects.equals(this.futureValue, other.futureValue)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FutureValue{" + "paymentPerPeriod=" + paymentPerPeriod + ", rateOfInterest=" + rateOfInterest + ", termInYears=" + termInYears + ", futureValue=" + futureValue + '}';
    }

}
