/*
Objetivo:		Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
Programador:	Kesia Amanda
Data: 			22/02/2019
*/

import javax.swing.JOptionPane;

public class Lt01_EstRep40 
{
	public static void main (String[] args)
	{
		int aux, contPrimo, cont, div=0;
		
		int priValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		int segValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
		
		if (priValor>segValor)
		{
			aux=priValor;
			priValor=segValor;
			segValor=aux;
		}
		
		for (cont=priValor;cont<=segValor;cont++)
		{
			for (contPrimo=2;contPrimo<=cont;contPrimo++)
			{
				if (cont%contPrimo==0)
				{
					div++;
					if (div==2)
					{
						contPrimo=cont;
					}
				}
			}
			if (div==1)
			{
				System.out.println(cont+" é primo!");
			}
			div=0;
		}
	}
}
