import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], c[], i, j, x, contIguais=0;
        a = new int[TAM];
        b = new int[TAM];
        
        for(i=0; i<TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º elemento de A");
            a[i] = in.nextInt();
        }
        
        for(i=0; i<TAM; i++) {
            System.out.println("Digite o " + (i+1) + "º elemento de B");
            b[i] = in.nextInt();
        }
        
        for(i=0; i<TAM; i++) {
            for (j=0; j<TAM; j++) {
                if (a[i] == b[j]) {
                    contIguais++;
                }
            }
        }
        
        if (contIguais == 0) {
            System.out.println("Não há elementos iguais, portanto, vetor C vazio.");
        }else {
            x=0;
            c = new int[contIguais];
            System.out.println("Elementos da intersecção de A e B: ");
            for (i = 0; i<TAM; i++) {
                for (j = 0; j<TAM; j++) {
                    if (a[i] == b[j]) {
                            c[x] = a[i];
                            System.out.print(c[x] + "  ");
                            x++;
                 }
             }
          }
            
        }
    }
    
}