/*
********************************************************************************
Objetivo      	: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%
Programador   	: Kesia
Data criaÃ§Ã£o  : 07/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq02 
{
    public static void main (String args[])
    {
        double sal;
        
        sal = Integer.parseInt(JOptionPane.showInputDialog("INFORME O VALOR:"));
        sal = (sal*1.15);
        JOptionPane.showMessageDialog(null,"O REAJUSTE SERÃ�: "+sal);
    }
}
