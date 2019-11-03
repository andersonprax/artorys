package br.com.artorys.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.artorys.interfaces.Entidade;

@Entity
public class Administrador extends Usuario implements Entidade {

	@Column(name = "NM_MATRICULA")
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Object pegarChavePrimaria() {
		return super.getId();
	}

}
