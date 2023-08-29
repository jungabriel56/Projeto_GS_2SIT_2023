
public class Cadastro {
	
	private String nome;
	private String email;
	private String cidade;
	private String estado;
	
	
	public Cadastro(String nome, String email, String cidade, String estado) {
		super();
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public Cadastro () {}
	
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
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
