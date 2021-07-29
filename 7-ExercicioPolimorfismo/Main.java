package polimorfismoEHeranca;


public class Main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		
	
		
		
		
		
		//===========================================================================================
		//settando as características do cachorro: 
		cachorro.setNome("Bob");
		cachorro.setIdade("5 Anos");
		cachorro.setCorrer("O cachorro corre");
	    
		
		//imprimir
		System.err.println("========= Características do cachorro =========");
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("\nA idade do cachorro é : " + cachorro.getIdade());
		System.out.println("\nO que o cachorro faz? " + cachorro.getCorrer()+"\n");
		cachorro.emitirSom();//emitindo som da interface, o sysout já está mandando emitir som
		
			
	
		
		
		
		
		
		
		
		//===========================================================================================
		//settando as características do cavalo : 
		cavalo.setNome("Pé de pano");
		cavalo.setIdade("10 anos");
		cavalo.setCorrer("O cavalo corre");
		
		
		
		//imprimir
		System.err.println("========= Características do cavalo =========");
		System.out.println("Nome do cavalo: " + cavalo.getNome());
		System.out.println("\nA idade do cavalo é : " + cavalo.getIdade());
		System.out.println("\nO que o cavalo faz? " + cavalo.getCorrer()+"\n");
		cavalo.emitirSom();
	
		
		
		
		
		
		
		
		//============================================================================================
		//settando as características da preguiça: 
		
		preguica.setNome("Preguica");
		preguica.setIdade("85 Anos");
		preguica.setSubir("Sobe em árvores");
	
	;
		
		//imprimir
		System.err.println("========= Características da preguiça =========");
		System.out.println("Nome da preguiça: " + preguica.getNome());
		System.out.println("\nA idade da preguiça é : " + preguica.getIdade());
		System.out.println("\nO que a preguiça faz? " + preguica.getSubir()+"\n");
		preguica.emitirSom();
	
		
	}

}

