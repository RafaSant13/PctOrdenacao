package view;

import br.edu.fateczl.ordenacao.bubblesort.BubbleSort;
import br.edu.fateczl.ordenacao.mergesort.MergeSort;

public class Principal {

	public static void main(String[] args) {
		int [] vetor = {17, 33, 44, 61, 85, 99, 100};
		BubbleSort bs = new BubbleSort();
		int [] vetor1 = bs.bubbleSort(vetor);
		for (int i : vetor1) {
			System.out.println(i + " ");
		}
		System.out.println("Ordenação Bubble Sort");
		
		MergeSort ms = new MergeSort();
		int tamanho = vetor.length; 
		int [] vetor2 = ms.mergeSort(vetor1, 0, tamanho -1);
		for (int i : vetor2) {
			System.out.println(i + " ");
		}
		System.out.println("Ordenação Merge Sort");
	}

}
