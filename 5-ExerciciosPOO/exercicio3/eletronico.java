package exercicio3;

import java.util.Scanner;

public class eletronico {
	private String objeto, armazenamento, ano;

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	void ler() {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe o que � o seu dispositivo eletr�nico: ");
		objeto = input.nextLine();
		
		
		System.out.println("Quantos Gb de armazenamento ele tem? ");
		armazenamento = input.nextLine();
		
		System.out.println("Em que ano foi fabricado o seu dispositivo? ");
		ano = input.nextLine();
		}
	void imprimir() {
		
		System.out.println("O seu dispositivo � um :" + objeto +
		"\nA capacidade de Armazenamento dele �: " + armazenamento + "Gb"+
		"\nO ano de fabrica��o �: " + ano );
	}
		
		
	

}
