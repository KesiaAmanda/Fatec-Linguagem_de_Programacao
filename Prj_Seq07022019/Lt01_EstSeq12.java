/*
********************************************************************************
Objetivo        : Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq12 {
	public static void main (String[] args) {
		int atual, nasc;
		
		atual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual:"));
		nasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento "));
		
		JOptionPane.showMessageDialog(null,"Você tem "+(atual-nasc)+" anos e daqui 17 anos terà "+((atual-nasc)+17));
	}
}
