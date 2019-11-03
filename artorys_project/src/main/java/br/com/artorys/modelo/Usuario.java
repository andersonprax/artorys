package br.com.artorys.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Usuario {
	
	@Id
	@Column(name = "CD_USUARIO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "EM_USUARIO", unique = true)	
	private String email;
	
	@Column(name = "NM_SENHA_USUARIO")
	private String senha;
	
	@Column(name = "DS_USUARIO")
	private String nome;
	
	@Column(name = "DS_SOBRENOME")
	private String sobrenome;
	
	@Column(name = "Ds_Nascimento")
	private String dt_nascimento;
	
	@Column(name = "Ds_SEXO")
	private String sexo;

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
