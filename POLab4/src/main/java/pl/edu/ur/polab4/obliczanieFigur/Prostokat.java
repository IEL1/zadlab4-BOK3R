/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Boker
 */
public class Prostokat {

    public int a;
    public int b;
    public int pole;
    public int obwod;

    public Prostokat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void Oblicz() {
        this.pole = a * b;
        this.obwod = 2 * a + 2 * b;
    }

    public void PokazDane() {
        System.out.println("\nPROSTOKAT");
        System.out.println("dlugosc pierwszego boku: " + this.a);
        System.out.println("dlugosc drugiego boku: " + this.b);
        System.out.println("obwod: " + this.obwod);
        System.out.println("pole: " + this.pole);
    }
}
