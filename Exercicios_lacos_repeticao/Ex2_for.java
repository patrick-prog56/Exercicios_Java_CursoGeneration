package lacosderepeticao;

import java.util.Scanner;

public class Ex2_for {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int contador, numero=0, par=0, impar=0;
		
		for(contador=1;contador<=10;contador++) {
		
			
		System.out.println("Digite os numeros: ");
		numero = ler.nextInt();
		if (numero%2==0) {
			
			par=par+1;
			
		}
			else {
			
				impar= impar+1;	
			}
		
		}

		System.out.println(" A quantidade de número par é: " + par);
		System.out.println(" A quantidade de número impar é: " + impar);
		
	}
	
}

