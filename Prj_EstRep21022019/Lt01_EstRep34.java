/*
Objetivo:		Receba um numero N. Calcule e mostre os resultados da tabuada desse numero.
Programador:	Kesia Amanda
Data: 			21/02/2019
*/

import javax.swing.*;

public class Lt01_EstRep34 
{
	public static void main (String args[])
	{
		int valorLeitura, cont;
		
		valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
		
		System.out.println("Tabuada do "+valorLeitura+"!");
		
		for (cont = 1; cont <= 10 ; cont ++){
			System.out.println(valorLeitura + " x " + cont + " = " + (cont * valorLeitura));
		}       
        
    }
             
}
