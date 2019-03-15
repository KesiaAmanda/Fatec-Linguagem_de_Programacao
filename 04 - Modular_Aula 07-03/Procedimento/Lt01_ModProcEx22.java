package Procedimento;
/**
 * Objetivo:        Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * Programadora:    Kesia Amanda
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx22 
{
	static String resultado;
	static Integer primeiroValor, segundoValor;
	
	public static void main (String[] args)
	{
		primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		
		do {
		segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor diferente:"));
		}while (primeiroValor==segundoValor);
		
		ProcOrdem();
		
		JOptionPane.showMessageDialog(null, resultado);

	}
	static void ProcOrdem()
	{
		if (primeiroValor > segundoValor)
		{
			resultado = "Em ordem crescente: \n" + segundoValor + ", " + primeiroValor + ".";
		}
		else
		{
			resultado = "Em ordem crescente: \n" + primeiroValor + ", " + segundoValor + ".";
		}
	}
}
