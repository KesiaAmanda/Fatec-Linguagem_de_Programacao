package Função;
/*
Objetivo:		Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_ModFunEx41 
{
	public static void main (String[] args)
	{
		JOptionPane.showMessageDialog(null, VerificaDados());
	}
	
	static String VerificaDados()
	{
		String result = "Todas as possibilidades: \n";
		for (int valorD1=1;valorD1<=7;valorD1++)
		{
			for (int valorD2=1;valorD2<=7;valorD2++)
			{
				if (valorD1+valorD2==7)
				{
					result+=valorD1+" + "+valorD2+" = 7\n";
				}
			}
		}
		return result;
	}
}
