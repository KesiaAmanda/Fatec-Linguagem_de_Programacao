/*
********************************************************************************
Objetivo        : Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq05 
{
	public static void main (String args[])
	{
		int a, b, c; 
		double del;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A:"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B:"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de C:"));
		
		del = ((Math.pow(b,2))-(4*a*c));
		
		if (del<0) {
			JOptionPane.showMessageDialog(null,"Nenhuma raiz real.");
		}
		else if (del>0) {
			JOptionPane.showMessageDialog(null, "Existem duas raízes reais e elas são "+((-b) + Math.sqrt(del))/(2*a) +" e "+(((-b) - Math.sqrt(del))/(2*a))+".");
		}
		else {
			JOptionPane.showMessageDialog(null,"A equação possui duas raizes iguais "+(((-b)+Math.sqrt(del))/(2*a))+" e "+(((-b)-Math.sqrt(del))/(2*a))+".");
		}
	}
}
