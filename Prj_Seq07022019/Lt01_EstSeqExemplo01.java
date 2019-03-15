/*
********************************************************************************
Objetivo        : Primeiro programa em Java
Programador     : Kesia
Data criação    : 07/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeqExemplo01 
{
    public static void main (String args[])
    {
        int A,B,C;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DE A "));
        B = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR DE B "));
        C = (A + B);
        JOptionPane.showMessageDialog(null,"O VALOR DE C É "+C);
    }
}
