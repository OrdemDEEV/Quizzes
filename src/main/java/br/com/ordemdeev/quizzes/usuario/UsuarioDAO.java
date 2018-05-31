package br.com.ordemdeev.quizzes.usuario;

import br.com.ordemdeev.quizzes.util.RepositoryDAO;

public interface UsuarioDAO extends RepositoryDAO<Usuario>{

	public Usuario buscarPorLogin(String login);

}
