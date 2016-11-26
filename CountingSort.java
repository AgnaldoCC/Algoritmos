package algoritmos;

import java.util.Arrays;

public class CountingSort {

	public static int[] countingSort(int[] v, int k) {

		int[] c = new int[k + 1];
		int[] b = new int[v.length];

		for (int i = 0; i < c.length; i++) {
			c[i] = 0;
		}

		for (int i = 0; i < v.length; i++) {
			c[v[i]]++;
		}

		for (int i = 1; i < c.length; i++) {
			c[i] += c[i - 1];
		}

		for (int i = 0; i < v.length; i++) {
			b[c[v[i]] - 1] = v[i];
			c[v[i]]--;
		}

		return b;
	}

	public static void main(String[] args) {

		int[] v = new int[] { 1, 8, 3, 4, 6, 7, 2, 5 };
		int[] ordenado = countingSort(v, 8);
		System.out.println(Arrays.toString(ordenado));

	}

}
