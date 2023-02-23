/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //   Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingrese una línea de texto: ");
        //String linea = scanner.nextLine();
        //System.out.println("La línea ingresada fue: " + linea);
        BufferedReader lea = new BufferedReader(new InputStreamReader(System.in));
        int a, b, su;
        try {
            System.out.println("ingrese el numero");
            a = Integer.parseInt(lea.readLine());
            System.out.println("ingrese el numero");
            b = Integer.parseInt(lea.readLine());
            su = a + b;
            System.out.println("el nombre " + su);

        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

}
