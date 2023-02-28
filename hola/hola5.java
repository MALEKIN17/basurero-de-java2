/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTES
 */
public class hola5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = sc.nextDouble();
        double discriminante = b * b - 4 * a * c;

        if (discriminante >= 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son x1=" + x1 + " y x2=" + x2);
        } else {
            System.out.println("La ecuación no tiene solución real.");
        }
    }
}
