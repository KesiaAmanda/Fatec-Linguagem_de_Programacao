/*
Objetivo:		Receba um numero inteiro. Calcule e mostre o seu fatorial.
Programador:	Kesia Amanda
Data:			21/02/2019

*/

import javax.swing.*;

public class Lt01_EstRep32 
{
    public static void main (String args[])
    {
        int valorLeitura, valorFat = 1, cont;
        
        valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        
        for (cont = 1 ; cont <= valorLeitura ; cont ++)
        {
        	valorFat*=cont;                            
        }
        
        System.out.println("O fatorial é: "+ valorFat);
    }
    
}
