package br.com.ordemdeev.quizzes.util;

import br.com.ordemdeev.quizzes.usuario.UsuarioDAO;
import br.com.ordemdeev.quizzes.usuario.UsuarioDAOHibernate;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}

}
