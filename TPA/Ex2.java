import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int id, fx1=0, fx2=0, fx3=0, fx4=0, fx5=0;
		for (int n=1; n<16; n++) {
			System.out.println("Digite a idade da "+n+"º pessoa.");
			id = in.nextInt();
			if ((id>=1) && (id<=15)){
				fx1 = fx1+1;
			}else if ((id>=16) && (id<=30)){
				fx2 = fx2+1;
			}else if ((id>=31) && (id<=45)){
				fx3 = fx3+1;
			}else if ((id>=46) && (id<=60)){
				fx4 = fx4+1;
			}else if (id>=61) {
				fx5 = fx5+1;
			}
		}
		System.out.println("Quantidade de pessoas na faixa etária 1 (Até 15 anos): " +fx1);
		System.out.println("Quantidade de pessoas na faixa etária 2 (De 16 a 30 anos): " +fx2);
		System.out.println("Quantidade de pessoas na faixa etária 3 (De 31 a 45 anos): " +fx3);
		System.out.println("Quantidade de pessoas na faixa etária 4 (De 46 a 60 anos): " +fx4);
		System.out.println("Quantidade de pessoas na faixa etária 5 (Acima de 61 anos): " +fx5);
		System.out.println();
		System.out.println("Porcentagem de pessoas na faixa etária 1: " +((fx1*100)/15)+"%");
		System.out.println("Porcentagem de pessoas na faixa etária 2: " +((fx2*100)/15)+"%");
		System.out.println("Porcentagem de pessoas na faixa etária 3: " +((fx3*100)/15)+"%");
		System.out.println("Porcentagem de pessoas na faixa etária 4: " +((fx4*100)/15)+"%");
		System.out.println("Porcentagem de pessoas na faixa etáris 5: " +((fx5*100)/15)+"%");
		in.close();
	}
}