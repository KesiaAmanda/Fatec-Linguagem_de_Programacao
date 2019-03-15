import javax.swing.JOptionPane;

/*
********************************************************************************
Objetivo        : Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/
public class Lt01_EstSeq09 {
	public static void main (String[] args) {
		int prin, segn;
		
		prin = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do primeiro número: "));
		segn = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do segundo número: "));
		
		JOptionPane.showMessageDialog(null, "O Resultado é igual à: "+((prin*prin)+(segn*segn)));
	}
}
