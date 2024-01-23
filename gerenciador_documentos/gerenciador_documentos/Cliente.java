package gerenciador_documentos;

public class Cliente {
	private String cod_cli;
	private String nome;
	private String fone;
	private String endereco;
	
	Cliente(String cod_cli, String nome, String fone, String endereco){
		this.cod_cli = cod_cli;
		this.nome = nome;
		this.fone = fone;
		this.endereco = endereco;
	}

	public String getCod_cli() {
		return cod_cli;
	}

	public void setCod_cli(String cod_cli) {
		this.cod_cli = cod_cli;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
