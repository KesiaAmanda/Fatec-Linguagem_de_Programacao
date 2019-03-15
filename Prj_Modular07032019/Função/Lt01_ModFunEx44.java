package Função;
/*
Objetivo:		Receba o número da base e do expoente. Calcule e mostre o valor da potência.
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.*;

public class Lt01_ModFunEx44 
{
	public static void main (String[] args)
	{
		int valorBase = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base: "));
		int valorExp = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da potência: "));
		
		JOptionPane.showMessageDialog(null, valorBase+" ^ "+valorExp+" = "+Potencia(valorBase,valorExp));
	}
	
	static int Potencia(int base, int exp)
	{
		int result=base;
		for (int contLaco=2;contLaco<=exp;contLaco++)
		{
			result*=base;
		}
		
		return result;
	}
}
