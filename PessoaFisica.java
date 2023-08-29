
public class PessoaFisica extends Cadastro{
	
	private String cpf;

	
	public PessoaFisica(String nome, String email, String cidade, String estado,String cpf) {
		super(nome, email, cidade, estado);
		this.cpf= cpf;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	

}
