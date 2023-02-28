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
public class hola4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,su,mul,rest;
        boolean k,t,z;
        float di;
        try {
            System.out.println("ingrese el numero");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("ingrese el numero");
            b = Integer.parseInt(scanner.nextLine());
            System.out.println("ingrese el numero");
            c = Integer.parseInt(scanner.nextLine());
            su=a+b+c;
            mul=a*b*c;
            rest=(a-b)-c;
            di=((float)a/b)/c;
            float mod =a%b;
            a+=1;
            k=a>b;
            System.out.println("la suma es "+ su);
            System.out.println("la multiplicacion es "+ mul);
            System.out.println("la resta es "+ rest);
            System.out.println("la divicion es "+ di);
            System.out.println("el residuo es "+mod);
            System.out.println("el estado de k es "+ k);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        
    }
}
