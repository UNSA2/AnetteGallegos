package ejem;

public class Triangle {

	public static void recTriangle(int b){
		for (int i = -1; i < b; i++){
			for (int j = 0; j < i+2; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
