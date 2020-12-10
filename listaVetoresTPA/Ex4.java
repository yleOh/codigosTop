import java.lang.Math;
public class Ex4 {
	public static void main(String[] args) {
		final int TAM = 11;
		int i;
		double a[], pot;
		a = new double [TAM];
		
		for(i=0; i<TAM; i++) {
			pot = Math.pow(2, i);
			a[i] = pot;
		}
		System.out.print("A[i] = ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i] + "   ");
		}
	}
}