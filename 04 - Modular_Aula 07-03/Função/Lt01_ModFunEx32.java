package Função;

/*
Objetivo:		Receba um numero inteiro. Calcule e mostre o seu fatorial.
Programador:	Kesia Amanda
Data:			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_ModFunEx32 
{
	public static void main (String[] args)
	{
		int valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para receber o seu fatorial:"));
		JOptionPane.showMessageDialog(null, "O fatorial de "+valorLeitura+" é igual a : "+ FuncFatorial(valorLeitura));
	}
	
	static int FuncFatorial (int valor)
	{
		int valorAC = 1;
		for (int cta=2 ; cta<=valor ; cta++)
		{
			valorAC*=cta;
		}
		return valorAC;
	}
}
