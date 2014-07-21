package util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import vo.JogoVO;
import vo.UsuarioVO;

public class SessionFactoryUtil {

	private static org.hibernate.SessionFactory sessionFactory;

	private SessionFactoryUtil() {
	}

	static {
		Configuration configuration = new Configuration();
	    configuration.configure();
	    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
	            configuration.getProperties()).build();
	    sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}

	public static SessionFactory getInstance() {
		return sessionFactory;
	}

	public Session openSession() {
		return sessionFactory.openSession();
	}

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public static void close() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
		sessionFactory = null;
	}

	/*public static void main(String[] args) {
		Session s = SessionFactoryUtil.getInstance().openSession();
		List<UsuarioVO> usuarios = new ArrayList<UsuarioVO>();
		UsuarioVO vo = new UsuarioVO();
		vo.setNome("Produto X");
		
		UsuarioVO vo2 = new UsuarioVO();
		vo2.setNome("Produto Y");
		usuarios.add(vo2);
		JogoVO jogo = new JogoVO();
		List<JogoVO> lista = new ArrayList<JogoVO>();
		vo.setJogos(lista);
		vo.setChildren(usuarios);
		
		Transaction t = s.beginTransaction();
		usuarios = (List<UsuarioVO>) vo.getChildren();
		for (UsuarioVO jogoVO : usuarios) {
			System.out.println(jogoVO.getNome());
		}
		s.cre
		s.save(vo);
		t.commit();
	}*/
}
