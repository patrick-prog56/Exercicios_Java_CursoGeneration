package patrickLista1;

import java.util.Scanner;

public class Ex7_EquacaoLinear {
	
	public static void main (String []args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, j, f, g, x, y;
		  
		System.out.println("Digite o valor de a: ");
		a = ler.nextInt();
 
		System.out.println("Digite o valor de b: ");
		b = ler.nextInt();

		System.out.println("Digite o valor de c: ");
		c = ler.nextInt();
 
		System.out.println("Digite o valor de d: ");
		d = ler.nextInt();
 
		System.out.println("Digite o valor de j: ");
		j = ler.nextInt();
 
		System.out.println("Digite o valor de f: ");
		f = ler.nextInt();
 
		System.out.println("Digite o valor de g: ");
		g = ler.nextInt();
		
 		x = ((c*j)-(b*f))/((a*j)-(b*d));
			y = ((a*f)-(c*d))/((a*j)-(b*d));
 
			System.out.println("O valor de x é " + x + " e y é " + y);
}

	}

