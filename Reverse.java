package ejem;

public class Reverse {
	public static int[] reverseArray(int a[]) {
		
		for(int i = 0; i < a.length / 2; i++){
		    int aux = a[i];
		    a[i] = a[(a.length - i) - 1];
		    a[(a.length - i) - 1] = aux;
		}
		return a;
	}
}
