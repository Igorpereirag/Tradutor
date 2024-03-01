package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet; 

import model.Tradutor;

@WebServlet("/traslated") 
public class TraducaoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String palavra = request.getParameter("palavra");
        Tradutor tradutor = new Tradutor();
        String traducao = tradutor.traduzir(palavra);
        request.setAttribute("traducao", traducao);
        request.getRequestDispatcher("/view/resultado.jsp").forward(request, response);
    }
}
