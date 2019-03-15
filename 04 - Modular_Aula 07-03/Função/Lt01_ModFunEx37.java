package Função;
/*
Objetivo:		Receba um n�mero inteiro. Calcule e mostre a série de Fibonacci at� o seu N termo.
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_ModFunEx37 
{
	public static void main (String[] args)
	{		
		int valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
		
		JOptionPane.showMessageDialog(null, Fibo(valorLeitura));
	}
	
	static String Fibo(int Termo)
	{
		int auxFibo1=1, auxFibo2=1, valorFibo=1;
		String result = "Série de Fibonacci até " + Termo + "º termo!\n";
		
		for (int cont=1;cont<=Termo;cont++)
		{
			auxFibo1=valorFibo;
			result+= auxFibo2 + " + " + valorFibo;
			valorFibo=auxFibo2+valorFibo;			
			auxFibo2=auxFibo1;
			result+=" = " + valorFibo + "\n";
		}
		
		return result;
	}
}
 