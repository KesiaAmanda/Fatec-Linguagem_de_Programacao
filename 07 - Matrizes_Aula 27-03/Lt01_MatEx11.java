/*
Objetivo:		Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
Programador:	Kesia Amanda
Data: 			28/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_MatEx11 {
	public static void main (String[] args) {
		int matValores[][] = new int[8][8];
		String result = "";
	
		for (int cont=0;cont<=3;cont++) {
			for (int linha=cont;linha<=(7-cont);linha++) {
				for (int coluna=cont;coluna<=(7-cont);coluna++) {
					matValores[linha][coluna]=(cont+1);
				}
			}
		}
		for (int linha=0;linha<=7;linha++) {
			for(int coluna=0;coluna<=7;coluna++) {
				result+= " "+matValores[linha][coluna]+" ";
			}
			result+= "\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}

}
