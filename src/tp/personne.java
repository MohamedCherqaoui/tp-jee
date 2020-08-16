package tp;

public personne extends Httpservlet() {
	private int id ;
	private string nom ;
	private string prenom ;
	private string login ;
	private String password	 ;

 public personne() {
	 this.id = "o";
	 this.nom = "";
	 this.prenom = "";
	 this.login = "";
	 this.password = "";
 }
 public personne(int id, String nom ,String prenom , String login , String password) {
	 this.id = id;
	 this.nom = nom;
	 this.prenom = prenom;
	 this.login = login;
	 this.password = password;
 }
 public personne(String nom ,String prenom , String login , String password) {
	 this.nom = nom;
	 this.prenom = prenom;
	 this.login = login;
	 this.password = password;
 }
 public personne(personne p) {
	 this.nom = p.nom;
	 this.prenom = p.prenom;
	 this.login = p.login;
	 this.password = p.password;
 }
 public String getnom() {
	 return nom ;
 }
  public void setnom () {
	  this.nom=nom;
  }
  public String getprenom() {
  return prenom ;
 }
  public void setprenom () {
  this.prenom=prenom;
 }
 public String getlogin() {
 return login ;
 }
 public void setlogin () {
  this.login=login;
 }
 public String getpassword() {
  return password ;
 }
 public void setpassword () {
 this.password=password;
 }
@override
public String toString() {
	return personne ("nom :"+this.nom+"prenom :"+this.prenom+"login :"+this.login+"password"+this.password;)
 }		
}

}
