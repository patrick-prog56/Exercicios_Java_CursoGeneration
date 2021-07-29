package vetores;

import java.util.Scanner;

public class Ex2_Vetores {
	public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);
	
	int [] numero = new int[6];
	int i, ip=0, par=0, soma=0,qtdImpar=0, ii=0;

	for (i=0;i<6;i++) {
	System.out.println("Digite os numeros");
	numero[i] = ler.nextInt();
	}
	System.out.println("Os números pares são:");

	for (ip=0;ip<6;ip++) {
	
	if (numero[ip]%2==0) {
		System.out.print( numero[ip]+", ");
		
		soma = numero[ip] + soma;	
	}
	}
	System.out.println("\n\nOs números ímpares são:");
	for (ii=0;ii<6;ii++) {
		
	if (numero[ii]%2!=0) {
	
		System.out.print(+numero[ii]+", ");
		
		qtdImpar= qtdImpar+1;
	}
	
	}
	
	System.out.println(" \n\nA soma dos números pares é: " + soma);
	System.out.println(" \n\nA quantidade dos numeros impares é : " + qtdImpar);
	

}

}

