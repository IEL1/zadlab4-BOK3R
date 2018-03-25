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
public class Szescian {

    public int a;
    public int pole;
    public int obwod;
    public int obj;

    public Szescian(int a) {
        this.a = a;
    }

    public void Oblicz() {
        this.pole = a * a * 6;
        this.obwod = 12 * a;
        this.obj = a * a * a;
    }

    public void PokazDane() {
        System.out.println("\nSZESCIAN");
        System.out.println("dlugosc krawedzi: " + this.a);
        System.out.println("obwod: " + this.obwod);
        System.out.println("pole: " + this.pole);
        System.out.println("objetosc: " + this.obj);
    }
}
