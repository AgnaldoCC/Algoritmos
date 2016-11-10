package algoritmos;

import java.util.Arrays;

public class Sort {

	public static void selectionSort(int[] v) {

		for (int j = 0; j < v.length; j++) {

			int index_menor = j;

			for (int i = j + 1; i < v.length; i++) {

				if (v[index_menor] > v[i]) {
					index_menor = i;
				}

			}

			troca(v, j, index_menor);

		}

	}

	public static void insertionSort(int[] v) {

		for (int i = 1; i < v.length; i++) {

			int index = i;

			while (index > 0 && v[index - 1] > v[index]) {
				troca(v, index, index - 1);
				index--;
			}

		}

	}

	public static void bubbleSort(int[] v) {

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length - 1 - i; j++) {
				if (v[j + 1] < v[j]) {
					troca(v, j, j + 1);
				}

			}
		}

	}

	public static void troca(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	public static void main(String[] args) {

		int[] v = new int[] { 5, 4, 3, 2, 1, -9, 11, 87 };

		int[] a = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		int[] x = new int[] { 5, 4, 4, 3, 2, 2, 1 };

		selectionSort(a);
		insertionSort(x);
		bubbleSort(v);

		System.out.println(Arrays.toString(v));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(x));

	}

}
