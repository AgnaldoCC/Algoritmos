package algoritmos;

import java.util.Arrays;

public class MergeSort implements Sorting {
	
	private final String nome = "MergeSort";
	

	@Override
	public void sort(int[] v) {
		mergeSort(v, 0, v.length - 1);
	}

	public void mergeSort(int[] v, int ini, int fim) {
		if (ini < fim) {

			int med = (ini + fim) / 2;
			mergeSort(v, ini, med);
			mergeSort(v, med + 1, fim);

			merge(v, ini, fim);

		}
	}

	private void merge(int[] v, int ini, int fim) {

		int[] aux = Arrays.copyOfRange(v, ini, fim + 1);

		int i = 0;
		int med = (aux.length -1) / 2;
		int j = med + 1;
		int k = ini;

		while (i <= med && j < aux.length) {
			if (aux[i] <= aux[j]) {
				v[k] = aux[i];
				i++;
			} else {
				v[k] = aux[j];
				j++;
			}
			k++;
		}

		while (i <= med) {
			v[k] = aux[i];
			k++;
			i++;
		}

		while (j < aux.length) {
			v[k] = aux[j];
			k++;
			j++;
		}

	}
	
	public String toString(){
		return this.nome;
	}

}
