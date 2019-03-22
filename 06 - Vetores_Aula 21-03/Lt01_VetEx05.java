/*
Objetivo:		Criar e coletar um vetor[20] int. Calcule e exiba, segundo: A[1]-A[20-1]
Programador:	Kesia Amanda
Data:			21/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_VetEx05 {
	public static void main (String[] args) {
		int vetValores[] = new int[20]; 
		
		for (int cont=0;cont<=19;cont++) {
			vetValores[cont]=Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(cont+1)+"º valor:"));
		}
		
		for (int cont=0;cont<=9;cont++) {
			System.out.println("Vetor "+(cont+1)+" - Vetor "+(20-cont)+" = "+(vetValores[cont]-vetValores[19-cont]));
		}
	}
}
