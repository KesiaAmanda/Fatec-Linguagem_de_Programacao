/**
 * Objetivo:        Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec22 
{
	public static void main (String[] args)
	{
		int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));
		
		if (primeiroValor > segundoValor)
		{
			JOptionPane.showMessageDialog(null, "Em ordem crescente: \n" + segundoValor + ", " + primeiroValor + ".");
		}
		else if (segundoValor > primeiroValor)
		{
			JOptionPane.showMessageDialog(null, "Em ordem crescente: \n" + primeiroValor + ", " + segundoValor + ".");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Valores iguais!\n" + primeiroValor + ", " + segundoValor + ".");
		}
	}
}
