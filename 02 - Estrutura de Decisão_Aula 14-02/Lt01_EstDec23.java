/**
 * Objetivo:        Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 * Programadora:    Kesia Amanda
 * Data:            16/02/2019
 */

import javax.swing.JOptionPane;

public class Lt01_EstDec23 
{
	public static void main (String[] args)
	{
		int segValor, terValor;
		
		int priValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));
		
		do {
			segValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor em ordem crescente:"));
		} while (priValor >= segValor);
		
		do {
			terValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro valor em ordem cresente:"));
		} while (segValor >= terValor);
		
		int quaValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto valor:"));
		
		if (quaValor >= terValor)
		{
			JOptionPane.showMessageDialog(null, "Em ordem crescente: \n" + priValor + ", " + segValor + ", " + terValor + " , " + quaValor + ".");
		}
		else if (quaValor >= segValor)
		{
			JOptionPane.showMessageDialog(null, "Em ordem crescente: \n" + priValor + ", " + segValor + ", " + quaValor + ", " + terValor + ".");
		}
		else if (quaValor >= priValor)
		{
			JOptionPane.showMessageDialog(null, "Em ordem crescente: \n" + priValor + ", " + quaValor + ", " + segValor + ", " + terValor + ".");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Em ordem crescente: \n" + quaValor + ", " + priValor + ", " + segValor + ", " + terValor + ".");
		}
		
	}
}
