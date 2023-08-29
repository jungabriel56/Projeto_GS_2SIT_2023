
public class PessoaJuridica extends Cadastro{
	
	private String cnpj;

	public PessoaJuridica(String nome, String email, String cidade, String estado, String cnpj) {
		super(nome, email, cidade, estado);
		this.cnpj = cnpj;
	}

	
}
