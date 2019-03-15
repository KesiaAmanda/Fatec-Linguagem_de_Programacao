package Procedimento;
/**
 * Objetivo:        Receba 3 valores obrigatoriamente em ordem crescente e um 4� valor n�o necessariamente em ordem. Mostre os 4 n�meros em ordem crescente.
 * Programadora:    Kesia Amanda
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx23 
{
	static Integer priValor, segValor, terValor, quaValor;
	static String resultado;
	
	public static void main (String[] args)
	{
		priValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		
		do {
			segValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor em ordem crescente:"));
		} while (priValor >= segValor);
		
		do {
			terValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor em ordem cresente:"));
		} while (segValor >= terValor);
		
		quaValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto valor:"));
		
		ProcOrdemCresc();
		
		JOptionPane.showMessageDialog(null, resultado);
		
	}
	
	static void ProcOrdemCresc()
	{
		if (quaValor >= terValor)
		{
			resultado = "Em ordem crescente: \n" + priValor + ", " + segValor + ", " + terValor + " , " + quaValor + ".";
		}
		else if (quaValor >= segValor)
		{
			resultado = "Em ordem crescente: \n" + priValor + ", " + segValor + ", " + quaValor + ", " + terValor + ".";
		}
		else if (quaValor >= priValor)
		{
			resultado = "Em ordem crescente: \n" + priValor + ", " + quaValor + ", " + segValor + ", " + terValor + ".";
		}
		else
		{
			resultado = "Em ordem crescente: \n" + quaValor + ", " + priValor + ", " + segValor + ", " + terValor + ".";
		}	
	}
}
