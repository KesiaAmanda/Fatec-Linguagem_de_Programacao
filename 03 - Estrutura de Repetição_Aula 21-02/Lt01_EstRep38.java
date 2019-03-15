/*
Objetivo:		Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
Programador:	Kesia Amanda
Data: 			22/02/2019
*/

import javax.swing.JOptionPane;

public class Lt01_EstRep38 
{
	public static void main (String[] args)
	{
		int cont; 
		double valorLeitura, memMenor=0, memMaior=0;
		
		for (cont=1;cont<=100;cont++) 
		{
			valorLeitura = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor: "));
			
			if (cont==1)
			{
				memMenor = valorLeitura;
				memMaior = valorLeitura;
			}
			
			if (valorLeitura>memMaior)
			{
				memMaior = valorLeitura;
			}
			
			if (valorLeitura<memMenor)
			{
				memMenor = valorLeitura;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O menor valor digitado foi "+ memMenor+"\nO maior valor digitado foi "+ memMaior);
	}
}
