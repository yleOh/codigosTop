import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 15;
		int a[], b[], j, i, fat;
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " + (i+1) +"º número inteiro:");
			a[i] = in.nextInt();
		}
			System.out.println("Vetor B[]:");
			for(i=0; i<TAM; i++) {
				fat = 1;
				for(j=1; j<=a[i]; j++) {
					fat = fat * j;
				}
				b[i] = fat;
				System.out.print(b[i] + "  ");
			}
	}
}