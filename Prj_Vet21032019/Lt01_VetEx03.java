/*
Objetivo:		Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
				Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. 
				ex: VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6

Programador:	Kesia Amanda
Data:			02/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_VetEx03 
{
	public static void main (String[] args)
	{
		int primeiroVet[] = new int [3], segundoVet[] = new int [3], terceiroVet[] = new int [6];
		String VT1 = "VET1 | ", VT2 = "VET2 | ", VT3 = "VET3 | ";
		
		for (int i=0;i<=2;i++)
		{
			primeiroVet[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe o "+ (i+1) +" valor:"));
			terceiroVet[i]=primeiroVet[i];
			VT1+=primeiroVet[i]+" | ";
		}
		
		for (int i=0;i<=2;i++)
		{
			segundoVet[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe o "+ (i+4) +" valor:"));
			terceiroVet[(i+3)]=segundoVet[i];
			VT2+=segundoVet[i]+" | ";
		}
		
		for (int i=0;i<=5;i++)
		{
			VT3+=terceiroVet[i]+" | ";
		}
		
		JOptionPane.showMessageDialog(null, VT1+" "+VT2+" "+VT3);
	}
}
