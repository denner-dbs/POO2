package atv;

public class Funcionario {
	private String nome;
	private String numeroDocumento;
	private TipoDeDocumento documento;
	
	public Funcionario(String nome, String numeroDocumento, TipoDocumento documento) {
		super();
		this.nome = nome;
		this.numeroDocumento = numeroDocumento;
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", numeroDocumento=" + numeroDocumento + ", documento=" + documento + "]";
	}
	
	
}
