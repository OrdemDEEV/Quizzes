package br.com.ordemdeev.quizzes.util;

import java.util.List;

public interface RepositoryDAO<T> {
	
	public void salvar(T objeto);

	public void excluir(T objeto);

	public T carregar(T objeto, Integer codigo);

	public List<T> listar(T objeto);
}
