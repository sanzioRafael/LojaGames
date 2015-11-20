package vo.excecao;

public class UsuarioVOException extends Exception {

	private static final long serialVersionUID = 4173413463663831056L;
	
	public static final String NOMEOBRIGATORIO = "Nome � de preenchimento obrigat�rio";
	public static final String LOGINOBRIGATORIO = "Login � de preenchimento obrigat�rio";
	public static final String EMAILOBRIGATORIO = "E-mail � de preenchimento obrigat�rio";
	public static final String EMAILINVALIDO = "E-mail inv�lido";
	public static final String SENHAOBRIGATORIO = "Senha � de preenchimento obrigat�rio";
	public static final String LOGINFAIL = "Login e senha s�o inv�lidos";
	public static final String LOGINEXISTENTE = "Login j� cadastrado";
	public static final String EMAILEXISTENTE = "E-mail j� cadastrado";
	
	public UsuarioVOException(String msg) {
		super(msg);
	}

}
