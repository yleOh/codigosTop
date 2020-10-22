public class Ex1 {
	public static void main(String[] args) {
		int r;
		for (int n=1; n<11; n++) {
		System.out.println("Tabuada do número "+n+":");
		for(int i=1; i<11; i++) {
			r = n*i;
			System.out.println(n+" x "+i+" = "+r);
		}
		}
	}
}