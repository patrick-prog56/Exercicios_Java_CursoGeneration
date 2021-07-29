package patrickLista1;

import java.util.Scanner;

public class Ex6_Radiciacao {
	public static void main (String[]args){
		
		Scanner ler = new Scanner(System.in);
		
		double potencia1, potencia2, x1, x2, y1, y2, d;
		
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextInt();


		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextInt();

		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextInt();

		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextInt();

		potencia1 = (Math.pow((x2-x1), 2));
		potencia2 = (Math.pow((y2-y1), 2));

		d = (Math.sqrt((potencia1 + potencia2)));
		
		System.out.println("O Resultado é = " + d);
		
		
		
			
		}
	}

