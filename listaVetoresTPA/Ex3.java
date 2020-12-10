import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		final int TAM = 10;
		int a[], i, j, restozero=0;
		a = new int [TAM];
		
		for(j=0; j<TAM; j++) {
			System.out.println("Entre com o " + (j+1) + "º número");
			a[j] = in.nextInt();
			
			for(i=1; i<=a[j]; i++) {
				if (a[j]%i==0) {
					restozero++;
				}
			}
			if (a[j]==1) {
				System.out.println(a[j] + " não é primo");
			}else if (restozero<=2) {
				System.out.println(a[j] + " é primo");
			}else {
				System.out.println(a[j] + " não é primo");
			}
			restozero = 0;
		}
		}
	
	}