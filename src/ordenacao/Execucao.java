package ordenacao;

public class Execucao {

	public static void main(String[] args) {
		
		System.out.println("ATIVIDADE SOMATIVA 2: Métodos de ordenação - Bubble Sort (recursivo) e Selection Sort." + "\n\n" + "Alunos: " + "\n" + "JOYCE MAYARA GONCALVES DE OLIVEIRA" + "\n" + "KARIME ARRIGO RODRIGUES KUMAGAI" + "\n" + "KATHLYN DOS SANTOS" + "\n" + "LUCAS DE OLIVEIRA WENCESLAU" + "\n" + "RODRIGO HIROITO NISHIZAWA SOARES" + "\n\n");
		
		
		int[] vetorA = {3, 6, 8, 1, 4, 9, 0};
		System.out.println("Vetor original: ");
		Ordenacao.imprime(vetorA);
		System.out.println("");
		Ordenacao.bubble(vetorA, vetorA.length);
		System.out.println("\n" + "Vetor após aplicação de algoritmo Bubble Sort recursivo: ");
		Ordenacao.imprime(vetorA);
		
		System.out.println("\n\n" + "--------------------" + "\n");
		
		int[] vetorB = {3, 6, 8, 1, 4, 9, 0};
		System.out.println("Vetor original: ");
		Ordenacao.imprime(vetorB);
		System.out.println("");
		Ordenacao.selection(vetorB);
		System.out.println("\n" + "Vetor após aplicação de algoritmo Selection Sort: ");
		Ordenacao.imprime(vetorB); 
	}
}
