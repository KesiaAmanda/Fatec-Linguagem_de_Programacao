package Procedimento;
/*
********************************************************************************
Objetivo        : Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Programador     : Kesia
Data criação    : 02/03/2019
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_ModProcEx17 {
	static Integer temp, veloc, ltGastos;
	
	public static void main (String[] args) {
		
		temp = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de percurso: "));
		veloc = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade média: "));
		
		ProcLitrosGastos();
		
		JOptionPane.showMessageDialog(null, "Serão " + ltGastos + " litros gastos.");
	}
	
	static void ProcLitrosGastos()
	{
		ltGastos = ((temp*veloc)/12);
	}
}
