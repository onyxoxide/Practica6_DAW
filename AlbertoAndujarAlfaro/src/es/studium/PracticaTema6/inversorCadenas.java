package es.studium.PracticaTema6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class inversorCadenas extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String cadena = req.getParameter("cadena");
		Integer i = 0;
		Integer tamanio = cadena.length()-1;
		String nuevaCadena = "";
        for(i = tamanio; i >= 0; i--)
        {
            nuevaCadena += cadena.charAt(i);
        }
        response(resp, nuevaCadena);
	}

	private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html lang=\"es\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n" + 
				"\r\n" +
				"    <link rel=\"stylesheet\"\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\"\r\n"
				+ "	integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\"\r\n"
				+ "	crossorigin=\"anonymous\">\r\n" + 
				"    <title>Practica 6</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" +
				"	<h2>Poner cadenas al rev�s</h2>\r\n"+ 
				"	<div class=\"container mt-4\">\r\n" + 
				"      <div class=\"row\">\r\n" + 
				"        <div class=\"col-8 text\">");
		out.println("<p> La cadena resultante es: " + msg + "</p></div></div></div>");
		out.println("</body>");
		out.println("</html>");
	}
}
