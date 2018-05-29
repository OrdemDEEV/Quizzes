package br.com.ordemdeev.quizzes.grupo;

import java.util.List;

import org.hibernate.Session;

public class GrupoDaoHibernate implements GrupoDao {
	
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Grupo grupo) {
		this.session.saveOrUpdate(grupo);
	}

	@Override
	public void excluir(Grupo grupo) {
		this.session.delete(grupo);
	}

	@Override
	public Grupo carregar(Integer codigo) {
		return (Grupo) this.session.get(Grupo.class, codigo);
	}

	@Override
	public List<Grupo> listar() {
		return this.session.createCriteria(Grupo.class).list();
	}

}
