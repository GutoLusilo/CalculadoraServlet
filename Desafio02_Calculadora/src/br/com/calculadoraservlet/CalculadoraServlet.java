package br.com.calculadoraservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {

	/**
	 * Recebe a requisição de um html com 2 valores e 1 operador 
	 * e retorna um novo html com a resposta do calculo
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		String operator = request.getParameter("operator");
		
		double answer = calculate(num1, num2, operator);
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("  <title>Calculadora - Resposta</title>");
		out.println("  <style>");
		out.println("    .container {width: 100%;min-height: 100vh;display: flex;flex-direction: column;justify-content: center;align-items: center;}");
		out.println("    .answer {background-color: green;color: white;width: 30%;height: 30%;display: flex;justify-content: center;align-items: center;}");
		out.println("  </style>");
		out.println("</head>");
		out.println("<body>");
		out.println("  <div class=\"container\">");
		out.println("    <div class=\"answer\">");
		out.println("      <h1>");
		out.println(answer);
		out.println("      </h1>");
		out.println("    </div>");
		out.println("  </div>");
		out.println("</body>");
		out.println("</html>");
	}
	
	/**
	 * Metodo que faz a operacao de acordo com o operador escolhido
	 * e retorna a resposta
	 */
	private double calculate(double n1, double n2, String op) {
		switch (op) {
		case "+": return n1+n2; 
		case "-": return n1-n2; 
		case "*": return n1*n2; 
		case "/": return n1/n2;
		}
		return n1; // apenas para impedir o erro
	}

}
