/*
********************************************************************************
Objetivo        : Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq14 {
	public static void main (String[] args) {
		int pri, seg;
		
		pri = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da primeiro ângulo: "));
		seg = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do segundo ângulo: "));
		
		JOptionPane.showMessageDialog(null,"O terceiro ângulo é igual à "+(180-(pri+seg))+"º.");
	}
}
