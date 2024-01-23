package gerenciador_documentos;

public class Documento {
	private String num_doc;
	private String cod_cli;
	private String data_venc;
	private String data_pag;
	private double valor;
	private double juros;
	
	public Documento(String num_doc, String cod_cli, String data_venc, String data_pag, double valor, double juros) {
		this.num_doc = num_doc;
		this.cod_cli = cod_cli;
		this.data_venc = data_venc;
		this.data_pag = data_pag;
		this.valor = valor;
		this.juros = juros;
	}

	public String getNum_doc() {
		return num_doc;
	}

	public void setNum_doc(String num_doc) {
		this.num_doc = num_doc;
	}

	public String getCod_cli() {
		return cod_cli;
	}

	public void setCod_cli(String cod_cli) {
		this.cod_cli = cod_cli;
	}

	public String getData_venc() {
		return data_venc;
	}

	public void setData_venc(String data_venc) {
		this.data_venc = data_venc;
	}

	public String getData_pag() {
		return data_pag;
	}

	public void setData_pag(String data_pag) {
		this.data_pag = data_pag;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	
	
}
