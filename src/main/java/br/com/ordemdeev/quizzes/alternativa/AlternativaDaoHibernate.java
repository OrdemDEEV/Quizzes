package br.com.ordemdeev.quizzes.alternativa;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import br.com.ordemdeev.quizzes.pergunta.Pergunta;

public class AlternativaDaoHibernate implements AlternativaDAO{

	
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}
	
	@Override
	public void salvar(Alternativa alternativa) {
		this.session.saveOrUpdate(alternativa);
		
	}

	@Override
	public void excluir(Alternativa alternativa) {
		this.session.delete(alternativa);
		
	}

	@Override
	public Alternativa carregar(Integer codigo) {
		return (Alternativa) this.session.get(Alternativa.class, codigo);
	}

	@Override
	public List<Alternativa> listar(Pergunta pergunta) {
		
		Criterion filtroPergunta = Restrictions.eq("pergunta", pergunta);
		Criteria criteria = this.session.createCriteria(Alternativa.class);
		criteria.add(filtroPergunta);
		return criteria.list();
	}

}
