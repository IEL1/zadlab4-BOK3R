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
public class DaneStudenta {

    public static void main(String[] args) {
        Student student1 = new Student("Jan", "Nowak", 20154, "informatyka", 1);
        student1.pokazDane();
        System.out.println(" ");
        Student student2 = new Student("Adam", "Kowal");
        student2.pokazDane();
        System.out.println(" ");
        Student student3 = new Student("Karol", 25468);
        student3.pokazDane();
        System.out.println(" ");
        Student student4 = new Student("Karol", 25468);
        student4.pokazDane();
        System.out.println(" ");
    }
}
