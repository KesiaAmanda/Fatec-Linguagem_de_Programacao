/*
********************************************************************************
Objetivo        : Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq11 {
	public static void main (String[] args) {
		int raio;
		
		raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio da circunferencia:"));
		JOptionPane.showMessageDialog(null,"O comprimento é igual à:"+(2*Math.PI*raio));
	}
}
