/**
 * Objetivo:        Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 * Programadora:    Kesia
 * Data:            14/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec18 
{
    public static void main (String args[])
    {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
        
        if (valor1>valor2)
        {
            JOptionPane.showMessageDialog(null,"A diferença é " + (valor1-valor2));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"A Diferença é " + (valor2-valor1));
        }
    }
}
