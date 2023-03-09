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
public class hacerMientras {

    public static void main(String[] args) {
        JTextArea salida = new JTextArea(30, 50);
        salida.setText("contador\n");
        int n, cont;
        n = Integer.parseInt(JOptionPane.showInputDialog("hasta cuando desea contar?"));
        cont = 1;

        do {
            salida.append(cont + "\n");
            cont++;
        } while (cont <= n); 
        JScrollPane scrollPane = new JScrollPane(salida);
        JOptionPane.showMessageDialog(null, scrollPane);
    }
}
