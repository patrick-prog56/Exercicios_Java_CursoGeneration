package exercicioHerança;

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
		cachorro.setSom(" Au Au au UUuUuUuuUUUU");
		
		//imprimir
		System.err.println("========= Características do cachorro =========");
		System.out.println("Nome do cachorro: " + cachorro.getNome());
		System.out.println("\nA idade do cachorro é : " + cachorro.getIdade());
		System.out.println("\nO que o cachorro faz? " + cachorro.getCorrer());
		System.out.println("\nOsom que o cachorro faz é: " + cachorro.getSom()+ "\n\n");
		
		
		
		
		
		
		
		//===========================================================================================
		//settando as características do cavalo : 
		cavalo.setNome("Pé de pano");
		cavalo.setIdade("10 anos");
		cavalo.setCorrer("O cavalo corre");
		cavalo.setSom("HHIIIN HIIIN HIIIIIIN");
		
		//imprimir
		System.err.println("========= Características do cavalo =========");
		System.out.println("Nome do cavalo: " + cavalo.getNome());
		System.out.println("\nA idade do cavalo é : " + cavalo.getIdade());
		System.out.println("\nO que o cavalo faz? " + cavalo.getCorrer());
		System.out.println("\nOsom que o cavalo faz é: " + cavalo.getSom()+ "\n\n");
		
		
		
		
		
		
		
		//============================================================================================
		//settando as características da preguiça: 
		
		preguica.setNome("Preguica");
		preguica.setIdade("85 Anos");
		preguica.setSubir("Sobe em árvores");
		preguica.setSom("ZZZZZzzzzzzZZZZzzzzzzZ");
		
		//imprimir
		System.err.println("========= Características da preguiça =========");
		System.out.println("Nome da preguiça: " + preguica.getNome());
		System.out.println("\nA idade da preguiça é : " + preguica.getIdade());
		System.out.println("\nO que a preguiça faz? " + preguica.getSubir());
		System.out.println("\nOsom da preguiça é: "+ preguica.getSom());
		
	}

}
