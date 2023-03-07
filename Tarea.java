package tarea;

import javax.swing.JOptionPane;

public class Tarea {

    public static void main(String[] args) {
        int opcion = 0;
        double numero1, numero2;

        try {

            while (opcion != 5) {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "QUE QUIERE HACER?\n1.SUMA \n2.RESTA \n3.MULTIPLICACION \n4.DIVISION \n5.SALIR"));

                switch (opcion) {
                    case 1:
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        double suma = numero1 + numero2;
                        JOptionPane.showMessageDialog(null, "La suma de " + numero1 + " y " + numero2 + " es: " + suma);
                        break;
                    case 2:
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        double resta = numero1 - numero2;
                        JOptionPane.showMessageDialog(null, "La resta de " + numero1 + " y " + numero2 + " es: " + resta);
                        break;
                    case 3:
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        double multiplicacion = numero1 * numero2;
                        JOptionPane.showMessageDialog(null, "La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
                        break;
                    case 4:
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        if (numero2 == 0) {
                            JOptionPane.showMessageDialog(null, "Error: no se puede dividir entre cero");
                        } else {
                            double division = numero1 / numero2;
                            JOptionPane.showMessageDialog(null, "La división de " + numero1 + " y " + numero2 + " es: " + division);
                        }
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
