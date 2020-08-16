package br.com.fiap.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet( urlPatterns = {"/validacao","/index.php"})
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//teste de request
		System.out.println("Ol� mundo!");
		
		
		String nomeUsuario = "";
		String senhaUsuario = "";
		
		//receber os atributos do form que est�o no request e armazenar nas vari�veis
		nomeUsuario = request.getParameter("txt-user"); //o par�metro � o name do campo
		senhaUsuario = request.getParameter("txt-pass");
		
		//Imprimindo
		System.out.println("Nome do usu�rio: " + nomeUsuario);
		System.out.println("Senha do usu�rio: " + senhaUsuario);
		
		//Criando um redirecionamento utilizando o response
		//sendRedirect(caminho ou URI de destino)
		
		response.sendRedirect("login.html");
	}

}
