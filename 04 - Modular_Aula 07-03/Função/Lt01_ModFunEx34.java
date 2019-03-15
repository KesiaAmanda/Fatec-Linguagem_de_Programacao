package Função;
/*
Objetivo:		Receba um numero N. Calcule e mostre os resultados da tabuada desse numero.
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.*;

public class Lt01_ModFunEx34 
{
	public static void main (String args[])
	{
		int valorLeitura;
		
		valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		JOptionPane.showMessageDialog(null, Tabuada(valorLeitura));       
        
    }
	
	static String Tabuada(int valor)
	{
		String result = "[Tabuada do "+valor+"]\n";
		
		for (int cont = 1; cont <= 10 ; cont ++){
			result+= valor + " x " + cont + " = " + (cont * valor + "\n");
		} 
		return result;
	}
}
