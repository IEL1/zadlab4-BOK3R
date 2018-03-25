/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import java.util.Scanner;

/**
 *
 * @author Boker
 */
public class Figury {

    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);

        System.out.println("Kalkulator figur geometrycznych");
        System.out.println("Wybierz figurę:");
        System.out.println("1 - Kolo");
        System.out.println("2 - Kwadrat");
        System.out.println("3 - Prostokat");
        System.out.println("4 - Szescian");
        System.out.println("5 - Prostopadloscian");
        System.out.println("6 - Kula");
        System.out.println("7 - Stozek");
        System.out.print("Wybierz numer figury: ");
        int liczba = wczytaj.nextInt();

        switch (liczba) {
            case 1:
                System.out.println("\nWybrano kolo");
                System.out.print("Podaj promien kola: ");
                int promien = wczytaj.nextInt();
                Kolo kolo1 = new Kolo(promien);
                kolo1.Oblicz();
                kolo1.PokazDane();
                break;
            case 2:
                System.out.println("\nWybrano kwadrat");
                System.out.print("Podaj dlugosc boku: ");
                int a = wczytaj.nextInt();
                Kwadrat kwadrat1 = new Kwadrat(a);
                kwadrat1.Oblicz();
                kwadrat1.PokazDane();
                break;
            case 3:
                System.out.println("\nWybrano prostokat");
                System.out.print("Podaj dlugosc pierwszego boku: ");
                int b = wczytaj.nextInt();
                System.out.print("Podaj dlugosc drugiego boku: ");
                int c = wczytaj.nextInt();
                Prostokat prostokat1 = new Prostokat(b, c);
                prostokat1.Oblicz();
                prostokat1.PokazDane();
                break;
            case 4:
                System.out.println("\nWybrano szescian");
                System.out.print("Podaj dlugosc krawedzi: ");
                int d = wczytaj.nextInt();
                Szescian szescian1 = new Szescian(d);
                szescian1.Oblicz();
                szescian1.PokazDane();
                break;
            case 5:
                System.out.println("\nWybrano prostopadloscian");
                System.out.print("Podaj szerokosc: ");
                int e = wczytaj.nextInt();
                System.out.print("Podaj dlugosc: ");
                int f = wczytaj.nextInt();
                System.out.print("Podaj wysokosc: ");
                int g = wczytaj.nextInt();
                Prostopadloscian prostopadloscian1 = new Prostopadloscian(e, f, g);
                prostopadloscian1.Oblicz();
                prostopadloscian1.PokazDane();
                break;
            case 6:
                System.out.println("\nWybrano kule");
                System.out.print("Podaj promien: ");
                int h = wczytaj.nextInt();
                Kula kula1 = new Kula(h);
                kula1.Oblicz();
                kula1.PodazDane();
                break;
            case 7:
                System.out.println("\nWybrano stozek");
                System.out.print("Podaj promien podstawy: ");
                int i = wczytaj.nextInt();
                System.out.print("Podaj wyoskosc: ");
                int j = wczytaj.nextInt();
                System.out.print("Podaj dlugosc tworzacej stozka: ");
                int k = wczytaj.nextInt();
                Stozek stozek1 = new Stozek(i, j, k);
                stozek1.Oblicz();
                stozek1.PodazDane();
                break;
            default:
                System.out.println("Wybrano zla liczbe");
        }

    }

}
