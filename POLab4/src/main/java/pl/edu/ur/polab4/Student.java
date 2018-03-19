/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author Boker
 */
public class Student {

    public String imie;
    public String nazwisko;
    public int nr_indeksu;
    public String specjalnosci;
    public int rok_studiow;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student(String imie, int nr_indeksu) {
        this.imie = imie;
        this.nr_indeksu = nr_indeksu;
    }

    public Student(String imie, String nazwisko, int nr_indeksu, String specjalnosci, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosci = specjalnosci;
        this.rok_studiow = rok_studiow;
    }

    public Student(String imie, String nazwisko, int nr_indeksu, String specjalnosci) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.specjalnosci = specjalnosci;
    }

    public void pokazDane() {
        System.out.println("Student");
        System.out.println("Imie: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
        System.out.println("Nr indeksu: " + this.nr_indeksu);
        System.out.println("Specjalnosc: " + this.specjalnosci);
        System.out.println("Rok studiow: " + this.rok_studiow);
    }
}
