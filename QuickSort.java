package algoritmos;

public class QuickSort implements Sorting {
	
	private final String nome = "QuickSort";
	
	@Override
	public void sort(int[] v) {

		quickSort(v, 0, v.length - 1);

	}

	public int particiona(int[] v, int ini, int fim) {

		int pivot = v[ini];
		int j = ini;

		for (int i = ini + 1; i <= fim; i++) {
			if (v[i] < pivot) {
				j++;
				troca(v, j, i);
			}
		}

		troca(v, ini, j);
		return j;
	}

	public void quickSort(int[] v, int ini, int fim) {

		if (ini < fim) {

			int pos_pivot = particiona(v, ini, fim);

			quickSort(v, ini, pos_pivot - 1);

			quickSort(v, pos_pivot + 1, fim);
		}
	}

	public static void troca(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;

	}
	
	public String toString(){
		return this.nome;
	}

}
