package matrizes;

import java.util.Scanner;

public class Ex2_Matrizes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[][] matriz1 = new double[2][2];
		double[][] matriz2 = new double[2][2];
		double[][] matriz3 = new double[2][2];
		int l = 0, c = 0, constante = 0;
		char opcao=0;

		System.out.println("Digite os valolres da primeira matriz: ");
		for (l = 0; l < matriz1.length; l++) {
			for (c = 0; c < matriz1.length; c++) {

				matriz1[l][c] = ler.nextDouble();
			} // segundo for matriz 1
		} // primeiro for matriz 1
		System.out.println("Digite os valores da segunda matriz: ");
		for (l = 0; l < matriz2.length; l++) {
			for (c = 0; c < matriz2.length; c++) {

				matriz2[l][c] = ler.nextDouble();

			} // segundo for matriz 2
		} // primeiro for matriz 2
		while (opcao!='5') {
			System.out.println();
			System.out.println();
			System.out.println();
		System.out.println(" Digite a opção desejada: ");
		System.out.println(" [1] - Somar as duas matrizes ");
		System.out.println(" [2] - Subtrair a primeira matriz da segunda ");
		System.out.println(" [3] - Adicionar uma constante as duas matrizes ");
		System.out.println(" [4] - Imprimir as matrizes ");
		System.out.println(" [5] - Sair ");
		

		opcao = ler.next().charAt(0);// leitura do char que é um pouco diferente.

		switch (opcao) {

		case '1':
			for (l = 0; l < matriz3.length; l++) {

				for (c = 0; c < matriz3.length; c++) {

					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];// vai rodando a condição e somando oo matriz 1 + 00
																	// matriz 2 e assim por diante até preencher toda a
																	// matriz com a soma das duas e vai jogar as somas
																	// nas posições dentro da matriz 3.
					System.out.print(matriz3[l][c] + " | ");
				}
			}
			break;

		case '2':
			for (l = 0; l < matriz3.length; l++) {

				for (c = 0; c < matriz3.length; c++) {

					matriz3[l][c] = matriz1[l][c] - matriz2[l][c];// vai rodando a condição e subtraindo oo matriz 1 +
																	// 00
																	// matriz 2 e assim por diante até preencher toda a
																	// matriz com a soma das duas e vai jogar as somas
																	// nas posições dentro da matriz 3.
					System.out.print(matriz3[l][c] + " | ");
				}
			}
			break;

		case '3':
			System.out.println("Digite a constante desejada: ");
			constante = ler.nextInt();
			System.out.println("Matriz 1");
			for (l = 0; l < matriz1.length; l++) {
				for (c = 0; c < matriz1.length; c++) {
					matriz1[l][c] = matriz1[l][c] + constante;
					System.out.print(matriz1[l][c] + " | ");

				}
			}
			System.out.println("\nMatriz 2");
			for (l = 0; l < matriz2.length; l++) {
				for (c = 0; c < matriz2.length; c++) {
					matriz2[l][c] = matriz2[l][c] + constante;
					System.out.print(matriz2[l][c] + " | ");
				}
			}
			break;

		case '4':
			System.out.println("Matriz 1");
			for (l = 0; l < matriz1.length; l++) {
				for (c = 0; c < matriz1.length; c++) {
					System.out.print(matriz1[l][c] + " | ");
				}
			}
			System.out.println("\nMatriz 2");
			for (l = 0; l < matriz2.length; l++) {
				for (c = 0; c < matriz2.length; c++) {
					System.out.print(matriz2[l][c] + " | ");
				}
			}
			break;
		case '5':
			System.out.println(" Fim do programa !!! ");
			break;
		default: // caso o usuario não digitar números do 1 ao 4 encerra o programa.
			System.out.println("Você digitou um número inválido.");
		}//While
		}

	}// main

}// classe
