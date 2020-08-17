package Servelts;

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import Dao.DaoPersonne;
import model.Personne;

	public class Ser extends HttpServlet {


		@Override
		public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			PrintWriter out=resp.getWriter();
			Personne p =new Personne(req.getParameter("Nom"),req.getParameter("Prenom"),req.getParameter("Login"),req.getParameter("Password"));
			DaoPersonne dao = new DaoPersonne();
			try {
				dao.Ajoute(p );
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.print(p);
		}
	}

