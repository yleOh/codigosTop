import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int a[], i, contpar=0, contimpar=0;
		a = new int[TAM];
	
		for(i =0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+ "º número:");
			a[i] = in.nextInt();
			if (a[i]%2 == 0) {
				contpar++;
			}else {
				contimpar++;
			}
		}
		System.out.println("Números inseridos:");
		for(i =0; i<TAM; i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println("\nSão pares: "+contpar);
		System.out.println("São ímpares: "+contimpar);
		}
	
}