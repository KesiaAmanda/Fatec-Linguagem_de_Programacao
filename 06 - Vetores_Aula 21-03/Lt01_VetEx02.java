/*
Objetivo:		Criar e coletar um vetor [100] inteiro e exibir:
				a. O maior e o menor valor;
				b. A média dos valores.
Programador:	Kesia Amanda
Data:			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_VetEx02 
{
	public static void main (String[] args)
	{
		int vetValores[] = new int[100];
		
		for (int ind=0;ind<=99;ind++)
		{
			vetValores[ind]=Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(ind+1)+"º valor:"));
		}
		JOptionPane.showMessageDialog(null, Result(vetValores));
	}
	
	static String Result(int vet[])
	{
		String result;
		int menorValor=0, maiorValor=0, somaValor=0;
		
		for (int i=0;i<=99;i++)
		{
			if (i==0)
			{
				menorValor = vet[i];
				maiorValor = vet[i];
			}
			if(menorValor>vet[i]) {
				menorValor=vet[i];
			}
			if(maiorValor<vet[i]) {
				maiorValor=vet[i];
			}
			
			somaValor+=vet[i];
		}
		result = "Maior valor = " + maiorValor + "\nMenor valor = " + menorValor + "\nMédia dos valores:" + (somaValor/100);
		return result;
	}
}
