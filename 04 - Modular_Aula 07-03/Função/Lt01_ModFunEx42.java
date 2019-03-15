package Função;
/*
Objetivo:		Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99.
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_ModFunEx42 
{
	public static void main (String[] args)
	{
		JOptionPane.showMessageDialog(null, Serie());
	}
	
	static String Serie()
	{
		double soma = 1;
		String result = "1";
		
		for (double cont=2;cont<=50;cont++)
		{
			result+=" + "+cont+"/"+(2*cont-1);
			soma+=cont/(2*cont-1);
		}
		
		result+=" = " + soma;
		
		return result;
	}
}