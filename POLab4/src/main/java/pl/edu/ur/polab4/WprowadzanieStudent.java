/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.util.Scanner;

/**
 *
 * @author Boker
 */
public class WprowadzanieStudent {

    public static void main(String[] args) {

        Scanner wczytaj = new Scanner(System.in);

        System.out.print("Podaj imie: ");
        String imie = wczytaj.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = wczytaj.nextLine();

        System.out.print("Podaj nr albumu: ");
        int nr_albumu = wczytaj.nextInt();

        System.out.print("Podaj specjalnosci: ");
        String specjalnosci = wczytaj.next();

        System.out.print("Podaj rok studiow: ");
        int rok_studiow = wczytaj.nextInt();
        
        Student student1 = new Student(imie, nazwisko, nr_albumu, specjalnosci, rok_studiow);
        System.out.println("----------------------");
        student1.pokazDane();

    }
}
