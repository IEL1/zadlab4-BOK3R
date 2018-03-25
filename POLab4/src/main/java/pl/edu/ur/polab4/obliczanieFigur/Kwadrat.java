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
public class Kwadrat {

    public int a;
    public int pole;
    public int obwod;

    public Kwadrat(int a) {
        this.a = a;
    }
    
    public void Oblicz(){
        this.obwod = 4*a;
        this.pole = a*a;
    }
    
    public void PokazDane() {
        System.out.println("\nKWADRAT");
        System.out.println("dlugosc boku: " + this.a);
        System.out.println("obwod: " + this.obwod);
        System.out.println("pole: " + this.pole);
    }

}
