package exercicio4;

import java.util.Scanner;

public class Funcionario {
	private String nome, registro, tempo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	void scan() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Qual seu nome?");
		nome = input.nextLine();
		
		System.out.println("Qual seu registro?");
		registro = input.nextLine();
		
		System.out.println("Quanto tempo você tem de empresa?");
		tempo = input.nextLine();
			
	}
	
	void imprimir () {
		
		System.out.println("Seu nome é: " + nome + "\nSeu registro é: " + registro +
				"\nSeu tempo de empresa é: " + tempo);
	}

}
