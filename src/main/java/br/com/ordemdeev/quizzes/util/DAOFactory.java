package br.com.ordemdeev.quizzes.util;

import br.com.ordemdeev.quizzes.alternativa.AlternativaDAO;
import br.com.ordemdeev.quizzes.alternativa.AlternativaHibernateRepository;
import br.com.ordemdeev.quizzes.grupo.GrupoDao;
import br.com.ordemdeev.quizzes.grupo.GrupoHibernateRepository;
import br.com.ordemdeev.quizzes.pergunta.PerguntaDAO;
import br.com.ordemdeev.quizzes.pergunta.PerguntaHibernateRepository;
import br.com.ordemdeev.quizzes.usuario.UsuarioDAO;
import br.com.ordemdeev.quizzes.usuario.UsuarioHibernateRepository;

public class DAOFactory {

	public static UsuarioDAO criarUsuarioDAO() {
		UsuarioHibernateRepository usuarioDAO = new UsuarioHibernateRepository();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}
	
	public static GrupoDao criarGrupoDAO(){
		GrupoHibernateRepository grupoDao = new GrupoHibernateRepository();
		grupoDao.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return grupoDao;
	}
	
	public static PerguntaDAO criarPerguntaDAO()
	{
		PerguntaHibernateRepository perguntaDao = new PerguntaHibernateRepository();
		perguntaDao.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return perguntaDao;
	}
	
	public static AlternativaDAO criarAlternativaDAO()
	{
		AlternativaHibernateRepository alternativaDAO = new AlternativaHibernateRepository();
		alternativaDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return alternativaDAO;
	}

}