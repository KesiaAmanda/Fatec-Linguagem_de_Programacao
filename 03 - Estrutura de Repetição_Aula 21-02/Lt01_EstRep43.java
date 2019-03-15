/*
Objetivo:		Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
				sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador:	Kesia Amanda
Data: 			22/02/2019
*/

import javax.swing.*;

public class Lt01_EstRep43 
{
	public static void main (String[] args)
	{
		double altAna=1.10, altMaria=1.50;
		int contAno=0;
		
		do
		{
			contAno++;
			altAna+=0.03;
			altMaria+=0.02;
		}
		while (altAna<altMaria);
		
		JOptionPane.showMessageDialog(null, "Levara "+contAno+" anos para que Ana tenha "+altAna+"cm e sejá maior que Maria.");
	}
}
