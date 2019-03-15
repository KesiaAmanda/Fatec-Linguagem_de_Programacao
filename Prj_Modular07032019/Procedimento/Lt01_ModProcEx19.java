package Procedimento;
/**
 * Objetivo:        Receba 2 valores reais. Calcule e mostre o maior deles.
 * Programadora:    Kesia
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx19 
{
	static Double priValor, segValor;
	static String resultado;
	
    public static void main (String args[])
    {
        priValor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor real:"));
        segValor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor real:"));
        
        VerfMaior();
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    static void VerfMaior()
    {
    	if (priValor>segValor)
        {
        	resultado = priValor + " é maior!";
        }
        else if (segValor>priValor)
        {
        	resultado = segValor + " é maior!";
        }
        else
        {
        	resultado = "Os valores são iguais.";
        }
    }
    
}
