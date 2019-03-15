/*
Objetivo:		Receba 2 numeros inteiros, verifique qual o maior entre eles. 
				Calcule e mostre o resultado da somatoria dos numeros impares entre esses valores.
Programador:	Kesia Amanda
Data: 			21/02/2019
*/

import javax.swing.*;

public class Lt01_EstRep35 
{
    public static void main (String args[])
    {
        int valorSoma = 0, priValor, segValor, aux, cont;
        
        priValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        segValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        if (priValor > segValor)
        {
            aux = priValor;
            priValor = segValor;
            segValor = aux;
        }
            
            
               for (cont = priValor ; cont <= segValor ; cont ++)
               {
                   if (cont % 2 != 0)
                   {
                	   valorSoma+=cont;
                   }
               }
                System.out.println("A soma dos numeros impares é igual à: " + valorSoma);
    }
    
}
