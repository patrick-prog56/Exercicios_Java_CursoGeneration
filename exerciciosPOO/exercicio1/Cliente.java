package exercício1;

public class Cliente {
	private String CPF;
	private String nome;
	private String email;
	
	
	
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	void imprimir() {
		System.out.println(CPF+"\n"+nome+"\n"+email);
	}
}
