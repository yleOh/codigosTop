import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int id, qtp=0, qps=0;
		double h, qh=0, sh=0, ps, maior=0, menor=99;
		for (int p=1; p<26; p++) {
			System.out.println("Digite a idade da "+p+"º pessoa.");
			id = in.nextInt();
			System.out.println("Digite a altura da "+p+"º pessoa.");
			h = in.nextDouble();
			System.out.println("Digite o peso da "+p+"º pessoa.");
			ps = in.nextDouble();
			if (id>50) {
				qtp++;
			}
			if ((id>10) && (id<20)) {
				qh++;
				sh = h + sh;
			}
			if (ps<40) {
				qps++;
			}
			if (id>maior) {
				maior = ps;
			}else if (id<menor){
				menor = ps;
			}
		}
		
		if (qtp>0) {
		System.out.println("Quantidade de pessoas com idade superior a 50 anos: "+qtp);
		}else {
			System.out.println("Quantidade de pessoas com idade superior a 50 anos: Nenhuma");
		}
		
		if (qh>0) {
		System.out.println("Média das alturas das pessoas com idade entre 10 a 20 anos: "+sh/qh+" m");
		}else {
			System.out.println("Média das alturas das pessoas com idade entre 10 a 20 anos: Não possui");
		}
		
		System.out.println("Porcentagem de pessoas com peso inferior a 40 quilos: "+(qps*100)/25+"%");
		
		System.out.println("Peso da pessoa mais velha: "+maior+" kg");
		System.out.println("Peso da pessoa mais nova: "+menor+" kg");
		
		in.close();
	}
}