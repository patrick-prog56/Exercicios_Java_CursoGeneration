package patrickLista1;

import java.util.Scanner;
import java.lang.Math;

public class Ex4_d_rxs {
	public static void main(String[]args){
		
		

		double a, b, c;
		double d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("entre com o valor de A: ");
		a = ler.nextInt();

		
		System.out.println("entre com o valor de B: ");
		b = ler.nextInt();
		
		
		
		System.out.println("entre com o valor de C: ");
		c = ler.nextInt();

		
	     d = (Math.pow((a+b), 2) + Math.pow((b+c),2)/2);
	    		 System.out.println("O valor da potencição é: "+ d);
	    		 
	    		
	     
		}
	}



