/*
 * Objetivo:		Serie Recursiva = (1/1) + (1/2) + (1/3) + ....+ (1/N)  
 * Programadora:	Kesia Amanda Ladeia
 * Data:			14/03/2019
 */

import javax.swing.JOptionPane;

public class Rec_Ex03 {
	public static void main (String[] args)
	{
		Double valorLeitura = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		JOptionPane.showMessageDialog(null, FunRecDiv(valorLeitura));
	}
	
	static double FunRecDiv(double valor)
	{
		double valorDiv, valorSoma;
		if (valor==1)
		{
			return 1;
		}
		else
		{
			valorDiv = 1/valor;
			valorSoma = valorDiv + FunRecDiv(valor-1);
		}
		return valorSoma;
	}
}
