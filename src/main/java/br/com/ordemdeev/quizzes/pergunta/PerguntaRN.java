package br.com.ordemdeev.quizzes.pergunta;

import java.util.List;

import br.com.ordemdeev.quizzes.util.DAOFactory;

public class PerguntaRN {
	
	PerguntaDAO perguntaDao;
	
	public PerguntaRN() {
		this.perguntaDao = DAOFactory.criarPerguntaDAO();
	}
	
	public List<Pergunta> listar()
	{
		return this.perguntaDao.listar();
	}
	
	public Pergunta carregar(Integer codigo)
	{
		return this.perguntaDao.carregar(codigo);
	}
	
	public void salvar(Pergunta pergunta)
	{
		this.perguntaDao.salvar(pergunta);
	}
	
	public void excluir(Pergunta pergunta)
	{
		this.perguntaDao.excluir(pergunta);
	}

}
