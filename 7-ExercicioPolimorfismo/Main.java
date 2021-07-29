package polimorfismoEHeranca;


public class Main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		
	
		
		
		
		
		//===========================================================================================
		//settando as caracter�sticas do cachorro: 
		cachorro.setNome("Bob");
		cachorro.setIdade("5 Anos");
		cachorro.setCorrer("O cachorro corre");
	    
		
		//imprimir
		System.err.println("========= Caracter�sticas do cachorro =========");
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("\nA idade do cachorro � : " + cachorro.getIdade());
		System.out.println("\nO que o cachorro faz? " + cachorro.getCorrer()+"\n");
		cachorro.emitirSom();//emitindo som da interface, o sysout j� est� mandando emitir som
		
			
	
		
		
		
		
		
		
		
		//===========================================================================================
		//settando as caracter�sticas do cavalo : 
		cavalo.setNome("P� de pano");
		cavalo.setIdade("10 anos");
		cavalo.setCorrer("O cavalo corre");
		
		
		
		//imprimir
		System.err.println("========= Caracter�sticas do cavalo =========");
		System.out.println("Nome do cavalo: " + cavalo.getNome());
		System.out.println("\nA idade do cavalo � : " + cavalo.getIdade());
		System.out.println("\nO que o cavalo faz? " + cavalo.getCorrer()+"\n");
		cavalo.emitirSom();
	
		
		
		
		
		
		
		
		//============================================================================================
		//settando as caracter�sticas da pregui�a: 
		
		preguica.setNome("Preguica");
		preguica.setIdade("85 Anos");
		preguica.setSubir("Sobe em �rvores");
	
	;
		
		//imprimir
		System.err.println("========= Caracter�sticas da pregui�a =========");
		System.out.println("Nome da pregui�a: " + preguica.getNome());
		System.out.println("\nA idade da pregui�a � : " + preguica.getIdade());
		System.out.println("\nO que a pregui�a faz? " + preguica.getSubir()+"\n");
		preguica.emitirSom();
	
		
	}

}

