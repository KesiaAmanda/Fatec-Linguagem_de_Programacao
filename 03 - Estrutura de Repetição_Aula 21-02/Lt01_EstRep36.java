/*
Objetivo:		Receba um n�mero N. Calcule e mostre a s�rie 1 + 1/1! + 1/2! + ... + 1/N!
Programador:	Kesia Amanda
Data: 			22/02/2019
*/

import javax.swing.JOptionPane;

public class Lt01_EstRep36 
{
	public static void main (String[] args)
	{
		int cont, contFat;
		double resultadoSerie=0, valorFat=1;
		
		int valorN = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		
		for ( cont=1 ; cont<=valorN ;cont++ )
		{
			for ( contFat=1 ; contFat<=cont ; contFat++ )
			{
				valorFat*=contFat;
				//valorFat = valorFat + (valorFat*contFat)
			}
			
			resultadoSerie+=(1/valorFat);
			valorFat=1;			
		}
		JOptionPane.showMessageDialog(null, "o ressultado da s�rie 1 + ... + 1/"+valorN+"! � igual a "+ resultadoSerie);
	}
}
