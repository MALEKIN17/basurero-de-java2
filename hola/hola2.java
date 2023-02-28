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
public class hola2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a, b, d;
        
        try {
            System.out.println("ingrese el radio");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("ingrese el numero");
            b = Integer.parseInt(scanner.nextLine());
            d = a / b;
            System.out.println("la division" + d);

        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e);
        }
    }
}
