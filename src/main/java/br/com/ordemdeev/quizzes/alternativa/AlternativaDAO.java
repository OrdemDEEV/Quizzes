package br.com.ordemdeev.quizzes.alternativa;

import java.util.List;

import br.com.ordemdeev.quizzes.pergunta.Pergunta;
import br.com.ordemdeev.quizzes.util.RepositoryDAO;

public interface AlternativaDAO extends RepositoryDAO<Alternativa> {
	
	public List<Alternativa> listar(Pergunta pergunta);
}
