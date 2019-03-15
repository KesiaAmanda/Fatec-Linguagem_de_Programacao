/*
********************************************************************************
Objetivo        : Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq17 {
	public static void main (String[] args) {
		int temp, veloc;
		
		temp = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de percurso: "));
		veloc = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade média: "));
		
		JOptionPane.showMessageDialog(null, "Serão "+((temp*veloc)/12)+" litros gastos.");
	}
}
