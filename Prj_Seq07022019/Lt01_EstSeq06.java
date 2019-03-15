/*
********************************************************************************
Objetivo        : Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
Programador     : Kesia
Data criação    : 09/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq06 
{
	public static void main (String[] args)
	{
		int x, y, aux;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para X:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para Y:"));
		
		aux = x;
		x = y;
		y = aux;
		
		JOptionPane.showMessageDialog(null,"X = "+x+" e Y = "+y+".");
	}
}
