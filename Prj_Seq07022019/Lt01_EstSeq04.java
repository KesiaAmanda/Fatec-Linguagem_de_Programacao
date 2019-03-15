/*
********************************************************************************
Objetivo        : Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq04 
{
	public static void main (String args[])
	{
		int temp;
		
		temp = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura em Celcius: "));
		JOptionPane.showMessageDialog(null,"Temperatura em Fahrengeit:"+(((9*temp)+160)/5));
	}
}
