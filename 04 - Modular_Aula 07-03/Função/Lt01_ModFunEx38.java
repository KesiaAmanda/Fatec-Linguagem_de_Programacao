package Função;
/*
Objetivo:		Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_ModFunEx38 
{
	public static void main (String[] args)
	{ 
		double valorLeitura, memMenor=0, memMaior=0;
		
		for (int cont=1;cont<=100;cont++) 
		{
			valorLeitura = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor: "));
			
			if (cont==1)
			{
				memMenor = valorLeitura;
				memMaior = valorLeitura;
			}
			
			memMaior=VerificaMaior(valorLeitura,memMaior);			
			memMenor=VerificaMenor(valorLeitura,memMenor);
		}
		
		JOptionPane.showMessageDialog(null, "O menor valor digitado foi "+ memMenor+"\nO maior valor digitado foi "+ memMaior);
	}
	
	static Double VerificaMenor(Double valorLeit, Double valorMem)
	{
		if (valorLeit>valorMem)
		{
			return valorMem;
		}else {
			return valorLeit;
		}
	}
	
	static Double VerificaMaior(Double valorLeit, Double valorMem)
	{
		if (valorLeit<valorMem)
		{
			return valorMem;
		}else {
			return valorLeit;
		}
	}
}
