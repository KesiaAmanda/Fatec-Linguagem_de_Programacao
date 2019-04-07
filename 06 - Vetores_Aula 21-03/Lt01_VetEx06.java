/*
Objetivo:		Criar e coletar em um vetor[20]. Classificar este vetor em ordem crescente.
				A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua
				existência no vetor (utilizar pesquisa binária).
Programador:	Kesia Amanda
Data: 			21/03/2019
*/

import javax.swing.JOptionPane;

public class Lt01_VetEx06 {
	public static void main (String[] args) {
		int valorBusca;
		int vetValores[] = new int[20];
		lerValores(vetValores);
		classValores(vetValores);
		mostraOrdem(vetValores);
		valorBusca = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para busca:"));
		JOptionPane.showMessageDialog(null, BuscaValor(valorBusca,19,vetValores));
		
		
	}
	
	static int[] lerValores(int vet[]) {
		for (int cont=0;cont<=19;cont++) {
			vet[cont]=Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(cont+1)+"º valor:"));
		}
		return vet;
	}
	
	static int[] classValores(int vet[]) {
		int i;
		for (int cont=0;cont<=18;cont++) {
			for (int aux=(cont+1);aux<=19;aux++) {
				if (vet[cont]>=vet[aux]) {
					i = vet[cont];
					vet[cont] = vet[aux];
					vet[aux] = i;
				}
			}
		}
		return vet;
	}
	
	static void mostraOrdem(int vet[]) {
		String result = "Vetor em Ordem: ";
		for (int cont=0;cont<=19;cont++) {
			result+= vet[cont]+" ";
		}
		JOptionPane.showMessageDialog(null, result);
	}
	
	static String BuscaValor(int busca, int maior, int vet[]) {
		int meio , menor = 0; String result;
		do {
			meio = (menor+maior)/2;
			if (busca==vet[meio]) {
				return result = ("Valor encontrado na posição ["+meio+"]!");
			}
			if (busca>vet[meio]) {
				menor=meio;
			}else{
				maior=meio;
			}
		}while(maior>menor);
		return result = ("Valor não encontrado!");
	}
}