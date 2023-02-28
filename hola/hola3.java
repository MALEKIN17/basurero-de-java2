/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTES
 */
public class hola3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double r, area;
        final double pi = 3.1416;
        try {
            System.out.println("ingrese el radio de la circunferencia");
            r = Double.parseDouble(scanner.nextLine());
            area = pi * r * r;

            System.out.println("la area es" + area);

        } catch (NumberFormatException e) {
            System.out.println( "digite solo numeros");
        }
    }

}
