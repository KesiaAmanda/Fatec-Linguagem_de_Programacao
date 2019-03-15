/*
********************************************************************************
Objetivo        : Receba a base e a altura de um triângulo. Calcule e mostre a sua área
Programador     : Kesia
Data criação    : 07/02/2019 
********************************************************************************
*/

import javax.swing.JOptionPane;

public class Lt01_EstSeq03 
{
    public static void main(String args[])
    {
        int alt,bas;
        
        alt = Integer.parseInt(JOptionPane.showInputDialog("INFORME A ALTURA:"));
        bas = Integer.parseInt(JOptionPane.showInputDialog("INFORME A BASE: "));
        JOptionPane.showMessageDialog(null,"A AREA É IGUAL À: "+((alt*bas)/2));
    }
}
