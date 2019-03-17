import javax.swing.JOptionPane;

/*
 * Objetivo:		Serie Recursiva = (N/1) +(N-1/2) + (N-2/3) + .... + (1/N) 
 * Programadora:	Kesia Amanda Ladeia
 * Data:			14/03/2019
 */

public class Rec_Ex04 {
	public static void main (String[] args){
		double valorX = 1;
		Double valorLeitura = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor"));
		JOptionPane.showMessageDialog(null, FunRecDiv(valorLeitura, valorX));
	}
	
	static double FunRecDiv (double valorFinal, double valorInicial){
		if (valorFinal==1){
			return valorFinal/valorInicial;
		}else{
			return (valorFinal/valorInicial) + FunRecDiv(valorFinal-1,valorInicial+1);
		}
	}
}
