/*
********************************************************************************
Objetivo        : Receba 2 números reais. Calcule e mostre a diferença desses valores.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq10 {
	public static void main (String[] args) {
		double prin, segn;
		
		prin = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		segn = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor: "));
		
		if (prin>segn){
			JOptionPane.showMessageDialog(null,"A diferença é igual à "+(prin-segn)+".");
		}
		else {
			JOptionPane.showMessageDialog(null,"A diferença é igual à "+(segn-prin)+".");
		}
	}
}
