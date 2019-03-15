/*
********************************************************************************
Objetivo        : Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq07 
{
	public static void main (String[] args)
	{
		int com, lar, alt;
	
		com = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento: "));
		lar = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura: "));
		alt = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura: "));
		
		JOptionPane.showMessageDialog(null,"O Volume é igual à: "+(com*lar*alt)+"cm³.");
	}
}
