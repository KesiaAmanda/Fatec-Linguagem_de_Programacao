package Função;
/*
Objetivo:		Receba um numero. Calcule e mostre a série 1/1 + 1/2 + 1/3 + ... + 1/N.
Programador:	Kesia Amanda
Data:			02/03/2019
*/

import javax.swing.*;

public class Lt01_ModFunEx33 
{	
	public static void main (String args[])
	{        
		int valorLeitura;
		
        valorLeitura = Integer.parseInt(JOptionPane.showInputDialog("informe um valor: "));
        
        JOptionPane.showMessageDialog(null, "O Resultado da série até " + valorLeitura + " é:\n" + Serie(valorLeitura));         
    }
	
	static String Serie(int valorLeitura)
	{
		double cont;
		double valorSerie = 1;
		String result = "1";
		 
		for (cont = 2 ; cont <= valorLeitura ; cont ++ )
	    {
			valorSerie+=(1/cont);  
			result+=" + 1/"+cont; 
	    }
		
		result+=" = " + valorSerie;
		return result;
	}
} 

                    
               
                
                

