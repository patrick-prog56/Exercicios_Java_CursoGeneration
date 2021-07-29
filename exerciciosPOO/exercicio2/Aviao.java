package exercicio2;

import java.util.Scanner;

public class Aviao {
	private String modelo,ano,cor;
	
	
	

	public String getModelo() { //metodos getters and setters
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	void escanear() {
		Scanner ler = new Scanner(System.in);
		
		 
		 System.out.println("Digite o modelo do avião");
		 modelo = ler.nextLine();
		
		 System.out.println("Digite o Ano de fabricação do avião");
		 ano = ler.nextLine();
		 
		 System.out.println("Digite a cor do avião");
		 cor = ler.nextLine();
		 
		 
	}
	
	void imprimir(){
		System.out.println("O modelo do avião é: " + modelo+ "\n" + "O ano de fabricação do avião é: " + ano + "\n"+
	"A cor do avião é: " + cor);
		
	}
	
	
	
}