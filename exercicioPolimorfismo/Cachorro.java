package polimorfismoEHeranca;

public class Cachorro extends Animal

{

	
	private String correr;

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	void emitirSom() {
		System.out.println("O cachorro faz: AU AU AU");
	}
	
}

