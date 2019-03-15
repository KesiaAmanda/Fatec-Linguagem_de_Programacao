package Função;
/*
Objetivo:		Receba 2 numeros inteiros, verifique qual o maior entre eles. 
				Calcule e mostre o resultado da somatoria dos numeros impares entre esses valores.
Programador:	Kesia Amanda
Data: 			02/03/2019
*/

import javax.swing.*;

public class Lt01_ModFunEx35 
{
    public static void main (String args[])
    {
        int priValor, segValor;
        
        priValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        segValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        
        int aux;
    	if (priValor > segValor)
        {
            aux = priValor;
            priValor = segValor;
            segValor = aux;
        }
    	SomaImpar(priValor,segValor);
    	
        JOptionPane.showMessageDialog(null, "A soma dos numeros impares de " + priValor + " a " + segValor + " é igual a: " + SomaImpar(priValor,segValor));
    }
    
    static int SomaImpar(int priValor, int segValor)
    {
    	int valorSoma = 0;
    	for (int cont = priValor ; cont <= segValor ; cont ++)
        {
            if (cont % 2 != 0)
            {
         	   valorSoma+=cont;
            }
        }
    	return valorSoma;
    }
}
