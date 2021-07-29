package matrizes;

import java.util.Scanner;

public class Ex1_Matrizes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] matriz = new int [3][3];// quem vai ser lido = matriz.Length é o tamanho dea variavel "numero", tanto em linha quanto coluna. ou seja, length tem 3 espaços em coluna e 3 espaços em linha, por isso quando declarado embaixo no for o l tem que ser menor que length e também c tem que ser menor que length.
		int l,c, contaMaiorqueDez=0;
		
		System.out.println("Digite os valores da Matriz: ");
		for(l=0; l<matriz.length;  l++){ // for(l=0; l<3 ;  l++); l inicia em 0, depois ele tem que ser menor que o tamanho de linhas da matriz, acontecendo isso, acrescenta mais 1.
			for(c=0; c<matriz.length; c++){
				
				
				matriz[l][c] = ler.nextInt();
				
				if (matriz[l][c]>10) {
					contaMaiorqueDez = contaMaiorqueDez+1;
					
				}
	
			}//segundo for
		}// primeiro for
		
		System.out.println("A matriz tem " + contaMaiorqueDez + " números maiores que 10");
		
			}
			
		
		

	
}

