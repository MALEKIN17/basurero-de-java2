/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import javax.swing.JOptionPane;

public class menu2 {

    void sumar() {
        //metodo
        try {
            double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
            double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));
            double suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }

    double restar() {
        //retorna

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));
        double resta = numero1 - numero2;
        return resta;
    }

    void multi(double a, double b) {
        //recibe y no retorna
        try {
            double mul = a * b;
            JOptionPane.showMessageDialog(null, "La multiplicación es " + mul);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

    }

    double dividir(double a, double b) {
        try {

            double d = a / b;
            return d;

        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        return 0;
    }

    public static void main(String[] args) {
        int opcion = 0;
        menu2 ob = new menu2();//objeto creado
        try {
            while (opcion != 5) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "QUE QUIERE HACER?\n\n"
                        + "1.SUMA \n"
                        + "2.RESTA \n"
                        + "3.MULTIPLICACION \n"
                        + "4.DIVISION \n"
                        + "5.SALIR"));

                switch (opcion) {
                    case 1:
                        ob.sumar();
                        break;
                    case 2:
                        double s = ob.restar();

                        JOptionPane.showMessageDialog(null, s);

                        break;
                    case 3:
                        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));
                        ob.multi(numero1, numero2);
                        break;
                    case 4:
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));

                        double sd;
                        sd = ob.dividir(numero1, numero2);
                        JOptionPane.showMessageDialog(null, "la division es de " + sd);

                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "usted ingreso una letra\n porfavor elija una opcion valida");
        }
    }
}
