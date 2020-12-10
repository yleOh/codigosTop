import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
		int a[], i, j, n;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o " + (i+1) + "º elemento:");
			a[i] = in.nextInt();
		}

		System.out.println("Entre com um número para ver se ele está no vetor A:");
		n = in.nextInt();
		
		for(i=0; i<TAM; i++) {
			if (a[i] == n) {
				System.out.println("O número " + n + " foi encontrado na posição " + i + " do vetor A[]");
			}
		}
		
		System.out.print("A[] = ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i] + " ");
		}
	}
}