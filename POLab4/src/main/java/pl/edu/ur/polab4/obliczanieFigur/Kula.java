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
public class Kula {

    public int r;
    public float pole;
    public float obj;

    public Kula(int r) {
        this.r = r;
    }

    public void Oblicz() {
        this.pole = (float) (4 * PI * pow(r, 2));
        this.obj = (float) ((4 / 3) * PI * pow(r, 3));
    }

    public void PodazDane() {
        System.out.println("\nKULA");
        System.out.println("promien: " + this.r);
        System.out.format("pole: %.2f%n", this.pole);
        System.out.format("objetosc: %.2f%n", this.obj);
    }
}
