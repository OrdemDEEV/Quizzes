package br.com.ordemdeev.quizzes.grupo;

import java.util.List;

public interface GrupoDao {
	
	public void salvar(Grupo grupo);
	public void excluir(Grupo grupo);
	public Grupo carregar(Integer codigo);
	public List<Grupo> listar();
}
