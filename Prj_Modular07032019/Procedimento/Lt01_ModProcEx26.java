package Procedimento;
/**
 * Objetivo:        Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * Programadora:    Kesia Amanda
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx26 
{
	static Integer primeiroValor, segundoValor;
	static String result;
	
	public static void main (String[] args)
	{
		primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
		
		Order();
		Multiple();
		
		JOptionPane.showMessageDialog(null, result);
	}
	
	static void Order()
	{
		int aux;
		if (segundoValor>primeiroValor)
		{
			aux = primeiroValor;
			primeiroValor = segundoValor;
			segundoValor = aux;
		}
	}
	
	static void Multiple()
	{
		if ( primeiroValor % segundoValor == 0 )
		{
			result = primeiroValor + " é múltiplo de " + segundoValor + ".";
		}
		else
		{
			result = primeiroValor + " não é múltiplo de " + segundoValor + ".";
		}
	}
}
