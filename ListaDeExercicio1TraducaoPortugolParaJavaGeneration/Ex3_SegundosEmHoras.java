package patrickLista1;

import java.util.Scanner;

public class Ex3_SegundosEmHoras {
	
	public static void main (String[]args) {
		
		Scanner ler = new Scanner(System.in);
		
	int horas, minutos, segundosTotais, segundos;
	 
	System.out.println("Digite a dura��o do evento em segundos:");
	segundosTotais = ler.nextInt();
    
    horas = (segundosTotais / 3600);
    minutos = ((segundosTotais % 3600) / 60);
    segundos = ((segundosTotais % 3600) % 60);
    
    System.out.println("A dura��o do evento foi de " + horas + " horas " + minutos + " minutos e " + segundos + " segundos");
  
	}
}


