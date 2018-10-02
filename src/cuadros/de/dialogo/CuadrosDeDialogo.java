/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadros.de.dialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class CuadrosDeDialogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String num1 = JOptionPane.showInputDialog("Ingrese un número");
        String num2 = JOptionPane.showInputDialog("Ingrese otro número");
        float num3 = Float.parseFloat(num1);
        float num4 = Float.parseFloat(num2);
        
        float producto = num3 * num4;
                
        JOptionPane.showMessageDialog(null,"El producto es " + producto);
                 
    }
    
}
