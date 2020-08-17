package Dao;

import java.util.ArrayList;

import com.mysql.jdbc.ResultSet;

import model.Personne;

public class DaoPersonne {

	private Connexion c=new Connexion();
	public int Suprimer(int id) throws Exception {
		c.connect();
		int res = c.Maj("delet from Personne where id="+id);
		c.disconnect();
		return res;
	}
	
	public int Modif(Personne  P) throws Exception {
		c.connect();
		int res = c.Maj("Update Personne set Nom='"+P.getNom()+"', Prenom='"+P.getPrenom()+"',Login ='"+P.getLogin()+"',Password ='"+P.getPassword()+"' WHERE id ='+P.getId()' ");
		c.disconnect();
		return res;
	}
	
	
	public int Ajoute(Personne  P) throws Exception {
		c.connect();
		int res = c.Maj("insert into  Personne (Nom,Prenom,Login,Password) VALUES ('"+P.getNom()+"','"+P.getPrenom()+"','"+P.getLogin()+"','"+P.getPassword()+"') ");
		c.disconnect();
		return res;
	}

public ArrayList<Personne> listePersonne() throws Exception{
	
	Personne p=null;
	ArrayList<Personne> Personnes=new ArrayList <Personne>();
	c.connect();
	ResultSet res =c.Select("select * from Personne");
	while(res.next()) {
		p=new Personne(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
		Personnes.add(p);
		
	}
	return Personnes;
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
