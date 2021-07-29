package exercicio5;

import java.util.Scanner;

public class Patinete {

	private String cor, tamanho, roda; // 1- primeiro passo: definindo os atributos (caracter�sticas).
	
	
	
	
	

	public String getCor() { // 2- segundo passo : colocando os getter e setters (atrav�s do source -->
								// generate getter and setters)
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRoda() {
		return roda;
	}

	public void setRoda(String roda) {
		this.roda = roda;
	}
	
	
	
	

	void scan() { // 3- terceiro passo: criando um metodo que manipula os atributos
					// (caracter�sticas), nesse caso eu quero que o usu�rio digite as
					// caracacter�sticas dos atributos ou seja: roda por exemplo � um atributo, a
					// caracter�stica deste atributo (roda) � a quantidade de rodas ( 2 rodas por
					// exemplo). O m�todo serve para isso. (scan foi um nome opcional que eu quis
					// dar, poderia ser "ler" ou outra coisa que eu quisesse).

		Scanner read = new Scanner(System.in);

		System.out.println("Qual a cor do seu patinete? ");
		cor = read.nextLine();

		System.out.println("Qual o tamanho do seu patinete?");
		tamanho = read.nextLine();

		System.out.println("Quantas rodas tem seu patinete?");
		roda = read.nextLine();

	}

	
	
	
	void print() { // 4- quarto passo: Aqui foi criado outro m�todo, s� que dessa vez para imprimir
					// os atributos, imprimir o que foi colocado dentro destes atributos (print foi
					// um nome opcional que eu quis dar, poderia ser "imprimir" ou outra coisa que
					// eu quisesse).
		System.out.println("A cor do seu patinete �: " + cor + "\nO tamanho do seu patinete �: " + tamanho
				+ "\nSeu patinete tem " + roda + " rodas");

	}

}
