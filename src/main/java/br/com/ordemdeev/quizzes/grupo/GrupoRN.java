package br.com.ordemdeev.quizzes.grupo;

import java.util.List;

import br.com.ordemdeev.quizzes.util.DAOFactory;

public class GrupoRN {
	
	private GrupoDao grupoDao;
	
	public GrupoRN() {
		this.grupoDao = DAOFactory.criarGrupoDAO();
	}
	
	public List<Grupo> listar()
	{
		return this.grupoDao.listar();
	}
	
	public Grupo carregar(Integer codigo)
	{
		return this.grupoDao.carregar(codigo);
	}
	
	public void salvar(Grupo grupo)
	{
		this.grupoDao.salvar(grupo);
	}
	
	public void excluir(Grupo grupo)
	{
		this.grupoDao.excluir(grupo);
	}

}
