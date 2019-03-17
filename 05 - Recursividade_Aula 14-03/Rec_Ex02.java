/*
 * Objetivo:		Serie Recursiva = (N) + (N-1) + (N-2) + ... + (1) 
 * Programadora:	Kesia Amanda Ladeia
 * Data:			14/03/2019
 */

import javax.swing.JOptionPane;

public class Rec_Ex02 {
	public static void main (String[] args){
		int valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
		JOptionPane.showMessageDialog(null, FunRecSoma(valorLeitura));
	}
	
	static int FunRecSoma(int valor){
		if (valor==1){
			return 1;
		}else{
			return valor + FunRecSoma(valor-1);
		}
	}
}
