package br.com.ordemdeev.quizzes.alternativa;

import java.util.List;

import br.com.ordemdeev.quizzes.pergunta.Pergunta;

public interface AlternativaDAO {
	
	public void salvar(Alternativa alternativa);
	public void excluir(Alternativa alternativa);
	public Alternativa carregar(Integer codigo);
	public List<Alternativa> listar(Pergunta pergunta);

}
