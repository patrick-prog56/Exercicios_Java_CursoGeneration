package lacosderepeticao;

import java.util.Scanner;

public class Ex5_DoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, soma=0;
		
		do
		{
			System.out.println("Digite os numeros: ");
			x = ler.nextInt();
			soma=soma+x;
		
		} while (x!=0);
		
		System.out.println("A soma dos numeros é: " + soma);
			



	}
}