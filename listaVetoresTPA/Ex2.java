import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 5;
		int a[], i, j, res;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+ "º número:");
			a[i] = in.nextInt();
			if (a[i] > 0) {
				System.out.println("Tabuada do número " + a[i] + ":");
				for(j=1; j<=10; j++) {
				res = a[i] * j;
				System.out.println(a[i] + " x " + j + " = " + res);
				}
				System.out.println(" ");
			}else if (a[i] == 0) {
				System.out.println("Não existe tabuada nula.");
				System.out.println(" ");
			}else {
				System.out.println("Não existe tabuada negativa.");
				System.out.println(" ");
			}
		}
		in.close();
	}
}