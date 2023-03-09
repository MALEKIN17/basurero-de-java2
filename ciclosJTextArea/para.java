/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclosJTextArea;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author GAMER
 */
public class para {

    public static void main(String[] args) {
        JTextArea salida = new JTextArea(30, 50);
        salida.setText("contador\n");
        int n;
        try {
            n = Integer.parseInt(JOptionPane.showInputDialog("hasta cuando desea contar?"));

            for (int cont = 0; cont < 10; cont++) {
                salida.append(cont + "\n");
            }
            JScrollPane scrollPane = new JScrollPane(salida);
            JOptionPane.showMessageDialog(null, scrollPane);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
