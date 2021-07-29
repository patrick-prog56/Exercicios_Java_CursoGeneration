package polimorfismoEHeranca;

public class Preguica extends Animal {
	private String subir;

	public String getSubir() {
		return subir;
	}

  public void setSubir(String subir) {
		this.subir = subir;
	}
	
	public void emitirSom() {
		System.out.println("A preguiça faz: zzZZZzzZZZzzzZZz");
	
	

}
}