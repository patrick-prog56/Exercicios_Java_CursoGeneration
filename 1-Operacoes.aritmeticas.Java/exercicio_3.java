package listaDeExercicios1;

import java.util.Scanner;

public class exercicio_3 {
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Você é infantil !!!");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Você é juvenil !!!");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Você é adulto !!!");
		}
		else
			System.out.println("Você digitou uma idade inválida, digite uma idade de 10 a 25 anos !!!");
				
	}

}
