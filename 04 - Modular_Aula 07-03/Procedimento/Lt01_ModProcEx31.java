package Procedimento;
/*
Objetivo: 		Calcule e mostre o quadrado dos numeros entre 10 e 150.
Programador:	Kesia Amanda
Data:			02/03/2019
*/

public class Lt01_ModProcEx31 
{
	static Integer cta;
	static String result = "";
	
    public static void main (String args [])
    {
        for (cta = 10 ; cta <=150 ; cta++)
        {
            Quadrado();
        }
        
        System.out.println(result);
    }
    
    static void Quadrado()
    {
    	result+= "O Quadrado de " + cta + " é " + Math.pow(cta, 2) + ".\n";
    }
}
