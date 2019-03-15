/*
Objetivo:		Criar e coletar um vetor [50] inteiro. Calcular e exibir:
				a. A média dos valores entre 10 e 200;
				b. A soma dos números ímpares.
Programador:	Kesia Amanda
Data:			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_VetEx01 {
	public static void main (String[] args)
	{
		int vetValores[] = new int[50];
		
		for (int indice=0;indice<=49;indice++)
		{
			vetValores[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe a "+(indice+1)+"º nota:"));
		}
		
		JOptionPane.showMessageDialog(null, Result(vetValores));
	}
	
	static String Result(int vt[])
	{
		int somaImpar = 0, qtdSoma = 0, somaValores = 0;
		String result;
		
		for (int i=0;i<=49;i++)
		{
			if (vt[i]>=10 && vt[i]<=200) 
			{
				somaValores+=vt[i];
				qtdSoma++;
			}
			if (vt[i]%2==1)
			{
				somaImpar+=vt[i];
			}
		}
		result = "A média dos valores entre 10 e 200 é "+(somaValores/qtdSoma)+"\nA soma doa números ímpares é "+somaImpar;
		
		return result;
	}
}