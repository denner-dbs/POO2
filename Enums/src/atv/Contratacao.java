package atv;

import java.util.Date;
import java.util.ArrayList; 


public class Contratacao {
	private Date datal;
	private Cargo cargo;
	private Status status;
	private Funcionario funcionario;
	
	public Contratacao(Date datal, Cargo cargo, Funcionario funcionario) {
		super();
		this.datal = datal;
		this.status = Status.PENDENTE;
		this.cargo = cargo;
		this.funcionario = funcionario;
	}
	
	@Override
	public String toString() {
		return "Contratacao [datal=" + datal + ", cargo=" + cargo + ", status=" + status + ", funcionario="
				+ funcionario.toString() + "]\n";
	}

	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
			this.status = Status.CONTRATADO;
	}
	
	public void demitir() {
		this.status = Status.DEMITIDO;
	}
		
}
