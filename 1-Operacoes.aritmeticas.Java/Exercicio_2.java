package listaDeExercicios1;

import java.util.Scanner;

public class Exercicio_2 {
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3, maior=0, meio=0, menor=0;
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = ler.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = ler.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		numero3 = ler.nextInt();
		
		if (numero1>numero2 && numero1>numero3 && numero2>numero3) {
			maior = numero1;
			meio= numero2;
			menor= numero3;
			
		}
		else if (numero1>numero2 && numero1>numero3 && numero3>numero2) {
			maior = numero1;
			meio= numero3;
			menor= numero2;
		}
		
		else if (numero2>numero1 && numero2>numero3 && numero1>numero3) {
			maior = numero2;
			meio= numero1;
			menor= numero3;
			
		}
		else if (numero2>numero1 && numero2>numero3 && numero3>numero1) {
			maior = numero2;
			meio= numero3;
			menor= numero1;
			
		}
		else if (numero3>numero2 && numero3>numero1 && numero1>numero2) {
			maior = numero3;
			meio= numero1;
			menor= numero2;
			
		}
		else if (numero3>numero2 && numero3>numero1 && numero2>numero1) {
			maior = numero3;
			meio= numero2;
			menor= numero1;
			
			
		}
		
		
		System.out.println(" A ordem crescente dos numeros é: " + menor + " Depois " + meio + " E por fim " + maior + "..." ); 	
	}
}

		

