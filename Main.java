package com.company;

public class Main {

    public static void main(String[] args) {

        GeoTvar ctverec = new GeoTvar("CTVEREC", 5, 0, 0, 0, 0, 0);
        GeoTvar obdelnik = new GeoTvar("OBDELNIK", 3, 3, 0, 0, 0, 0);
        GeoTvar kruh = new GeoTvar("KRUH", 0, 0, 0, 0, 0, 2.3);
        GeoTvar trojuhelnik = new GeoTvar("TROJUHELNIK", 4, 5, 6, 3, 4, 0);

    System.out.println("Obvod tělesa "+ GeoTvar.obdelnik +  " je " + vypocitejObvod(obdelnik));
    System.out.println("Obsah tělesa "+ GeoTvar.obdelnik +  " je " + vypocitejObsah(obdelnik));

    }
}
