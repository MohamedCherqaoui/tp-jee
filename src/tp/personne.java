package tp;

import model.Override;
import model.Personne;
import model.String;

public class Personne {
	private int id;
	private String Nom; 
	private String Prenom; 
	private String login; 
	private String Password ;
	
	
	
	public Personne() {
		super();
	}



	public Personne(int id, String Nom, String Prenom, String login, String Password) {
		this.id = id;
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.login = login;
		this.Password = Password;
	} 

	public Personne(String Nom, String Prenom, String login, String Password) {
	
		this.Nom = Nom;
		this.Prenom = Prenom;
		this.login = login;
		this.Password = Password;
	} 
	
	
	public Personne(Personne P) {
		this.id = P.id;
		this.Nom = P.Nom;
		this.Prenom = P.Prenom;
		this.login = P.login;
		this.Password = P.Password;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return Nom;
	}



	public void setNom(String nom) {
		Nom = nom;
	}



	public String getPrenom() {
		return Prenom;
	}



	public void setPrenom(String prenom) {
		Prenom = prenom;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	@Override
	public String toString() {
		return "Personne [id=" + id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", login=" + login + ", Password="
				+ Password + "]";
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
