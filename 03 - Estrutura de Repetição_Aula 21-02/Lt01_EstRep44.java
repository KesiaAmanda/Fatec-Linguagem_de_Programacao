/*
Objetivo:		Receba o número da base e do expoente. Calcule e mostre o valor da potência.
Programador:	Kesia Amanda
Data: 			22/02/2019
*/

import javax.swing.*;

public class Lt01_EstRep44 
{
	public static void main (String[] args)
	{
		int contLaco; 
		
		int valorBase = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base: "));
		int valorExp = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da potência: "));
		
		int result = valorBase;
		
		for (contLaco=2;contLaco<=valorExp;contLaco++)
		{
			result*=valorBase;
		}
		
		JOptionPane.showMessageDialog(null, valorBase+" ^ "+valorExp+" = "+result);
	}
}
