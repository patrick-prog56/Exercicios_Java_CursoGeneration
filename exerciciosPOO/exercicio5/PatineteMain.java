package exercicio5;

public class PatineteMain {
	
	
//======== Aqui é onde o objeto é instanciado ========//
	
	
	public static void main(String[] args) { // 5 - quinto passo: Nessa classe terá o main
		
		
		

		Patinete pati = new Patinete(); // 6 - sexto passo: Aqui será criado um novo objeto, sempre vem o nome da
										// primeira classe que neste caso é "Patinete" + o nome que eu quero dar ao
										// objeto.

		
		
		pati.setCor("cor"); // 7 - sétimo passo: Aqui é instanciado os atributos ao objeto, ou seja, estpu
		pati.setTamanho("tamanho");
		pati.setRoda("roda"); // atribuindo as características ao meu objeto... Estou dizendo a cor, o tamanho
    // e quantas rodas (que são os atributos ou características) do patinete (que é
		// o meu objeto). Isso é feiro através do set porque este método era privado,
		// então precisa do set para pegar as características colocar dentro do get e o
		// get colocar na private void.

	
		
		
		pati.scan(); // 8 - oitavo passo: Aqui também é atribuido os métodos de ler os dados que o
						// usuário vai digitar e também o metodo feito para imprimir tudo isso, não vai
						// com set pois o metodo void dele é public(sem nada escrito antes do void é
						// public void por default) e não private.
		pati.print();

	}

}
