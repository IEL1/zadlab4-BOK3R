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
public class Prostopadloscian {

    public int a;
    public int b;
    public int h;
    public int pole;
    public int obwod;
    public int obj;

    public Prostopadloscian(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void Oblicz() {
        this.pole = 2 * a * b + 2 * a * h + 2 * b * h;
        this.obwod = 4 * a + 4 * b + 4 * h;
        this.obj = a * b * h;
    }
    
    public void PokazDane(){
        System.out.println("\nPROSTOPADLOSCIAN");
        System.out.println("szerokosc: "+this.a);
        System.out.println("dlugosc: "+this.b);
        System.out.println("wysokosc: "+this.h);
        System.out.println("dlugosc krawedzi: "+this.obwod);
        System.out.println("pole: "+this.pole);
        System.out.println("objetosc: "+this.obj);
    }
}
