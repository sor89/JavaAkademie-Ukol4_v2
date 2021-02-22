package com.company;

public class GeoTvar {
    public String tvar;
    public double a = 0;
    public double b;
    public double c;
    public double z;
    public double v;
    public double pi = 3.14;
    public double r;

    // contruktor
    public GeoTvar(String tvar, double a, double b, double c, double z, double v, double r) {
        this.tvar = tvar;
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = z;
        this.v = v;
        this.r = r;
    }
    //metody
        //Obvod
    public double vypocetObvodu(String tvar, double a, double b, double c, double z, double v, double pi, double r) {
        this.tvar = tvar;
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = z;
        this.v = v;
        this.pi = pi;
        this.r = r;

        return switch (tvar) {

            case "OBDELNIK"  -> (a * b );
            case "CTVEREC" -> (a * a);
            case "TROJUHELNIK" -> ((v * z)/2);
            case "KRUH" ->  (pi * r * r);
            default -> throw new RuntimeException("Spatny tvar");
        };

    }

    //obsah
    public double vypocetObsahu(String tvar, double a, double b, double c, double z, double v, double pi, double r) {
            this.tvar = tvar;
            this.a = a;
            this.b = b;
            this.c = c;
            this.z = z;
            this.v = v;
            this.pi = pi;
            this.r = r;

        return switch (tvar) {

            case "OBDELNIK" -> (a * b );
            case "CTVEREC" -> (a * a );
            case "TROJUHELNIK" -> ((v * z)/2);
            case "KRUH" ->  (pi * r * r);
            default -> throw new RuntimeException("Spatny tvar");
        };
    }


    //settery a gettery


    public String getTvar() {
        return tvar;
    }

    public void setTvar(String tvar) {
        this.tvar = tvar;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
