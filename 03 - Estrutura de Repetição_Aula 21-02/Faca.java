/*
Objetivo:		Mostra os 100 primeiros números positivos.
Programador:	Kesia Amanda
Data: 			21/02/2019
*/

public class Faca 
{
	public static void main (String args [])
	{  
        int cta = 0;
        
        do 
        {
            cta+=2;
            System.out.println("O numero �" + cta);
        }
        while (cta < 10);
        
        System.exit(0);
    }    
}

