package ordenacao;

public class Ordenacao {
	
	public static void imprime(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}

	// Método que realiza a troca dos valores das posições com a utilização de variável auxiliar.
	private static void troca(int[] vetor, int pos1, int pos2) {
		int aux = vetor[pos1];
		vetor[pos1] = vetor[pos2];
		vetor[pos2] = aux;
	}
	
	// Implementação do algoritmo bubble sort de forma recursiva. 
	// O método recebe o vetor e 'n' sendo a quantidade de elementos ainda não ordenados. 
	public static void bubble(int[] vetor, int n) {
		// Se possui menos de dois elementos, retorna.
		if (n < 2) {
			return;
		}
		// Flag para dizer se houve troca;
		boolean trocou = false;
		// Percorre o vetor até a penúltima posição realizando comparações;
		for (int i = 0; i < n - 1; i++) {
			// Se o item atual é maior que o próximo item, troca e liga o flag;
			if (vetor[i] > vetor [i+1]) {
				Ordenacao.troca(vetor, i, i+1);
				trocou = true;
			}
		}
		// Somente continua a ordenação se houve alguma troca, senão é porque o vetor está ordenado. 
		if (trocou) {
			Ordenacao.bubble(vetor, n -1);
		}
	}
	
	// Implementação do algoritmo selection sort.
	public static void selection(int[] vetor) {
		// Para cada elemento do vetor: 
		for (int i = 0; i < vetor.length - 1; i++)  {
			// Procura a posição do menor elemento da posição i em diante;
			int posMenor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[posMenor]) {
					posMenor = j;
				}
			}
			// Se a posição encontrada é diferente da posição inicial, troca.
			if (i != posMenor) {
				Ordenacao.troca(vetor, i, posMenor);
			}
		}
	}
}	