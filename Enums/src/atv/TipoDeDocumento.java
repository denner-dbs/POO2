package atv;

public enum TipoDocumento {
	RG("Registro Geral"),
	CPF("Cadastro de Pessoa Física"),
	CNPJ("Cadastro Nacional de Pessoa Jurídica");
	
	private String descricao;

	 TipoDocumento (String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
}


