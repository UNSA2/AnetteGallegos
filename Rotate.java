package ejem;

public class Rotate {

	public static int[] rotateLeft(int a[], int d){
		int k = 0;
		while (k!=d) {
			int i;
			int aux = a[0];
			  for(i= 0; i<a.length-1; i++) {
			    a[i] = a[i+1];
			}
			  a[i]= aux;
			  k++;
		}
		  return a;
	}
}
