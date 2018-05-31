package br.com.ordemdeev.quizzes.alternativa;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import br.com.ordemdeev.quizzes.pergunta.Pergunta;
import br.com.ordemdeev.quizzes.util.RepositoryDAOHibernate;

public class AlternativaHibernateRepository extends RepositoryDAOHibernate<Alternativa> implements AlternativaDAO{

	
	public List<Alternativa> listar(Pergunta pergunta) {
		Criterion filtroPergunta = Restrictions.eq("pergunta", pergunta);
		Criteria criteria = super.getSession().createCriteria(Alternativa.class);
		criteria.add(filtroPergunta);
		return criteria.list();
	}

	@Override
	public List<Alternativa> listar(Alternativa objeto) {
		// Este metodo nunca será usado
		return null;
	}
	
	

}
