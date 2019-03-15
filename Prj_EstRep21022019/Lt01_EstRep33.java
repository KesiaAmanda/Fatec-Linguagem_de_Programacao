/*
Objetivo:		Receba um numero. Calcule e mostre a série 1/1 + 1/2 + 1/3 + ... + 1/N.
Programador:	Kesia Amanda
Data:			21/02/2019
*/

import javax.swing.*;

public class Lt01_EstRep33 
{
	public static void main (String args[])
	{
        double valorSerie = 0, valorLeitura, cont;
        
        valorLeitura = Double.parseDouble(JOptionPane.showInputDialog("informe um valor: "));
        
        for (cont = 1 ; cont <= valorLeitura ; cont ++ )
        {
        	valorSerie+=(1/cont);            
        }
        
        System.out.println("A série é: "+ valorSerie);            
    }
} 

                    
               
                
                

