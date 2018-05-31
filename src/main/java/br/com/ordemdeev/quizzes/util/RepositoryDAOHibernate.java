package br.com.ordemdeev.quizzes.util;

import java.util.List;
import org.hibernate.Session;

public class RepositoryDAOHibernate<T> implements RepositoryDAO<T> {

	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}
	
	public Session getSession() {
		return session;
	}

	@Override
	public void salvar(T objeto) {
		this.session.saveOrUpdate(objeto);
	}

	@Override
	public void excluir(T objeto) {
		this.session.delete(objeto);
	}

	@Override
	public T carregar(T objeto, Integer codigo) {
		return (T) this.session.get(objeto.getClass(), codigo);
	}

	@Override
	public List<T> listar(T objeto) {
		return this.session.createCriteria(objeto.getClass()).list();
	}

}
