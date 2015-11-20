package controle.inicial;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import negocio.Jogo;
import vo.JogoVO;

@ManagedBean
@ApplicationScoped
public class InicialBean {

	List<JogoVO> jogos;
	
	public List<JogoVO> getListaJogos() {
		Jogo jogo = new Jogo();
		jogos = jogo.getAll();
		jogos = jogos == null ? new ArrayList<JogoVO>() : jogos;
		
		return jogos;
	}
}
