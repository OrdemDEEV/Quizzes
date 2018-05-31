package br.com.ordemdeev.quizzes.usuario;

import org.hibernate.Query;

import br.com.ordemdeev.quizzes.util.RepositoryDAOHibernate;

public class UsuarioHibernateRepository extends RepositoryDAOHibernate<Usuario> implements UsuarioDAO {

	public Usuario buscarPorLogin(String login) {
		String hql = "select u from Usuario u where u.login = :login";
		Query consulta = super.getSession().createQuery(hql);
		consulta.setString("login", login);
		return (Usuario) consulta.uniqueResult();
	}


}
