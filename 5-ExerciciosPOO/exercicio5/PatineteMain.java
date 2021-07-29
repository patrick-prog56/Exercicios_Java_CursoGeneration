package exercicio5;

public class PatineteMain {
	
	
//======== Aqui � onde o objeto � instanciado ========//
	
	
	public static void main(String[] args) { // 5 - quinto passo: Nessa classe ter� o main
		
		
		

		Patinete pati = new Patinete(); // 6 - sexto passo: Aqui ser� criado um novo objeto, sempre vem o nome da
										// primeira classe que neste caso � "Patinete" + o nome que eu quero dar ao
										// objeto.

		
		
		pati.setCor("cor"); // 7 - s�timo passo: Aqui � instanciado os atributos ao objeto, ou seja, estpu
		pati.setTamanho("tamanho");
		pati.setRoda("roda"); // atribuindo as caracter�sticas ao meu objeto... Estou dizendo a cor, o tamanho
    // e quantas rodas (que s�o os atributos ou caracter�sticas) do patinete (que �
		// o meu objeto). Isso � feiro atrav�s do set porque este m�todo era privado,
		// ent�o precisa do set para pegar as caracter�sticas colocar dentro do get e o
		// get colocar na private void.

	
		
		
		pati.scan(); // 8 - oitavo passo: Aqui tamb�m � atribuido os m�todos de ler os dados que o
						// usu�rio vai digitar e tamb�m o metodo feito para imprimir tudo isso, n�o vai
						// com set pois o metodo void dele � public(sem nada escrito antes do void �
						// public void por default) e n�o private.
		pati.print();

	}

}
