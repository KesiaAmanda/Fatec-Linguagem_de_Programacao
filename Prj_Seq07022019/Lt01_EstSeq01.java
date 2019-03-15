/*
********************************************************************************
Objetivo   	  		: Coletar o valor do lado de um quadrado, calcular sua �rea e apresentar o resultado.
Programador 	 	: Kesia
Data criação	 	: 07/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq01 
{
    public static void main (String args[])
    {
        int qua;
        
        qua = Integer.parseInt(JOptionPane.showInputDialog("INFORME UM VALOR: "));
        qua = qua*qua;
        JOptionPane.showMessageDialog(null,"O VALOR DA AREA É: "+qua);    
    }
}