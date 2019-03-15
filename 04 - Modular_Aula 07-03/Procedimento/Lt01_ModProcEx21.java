package Procedimento;
/**
 * Objetivo:        Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
 *                  Mostre a mensagem de acordo com a média:
                        a. Se a média for >= 6,0 exibir “APROVADO”;
                        b. Se a média for >= 3,0 ou MENOR; 6,0 exibir “EXAME”;
                        c. Se a média for menor 3,0 exibir “RETIDO”.

 * Programadora:    Kesia
 * Data:            02/03/2019
 */

import javax.swing.JOptionPane;

public class Lt01_ModProcEx21 
{
	static Double media = 0.0;
	static String resultado;
	
    public static void main (String args[])
    { 
    	int cont;
        for (cont=0;cont<=3;cont++)
        {
            media+= Double.parseDouble(JOptionPane.showInputDialog("Informe "+(cont+1)+"ª nota:"));
        }
        
        media/=4;
        ResulSituacao();
        
        JOptionPane.showMessageDialog(null, resultado);
    }
    
    static void ResulSituacao()
    {
    	if (media>=6) 
        {
            resultado = "APROVADO!";
        }
        else if (media>=3)
        {
            resultado = "EXAME!";
        }
        else
        {
            resultado = "RETIDO!";
        }
    }
    
}
