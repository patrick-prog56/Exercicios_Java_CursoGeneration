package listaDeExercicios1;

import java.util.Scanner;

public class exercicio_3 {
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Voc� � infantil !!!");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Voc� � juvenil !!!");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Voc� � adulto !!!");
		}
		else
			System.out.println("Voc� digitou uma idade inv�lida, digite uma idade de 10 a 25 anos !!!");
				
	}

}
