/**
 * Objetivo:        Receba 2 valores reais. Calcule e mostre o maior deles.
 * Programadora:    Kesia
 * Data:            14/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec19 
{
    public static void main (String args[])
    {
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor real:"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor real:"));
        
        if (valor1>valor2)
        {
            JOptionPane.showMessageDialog(null,valor1+" é maior!");
        }
        else if (valor2>valor1)
        {
            JOptionPane.showMessageDialog(null,valor2+" é maior!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Os valores são iguais.");
        }
    }
    
}
