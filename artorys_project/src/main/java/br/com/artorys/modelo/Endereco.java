package br.com.artorys.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.artorys.interfaces.Entidade;

@Entity
public class Endereco implements Entidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CD_ENDERECO")
	private int id;
	@Column(name = "NM_CEP")
	private String cep;
	@Column(name = "DS_RUA")
	private String rua;
	@Column(name = "NM_CASA")
	private String numero;
	@Column(name = "DS_COMPLEMENTO")
	private String complemento;
	@Column(name = "DS_BAIRRO")
	private String bairro;
	@Column(name = "DS_CIDADE")
	private String cidade;
	@Column(name = "DS_ESTADO")
	private String estado;
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@OneToOne
	private Cliente cliente;

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Object pegarChavePrimaria() {
		return this.getId();
	}

}
