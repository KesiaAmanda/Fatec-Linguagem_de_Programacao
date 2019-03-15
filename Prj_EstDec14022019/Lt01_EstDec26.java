/**
 * Objetivo:        Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec26 
{
	public static void main (String[] args)
	{
		int aux;
		
		int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
		
		if (segundoValor>primeiroValor)
		{
			aux = primeiroValor;
			primeiroValor = segundoValor;
			segundoValor = aux;
		}
		
		if ( primeiroValor % segundoValor == 0 )
		{
			JOptionPane.showMessageDialog(null, primeiroValor + " é múltiplo de " + segundoValor + ".");
		}
		else
		{
			JOptionPane.showMessageDialog(null, primeiroValor + " não é múltiplo de " + segundoValor + ".");
		}
	}
}
