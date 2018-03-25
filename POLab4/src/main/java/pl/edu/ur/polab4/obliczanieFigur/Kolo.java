/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

import static java.lang.Math.*;

/**
 *
 * @author Boker
 */
public class Kolo {

    public int r;
    public float pole;
    public float objetosc;
    public float obwod;

    public Kolo(int promien) {
        this.r = promien;
    }

    public void Oblicz() {
        this.pole = (float) (PI * r * r);
        this.obwod = (float) (2 * PI * r);
    }

    public void PokazDane() {
        System.out.println("/nKOLO");
        System.out.println("promien: " + this.r);
        System.out.format("pole powierzchni: %.2f%n", this.pole);
        System.out.format("obwod: %.2f%n", this.obwod);
    }
}
