import javax.swing.JOptionPane;

/*
 * Objetivo:		Serie Recursiva = (N)! + (N-1)! + (N-2)! + ... + (1)!
 * Programadora:	Kesia Amanda Ladeia
 * Data:			14/03/2019
 */

public class Rec_Ex05 {
	public static void main (String[] args){
		int valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
		JOptionPane.showMessageDialog(null, FunRecSomaFat(valorLeitura));
	}
	
	static int FunRecSomaFat(int valor){
		if (valor==1){
			return 1;
		}else{
			return FFat(valor) + FunRecSomaFat(valor-1);
		}
	}
	
	static int FFat (int n){
		if(n==1){
			return n;
		}else{
			return n * FFat(n-1);
		}
	}
}