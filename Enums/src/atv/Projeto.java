package atv;

import java.util.ArrayList;
import java.util.Date;

public class Projeto {


	private String nome;
	private Date dt_inicio;
	private Date dt_termino;
	public ArrayList<Contratacao> contratacaos = new ArrayList<Contratacao>();
	
	public Projeto(String nome, Date date,Date dateT) {
		super();
		this.nome = nome;
		this.dt_inicio = date;
		this.dt_termino =  dateT;
	}
	
	public boolean adicionarContratacao(Contratacao contratacao) {
		if(!this.contratacaos.contains(contratacao)) {
			this.contratacaos.add(contratacao);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean removerContratacao(Contratacao contratacao) {
		if(this.contratacaos.contains(contratacao)) {
			this.contratacaos.remove(contratacao);
			return true;
		}else {
			return false;
		}
	}
	
	public void listarContratacaos() {
		if(!this.contratacaos.isEmpty()) {
			for(Contratacao contratacao : this.contratacaos) {
				System.out.println(contratacao.toString());
			}
		}else {
			System.out.println("Sem contratações para este projeto");
		}
	}
	
	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dt_inicio=" + dt_inicio + ", dt_termino=" + dt_termino + ", contratacaos="
				+ contratacaos + "]";
	}
	
}
