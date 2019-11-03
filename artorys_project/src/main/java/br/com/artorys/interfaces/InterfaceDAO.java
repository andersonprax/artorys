package br.com.artorys.interfaces;

public interface InterfaceDAO {
	public void Insert(Entidade entidade);

	public void Update(Entidade entidade);

	public void Delete(Entidade entidade);

	public Entidade Select(Entidade entidade);

}
