package com.entego.example;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	String name = "Oleg Borman";
        System.out.println(" klient se jmenuje " +name);

    int number_of_purchases = 15;
        System.out.println(" Tento vyrobek si koupilo " +number_of_purchases +" zakazniku ");

    String city = "London";
        System.out.println(" Firma sidli ve meste " +city);

    int spotreba = 15;
        System.out.println(" Automobil spotrebuje na 100km " +spotreba +"litru benzinu");

    int kabel = 300;
        System.out.println(" Na sklade je " +kabel +" metru kabelu UTP ");

        LocalDate narozeni = LocalDate.of(1993,9,29);
        System.out.println(" Klinet se narodil " + narozeni);

    String spz = "123 ABV";
        System.out.println(spz);

    double IP1 = 192.168;
    double IP2 = 48.39;

        System.out.println(" IP adresa je " + IP1 + (".") + IP2);






    }
}
