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
public class Stozek {

    public int r;
    public int h;
    public int l;
    public float pole;
    public float obj;

    public Stozek(int r, int h, int l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    public void Oblicz() {
        this.pole = (float) (PI * r * (r + l));
        this.obj = (float) ((PI * pow(r, 2) * h) / 3);
    }

    public void PodazDane() {
        System.out.println("\nSTOZEK");
        System.out.println("promien podstawy: " + this.r);
        System.out.println("wysokosc: " + this.h);
        System.out.println("dlugosc tworzacej stozka: " + this.l);
        System.out.format("pole: %.2f%n", this.pole);
        System.out.format("objetosc: %.2f%n", this.obj);
    }
}
