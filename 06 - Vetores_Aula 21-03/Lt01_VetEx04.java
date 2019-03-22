/*
Objetivo:		Criar e coletar em um vetor de [30] real e calcular e exibir:
				a. A média geral
				b. A quantidade de notas acima da média
				c. As posições dos vetores abaixo da média
Programador:	Kesia Amanda
Data:			21/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_VetEx04 {
	public static void main (String[] args){
		double media=0.0; double vetorNotas[] = new double[30];
		
		for (int cont = 0 ; cont<=29 ; cont++) {
			vetorNotas[cont] = Double.parseDouble(JOptionPane.showInputDialog("Informe a "+(cont+1)+"ª nota!"));
			media+= vetorNotas[cont];
		}
		media/=30;
		System.out.println("Média geral:\n"+media+"\nQuantidade de notas acima da média:\n"+FunAcimaMedia(media,vetorNotas));
		ProcAbaixoMed(media,vetorNotas);
	}
	
	static int FunAcimaMedia (double media, double notas[]) {
		int qtd=0;
		for (int cont=0;cont<=29;cont++) {
			if (notas[cont]>media) {
				qtd++;
			}
		}
		return qtd;
	}
	
	static void ProcAbaixoMed (double media, double notas[]) {
		System.out.println("Posições no vetor das notas abaixo da média:\n");
		for (int cont=0;cont<=29;cont++) {
			if (notas[cont]<media) {
				System.out.println(cont+" ");
			}
		}
	}
}
