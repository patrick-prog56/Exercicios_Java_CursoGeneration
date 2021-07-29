package patrickLista1;

import java.util.Scanner;

public class Ex8_EquacaoLinear {
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, distribuidor;

		System.out.println("Digite o valor do custo de Fabrica ");
		custoFabrica = ler.nextInt();

		distribuidor = custoFabrica + (custoFabrica*0.25);
		custoConsumidor = distribuidor + (distribuidor*0.45);
		System.out.println("Custo do consumidor: " + custoConsumidor);
	}

	}


