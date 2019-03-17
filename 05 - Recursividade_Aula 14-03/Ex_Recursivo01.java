/*
 * Objetivo: 		Coletar um numero positvo calcule e mostre o seu fatorial a partir
 * 					de uma função recursiva.
 * Programadora : 	Kesia Amanda Ladeia
 * Data: 			14/03/2019
*/

import javax.swing.JOptionPane;

public class Ex_Recursivo01 {
	public static void main (String[] args){
		int nro = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor"));
		System.out.println(FFat(nro));
	}
	
	static int FFat(int n){
		if(n==1){
			return n;
		}else{
			return n * FFat(n-1);
		}
	}
}
