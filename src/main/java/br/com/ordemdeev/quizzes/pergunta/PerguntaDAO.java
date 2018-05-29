package br.com.ordemdeev.quizzes.pergunta;

import java.util.List;

public interface PerguntaDAO {
	
	public void salvar(Pergunta pergunta);
	public void excluir(Pergunta pergunta);
	public Pergunta carregar(Integer codigo);
	public List<Pergunta> listar();
	
}
