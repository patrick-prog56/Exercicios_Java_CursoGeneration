package exercicio6;

public class ContaBancariaMain {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setNome("nome");
		conta.setAgencia("agencia");
		conta.setConta("conta");
		conta.setPix("pix");
		conta.scan();
		conta.print();
		
			
		}

	}


