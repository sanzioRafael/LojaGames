package dao;

import vo.JogoVO;

public class JogoDAO extends DAO<JogoVO> {

	private static JogoDAO dao;

	private JogoDAO(Class classe) {
		super(classe);
	}

	public static JogoDAO getInstance() {
		if (dao == null)
			dao = new JogoDAO(JogoVO.class);
		return dao;
	}
}
