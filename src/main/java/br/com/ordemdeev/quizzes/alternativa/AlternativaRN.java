package br.com.ordemdeev.quizzes.alternativa;

import java.util.List;

import br.com.ordemdeev.quizzes.pergunta.Pergunta;
import br.com.ordemdeev.quizzes.util.DAOFactory;

public class AlternativaRN {
	
	private AlternativaDAO alternativaDAO;
	
	public AlternativaRN()
	{
		this.alternativaDAO = DAOFactory.criarAlternativaDAO();
	}
	
	public List<Alternativa> listar(Pergunta pergunta)
	{
		return this.alternativaDAO.listar(pergunta);
	}
	
	public Alternativa carregar(Integer codigo)
	{
		return this.alternativaDAO.carregar(new Alternativa(), codigo);
	}
	
	public void salvar(Alternativa alternativa)
	{
		this.alternativaDAO.salvar(alternativa);
	}
	
	public void excluir(Alternativa alternativa)
	{
		this.alternativaDAO.excluir(alternativa);
	}

}
