package atv;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		Date date = new Date();
		
		Projeto p1 = new Projeto("Radix", date, date);
		Funcionario funcionario1 = new Funcionario("Joao","0123456789",TipoDocumento.CNPJ);
		Contratacao contratacao1 = new Contratacao(date,Cargo.ANALISTA,funcionario1);
		Funcionario funcionario2 = new Funcionario("Claudio","42342342",TipoDocumento.CPF);
		Contratacao contratacao2 = new Contratacao(date,Cargo.ADMINISTRATIVO,funcionario2);
		contratacao1.contratar();
		contratacao2.contratar();
		p1.adicionarContratacao(contratacao1);
		p1.adicionarContratacao(contratacao2);
		p1.listarContratacaos();
		contratacao1.demitir();
		p1.listarContratacaos();
		p1.removerContratacao(contratacao1);
		p1.removerContratacao(contratacao2);
		p1.listarContratacaos();
	}

	

}
