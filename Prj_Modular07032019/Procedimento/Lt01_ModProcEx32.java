package Procedimento;
/*
Objetivo:		Receba um numero inteiro. Calcule e mostre o seu fatorial.
Programador:	Kesia Amanda
Data:			02/03/2019

*/

import javax.swing.*;

public class Lt01_ModProcEx32 
{
	static Integer valorLeitura, valorFat = 1;
	
    public static void main (String args[])
    {        
        valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        
        Fatorial();
        
        JOptionPane.showMessageDialog(null, "O valor de " + valorLeitura + " fatorial é: "+ valorFat);
    }
    
	static void Fatorial()
	{
        for (int cont = 2 ; cont <= valorLeitura ; cont ++)
        {
        	valorFat*=cont;                            
        }
	}
}
