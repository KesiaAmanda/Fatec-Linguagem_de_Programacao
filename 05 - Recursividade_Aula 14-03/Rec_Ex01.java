/*
 * Objetivo:		Serie Recursiva = (1+2+3+...+100)
 * Programadora:	Kesia Amanda Ladeia
 * Data:			14/03/2019
 */

import javax.swing.JOptionPane;

public class Rec_Ex01 {
	public static void main (String[] args){
		int valorInicial = 1;
		JOptionPane.showMessageDialog(null, FunRecSoma(valorInicial));
	}
	
	static int FunRecSoma(int valor){
		if (valor == 100){
			return 100;
		}else{
			return valor + FunRecSoma(valor+1);
		}
	}
}
