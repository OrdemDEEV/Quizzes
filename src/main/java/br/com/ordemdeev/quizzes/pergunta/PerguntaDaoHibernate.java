package br.com.ordemdeev.quizzes.pergunta;

import java.util.List;

import org.hibernate.Session;

public class PerguntaDaoHibernate implements PerguntaDAO {
	
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Pergunta pergunta) {
		this.session.saveOrUpdate(pergunta);
	}

	@Override
	public void excluir(Pergunta pergunta) {
		this.session.delete(pergunta);
		
	}

	@Override
	public Pergunta carregar(Integer codigo) {
		return (Pergunta) this.session.get(Pergunta.class, codigo);
	}

	@Override
	public List<Pergunta> listar() {
		return this.session.createCriteria(Pergunta.class).list();
	}
	

}
