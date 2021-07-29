package lacosderepeticao;

import java.util.Scanner;

public class Ex6_DoWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x, soma=0,multiplos=0,contador=0,media=0;
		
		
		do
		{
			System.out.println("Digite os numeros: ");
			x = ler.nextInt();
			if (x%3==0 && x!= 0) {
				
				contador = contador+1;
				multiplos= (x+multiplos);
				media = multiplos/contador;	
			}
			
		} while (x!=0);
		
		System.out.println("A média dos numeros multiplos de 3 é: " + media);
	}
	
}