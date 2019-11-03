package br.com.artorys.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.artorys.interfaces.Entidade;

@Entity
public class Cliente extends Usuario implements Entidade {
	
	@Column(name = "DS_TELEFONE")
	private String telefone;
	
	@Column(name = "NM_CPF")
	private String cpf;
	
	@Column(name = "DS_SEXO")
	private String sexo;
	
	@OneToOne(mappedBy = "cliente")
	private Endereco endereco;
	
	@OneToMany(mappedBy = "cliente")
	private List<Cartao> cartao;



	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Cartao> getCartao() {
		return cartao;
	}

	public void setCartao(List<Cartao> cartao) {
		this.cartao = cartao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Object pegarChavePrimaria() {
		return super.getId();
	}

}
