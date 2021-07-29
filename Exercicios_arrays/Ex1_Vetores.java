package vetores;

public class Ex1_Vetores {
	public static void main(String[] args) {
		int soma=0;
			
			int[] numeros = new int[6];
			int numero;
			numeros[0] = 1;
			numeros[1] = 0;
			numeros[2] = 5;
			numeros[3] = -2;
			numeros[4] = -5;
			numeros[5] = 7;
			
			soma = numeros[0] + numeros[1] + numeros[5];
			
			
			numeros[4] = 100;
			
			
			System.out.println(" A soma das posições 0, 1 e 5 é: " + soma + "\n");
			System.out.println(" Os valores do vetor em ordem é: " + "\n" + numeros[0]+ "\n" 
			+ numeros[1]+ "\n" + numeros[2]+ "\n" + numeros[3]+ "\n" + numeros[4]+ "\n" + numeros[5]);
			
			
	}
	

}
