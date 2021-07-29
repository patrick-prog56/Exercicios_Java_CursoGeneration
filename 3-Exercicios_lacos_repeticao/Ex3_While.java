package lacosderepeticao;

import java.util.Scanner;

public class Ex3_While {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, menor=0, maior=0;
				
				while(idade!=-99) {
		System.out.println("Digite as idades: ");
		idade = ler.nextInt();
		
		
		if (idade<21) {
		menor = menor+1;
		}
		
		else if (idade>50) {
			maior = maior+1; //ou maior++
		      }
		
		
		
		  }
				System.out.println("O total de pessoas com idade menor de 21 anos é: " + (menor-1));
				System.out.println("O total de pessoas com idade maior de 50 anos é: " + maior);
 	   }

   }
