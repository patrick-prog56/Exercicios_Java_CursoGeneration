package lacosderepeticao;

import java.util.Scanner;

public class Ex4_While {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int contador = 1, idade, humor, sexo, calma=0,mnervosa=0,hagressivo=0,ocalmo=0,meiaidadenervosa=0,
			jovemcalma=0;
		
				while(contador<=150) {
				
		System.out.println("\n\nDigite sua idade");
		idade = ler.nextInt();
		System.out.println("Digite seu sexo: ( 1-Feminino; 2-Masculino; 3-Outros) ");
		sexo = ler.nextInt();
		System.out.println("Digite seu humor: ( 1-Calma; 2-Nervosa; 3-agressiva) ");
		humor = ler.nextInt();
		contador++;
		
		
		if (humor==1) {
		calma = calma+1;
		}

		
		
		 if (sexo==1 && humor==2) {
			mnervosa = mnervosa+1;
		}
		 
		 
			 if (sexo==2 && humor==3) {
				hagressivo=hagressivo+1;
			}
			 
			 
			 if (sexo==3 && humor==1) {
				ocalmo = ocalmo+1;
			}
			
			 
			 
			 if (idade>40 && humor==2) {
				meiaidadenervosa = meiaidadenervosa+1;
				}
			
			 
			if (idade<18 && humor==1) {
				jovemcalma=jovemcalma+1;
				}
			
		}
				System.out.println("O número de pessoas calmas é: " + calma );
				System.out.println("O número de mulheres nervosas é: " + mnervosa );
				System.out.println("O número de homens agressivos é: " + hagressivo );
				System.out.println("O número de outros generos calmos é: " + ocalmo );
				System.out.println("O número de pessoas com mais de 40 anos e nervosas é: " + meiaidadenervosa );
				System.out.println("O número de pessoas calmas e com menos de 18 anos é: " + jovemcalma );
	}
}

		
		




