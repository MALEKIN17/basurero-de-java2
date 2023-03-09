/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import javax.swing.JOptionPane;

public class Deportista {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del deportista:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del deportista:"));
        int estatura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la estatura del deportista (en cm):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del deportista (en kg):"));

        boolean aceptado = true;

        if (edad < 18 || edad > 25) {
            JOptionPane.showMessageDialog(null, "El deportista no cumple con la edad requerida.");
            aceptado = false;
        } 

        if (estatura < 185 || estatura > 195) {
            JOptionPane.showMessageDialog(null, "El deportista no cumple con la estatura requerida.");
            aceptado = false;
        } 

        if (peso < 85 || peso > 95) {
            JOptionPane.showMessageDialog(null, "El deportista no cumple con el peso requerido.");
            aceptado = false;
        } 

        if (aceptado) {
            JOptionPane.showMessageDialog(null, "El deportista: "+ nombre+ " con:\n"    
                                                + "Edad: " + edad + "\n" 
                                                + "Estatura: " + estatura + "\n" 
                                                + "Peso: " + peso+"\n ha sido aceptado.");
        } else {
            JOptionPane.showMessageDialog(null, "El deportista: "+ nombre+ " con:\n"    
                                                + "Edad: " + edad + "\n" 
                                                + "Estatura: " + estatura + "\n" 
                                                + "Peso: " + peso+"\nno ha sido aceptado.");
        }
    }
}