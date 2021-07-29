package patrickLista1;

import java.util.Scanner;

public class Ex1_IdadeEmAnos {
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);

		int meses, dias, anos, bissexto, diasTotais;

	 

		System.out.println("Informe sua idade em anos, meses e dias\n");
		System.out.println("Anos: ");
		anos = ler.nextInt();

		System.out.println("Meses: ");
		meses = ler.nextInt();

		System.out.println("Dias: ");
		dias = ler.nextInt();

		bissexto = (anos/4); 

		diasTotais = bissexto + (anos * 365) + (meses * 30) + dias;

				System.out.println("Sua idade em dias é: " + diasTotais);
	

}
}
