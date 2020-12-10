import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
		int a[], b[], c[], i;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º elemento do vetor A[]:");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) + "º elemento do vetor B[]:");
			b[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			c[i] = a[i] - b[i];
		}
		
			System.out.println("Diferença dos conjuntos formados pelos elementos de A[] e de B[]:");
	      for (i=0; i<TAM; i++) {
	        System.out.print(c[i] + "  ");
	      }
	}
}