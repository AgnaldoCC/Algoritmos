package algoritmos;

import java.util.Arrays;

public class CountingSort<T extends Comparable<T>> {
	
	public void countingSort(int[] v, int maior, int menor){
		
		int[] c = new int[maior - menor + 1];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = 0;
		}
		
		for (int i = 0; i < v.length; i++) {
			c[v[i] - menor]++;
		}
		
		for (int i = 1; i < c.length; i++) {
			c[i] += c[i-1];
		}
		
		int[] b = new int[v.length];
		
		for (int i = 0; i < b.length; i++) {
			b[c[v[i] - menor] - 1] = v[i];
			c[v[i] - menor]--;
		}
		
		for (int i = 0; i < v.length; i++) {
			v[i]= b[i];
		}
	}
	
	public static void main(String[] args) {
		CountingSort<Integer> cs = new CountingSort<>();
		
		int[] v = new int[]{3,0,-3,-1,5,1};
		
		cs.countingSort(v,5,-3);
		
		System.out.println(Arrays.toString(v));
	}

}
