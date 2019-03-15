package Função;
/*
Objetivo:		Receba um n�mero N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_ModFunEx36 
{
	public static void main (String[] args)
	{		
		int valorN = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
			
		JOptionPane.showMessageDialog(null, Serie(valorN));
	}
	
	static String Serie(int valorFinal)
	{
		double resultadoSerie=0, valorFat=1;
		int contFat;
		String result = "1";
		
		for ( int cont=1 ; cont<=valorFinal ;cont++ )
		{
			for ( contFat=1 ; contFat<=cont ; contFat++ )
			{
				valorFat*=contFat;
			}
			result+=" + 1/"+cont+"!";
			resultadoSerie+=(1/valorFat);
			valorFat=1;			
		}
		result+=" = " + resultadoSerie;
		return result;
	}
}
