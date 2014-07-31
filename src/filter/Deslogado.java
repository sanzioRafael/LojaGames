package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controle.crud_usuario.UsuarioControle;

@WebFilter("/modulo1/*")
public class Deslogado implements Filter {

	public Deslogado() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		UsuarioControle controle = (UsuarioControle) session
				.getAttribute("usuarioControle");

		try {
			if (controle.isLogou() && controle.getVo().getEstadoLogado())
				resp.sendRedirect("../modulo2/perfil_m2.jsf");
			else
				chain.doFilter(request, response);
		} catch (NullPointerException e) {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}