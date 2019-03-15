/*
********************************************************************************
Objetivo        : Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq13 {
	public static void main (String[] args) {
		int kil;
		
		kil = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alimento em kilos:"));
		JOptionPane.showMessageDialog(null,kil+"k durará "+((kil*1000)/50)+" dias.");
	}
}
