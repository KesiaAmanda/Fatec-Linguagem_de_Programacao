package Procedimento;
/*
********************************************************************************
Objetivo        : Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
				  Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). 	
				  A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
Programador     : Kesia
Data criação    : 02/03/2019
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_ModProcEx16 {
	static Integer descen;
	static Double horast, valorh, percd, salarioLiq;
	
	public static void main (String[] args) {
		
		horast = Double.parseDouble(JOptionPane.showInputDialog("Informe as horas trabalhadas: "));
		valorh = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por hora: "));
		percd = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto: "));
		descen = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de descendentes: "));
		
		CalcSalLiq();
		
		JOptionPane.showMessageDialog(null, "Sálario liquido é igual à "+ salarioLiq );
	}
	
	static void CalcSalLiq()
	{
		salarioLiq = (((horast*valorh)*((100-percd)/100))+(descen*100));
	}
	
}
