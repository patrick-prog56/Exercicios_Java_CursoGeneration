package patrickLista1;

import java.util.Scanner;

public class Ex5_MediaPonderada {
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		  double n1, n2, n3, media;
		  int p1 = 2;
		  int p2 = 3;
		  int p3 = 5;

   			
		  System.out.println("\nInsira o valor da primeira nota: ");
		  n1 = ler.nextInt();

		  System.out.println("\nInsira o valor da segunda nota: ");
		  n2 = ler.nextInt();
		  
		  System.out.println("\nInsira o valor da terceira nota: ");
		  n3 = ler.nextInt();
		  
   			media = ((n1*p1) + (n2*p2) + (n3*p3))/(p1+p2+p3);
   		 System.out.println("A média é: \n" + media);
	}
	}


