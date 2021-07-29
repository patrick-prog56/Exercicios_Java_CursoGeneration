import java.util.ArrayList;
import java.util.Scanner;

public class Classepai {
	
	
public static void main(String[] args) {
	
	Scanner ler= new Scanner ( System.in);
	
	ArrayList<String>produto=new ArrayList<>();
	
int opcao;
	
	
	
	
	do {
		System.out.println("Produtos em estoque atualmente: " + produto + "\n");
		
		System.out.println("Digite a opção desejada\n [1] Adicionar um produto a lista\n [2] Remover um produto da lista\n [3] Apresentar todos os produtos da lista \n DIGITE QUALQUER OUTRO BOTÃO PARA SAIR");
	    opcao = ler.nextInt();
	 
	    
	    switch (opcao) {
	    case 1:
	    	ler.nextLine();
	    	System.out.println("Escreva o produto que você deseja adicionar:");
	    	produto.add(ler.nextLine());
	    	break;
	    	
	    case 2:
	    	ler.nextLine();
	    	System.out.println("Escreva o produto que você deseja remover:");
	    	produto.remove(ler.nextLine());
	    	break;
	    case 3:
	    	ler.nextLine();
	    	//System.out.println("Produtos em estoque atualmente: " + produto);
	   break;
	    }
	   
	}
	while(opcao == 1 || opcao == 2 || opcao == 3 );
		
	}
}


