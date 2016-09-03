package com.pritesh.stock.Model;

/**
 * Created by Pritesh on 9/3/2016.
 */
public class Stocks{
    private double HUL;
    private double ITC;
    private double Tisco;
    private double Maruti;
    private double SBI;
    private double Rel;

    public Stocks() {
        HUL=0;
        ITC=0;
        Tisco=0;
        Maruti=0;
        SBI=0;
        Rel=0;
    }

    public double getHUL() {
        return HUL;
    }

    public void setHUL(double HUL) {
        this.HUL = HUL;
    }

    public double getITC() {
        return ITC;
    }

    public void setITC(double ITC) {
        this.ITC = ITC;
    }

    public double getMaruti() {
        return Maruti;
    }

    public void setMaruti(double maruti) {
        Maruti = maruti;
    }

    public double getRel() {
        return Rel;
    }

    public void setRel(double rel) {
        Rel = rel;
    }

    public double getSBI() {
        return SBI;
    }

    public void setSBI(double SBI) {
        this.SBI = SBI;
    }

    public double getTisco() {
        return Tisco;
    }

    public void setTisco(double tisco) {
        Tisco = tisco;
    }
}
