package br.com.ordemdeev.quizzes.util;

import br.com.ordemdeev.quizzes.alternativa.AlternativaDAO;
import br.com.ordemdeev.quizzes.alternativa.AlternativaDaoHibernate;
import br.com.ordemdeev.quizzes.grupo.GrupoDao;
import br.com.ordemdeev.quizzes.grupo.GrupoDaoHibernate;
import br.com.ordemdeev.quizzes.pergunta.PerguntaDAO;
import br.com.ordemdeev.quizzes.pergunta.PerguntaDaoHibernate;
import br.com.ordemdeev.quizzes.usuario.UsuarioDAO;
import br.com.ordemdeev.quizzes.usuario.UsuarioDAOHibernate;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
	
	public static GrupoDao criarGrupoDAO(){
		GrupoDaoHibernate grupoDao = new GrupoDaoHibernate();
		grupoDao.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return grupoDao;
	}
	
	public static PerguntaDAO criarPerguntaDAO()
	{
		PerguntaDaoHibernate perguntaDao = new PerguntaDaoHibernate();
		perguntaDao.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return perguntaDao;
	}
	
	public static AlternativaDAO criarAlternativaDAO()
	{
		AlternativaDaoHibernate alternativaDAO = new AlternativaDaoHibernate();
		alternativaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return alternativaDAO;
	}

}