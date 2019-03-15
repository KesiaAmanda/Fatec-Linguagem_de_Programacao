package Procedimento;
/**
 * Objetivo:        Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
 *                  Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 * Programadora:    Kesia
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx20 
{
	static Integer coefA, coefB, coefC, valorDelta;
	static String resultado;
	
    public static void main (String args[])
    {
        coefA = Integer.parseInt(JOptionPane.showInputDialog("Informe o coeficiente A:"));
        coefB = Integer.parseInt(JOptionPane.showInputDialog("Informe o coeficiente B:"));
        coefC = Integer.parseInt(JOptionPane.showInputDialog("Informe o coeficiente C:"));
        
        CalcDelta();
        EquaSegGrau();
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    static void CalcDelta()
    {
    	valorDelta = ((coefB*coefB)-4*coefA*coefC);
    }
    
    static void EquaSegGrau()
    {
    	if (valorDelta>0)
        {
            resultado = "Existem duas raizes reais e elas são: " + ((-coefB)+Math.sqrt(valorDelta)/2*coefA) + " e " + ((-coefB)-Math.sqrt(valorDelta)/2*coefA);
        }
        else if (valorDelta==0)
        {
            resultado = "Existem duas raízes iguais :" + ((-coefB)+Math.sqrt(valorDelta)/2*coefA);
        }
        else
        {
            resultado = "Delta Negativo, não existem raizes!";
        }
    }
}
