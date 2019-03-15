/*
********************************************************************************
Objetivo        : Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq08 {
	public static void main (String[] args) {
		int dep;
		
		dep = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do deposito: "));
		JOptionPane.showMessageDialog(null,"Após 1 mês de aplicação o valor será igual à "+(dep*1.013));
	}
}
