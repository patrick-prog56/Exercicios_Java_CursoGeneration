package patrickLista1;

import java.util.Scanner;

public class Ex2_IdadeEmAnos {
	public static void main (String[]args) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, totalDias;
	

		System.out.println("Digite a quantidade de Dias\n");
		totalDias = ler.nextInt();

		anos = totalDias /365;

		int bissexto = anos / 4;

		dias = totalDias% 365 - bissexto ;

		meses = dias/30;

		dias = dias%30;

		System.out.println("A idade é : " + anos + " anos");
		System.out.println("\nA quantidade de meses é : " + meses + " meses");
		System.out.println("\nA quantidade de dias é : " + dias + " dias"); 
	}
}


