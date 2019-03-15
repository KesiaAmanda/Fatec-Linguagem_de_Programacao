package Procedimento;
/**
 * Objetivo:        Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menos valor.
 * Programadora:    Kesia
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx18 
{
	static Integer priValor, segValor, difValor;
		
    public static void main (String args[])
    {
        priValor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
        segValor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
        
        difMaiorPorMenor();
        
        JOptionPane.showMessageDialog(null,"A diferença é " + difValor + ".");
    }
    
	static void difMaiorPorMenor()
	{
		if (priValor>segValor){
            difValor = priValor-segValor;
        }else{
            difValor = segValor-priValor;
        }
	}
}
