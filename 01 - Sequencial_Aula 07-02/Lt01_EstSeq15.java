/*
********************************************************************************
Objetivo        : Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq15 {
	public static void main (String[] args) {
		int pricat, segcat;
		
		pricat = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do primeiro cateto: "));
		segcat = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do segunfo cateto "));
		
		JOptionPane.showMessageDialog(null, "O valor da hipotenusa é igual à "+Math.sqrt(Math.pow(pricat,2)+Math.pow(segcat,2)));
	}
}
