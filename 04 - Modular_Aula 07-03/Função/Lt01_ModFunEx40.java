package Função;
/*
Objetivo:		Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_ModFunEx40 
{
	public static void main (String[] args)
	{		
		int priValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		int segValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
		int verifica;
		String result = "";
		
		if (priValor>segValor)
		{
			int aux=priValor;
			priValor=segValor;
			segValor=aux;
		}
		
		for (int cont=priValor;cont<=segValor;cont++)
		{
			verifica = VerificaPrimo(cont);
			if (verifica == 1 ) result+= cont + " ";
		}
		result+="são primos!";
		JOptionPane.showMessageDialog(null, result);
	}
	
	static int VerificaPrimo (int valor)
	{
		int div=0;
		for (int cont=2;cont<=valor;cont++)
		{
			if (valor%cont==0)
			{
				div++;
				if (div==2)
				{
					cont=valor;
				}
			}
		}
		if (div==1)
		{
			return 1;
		}
		else {
			return 0;
		}
	}
}
