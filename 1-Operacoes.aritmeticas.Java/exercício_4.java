package listaDeExercicios1;

import java.util.Scanner;
import java.math.*;

public class exerc�cio_4 {
public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, resultado;
		
		System.out.println("Digite sua idade: ");
		numero = ler.nextInt();
		
		if (numero%2 == 0) {
			resultado = (double) Math.sqrt (numero) ;
			System.out.println("O n�mero " + numero + " � par e o resultado de sua raiz �: " + resultado);
			
		
			
		}
		else {
			resultado = (double) Math.pow (numero, 2);
			System.out.println("O n�mero " + numero + " � impar e o resultado de seu quadrado �: " + resultado);
		}
			
		
}
}