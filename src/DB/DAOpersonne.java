package DB;

import java.sql.ResultSet;

public class DAOpersonne {
 private connexion c=new connexion();
public int supprimer (int id) {
	c.conenct();
	int res = c.MAJ("Delet from personne where id="+id);
	c.disconnect;
	return res ;
}
public int supprimer (int id) {
	c.conenct();
	int res = c.MAJ("insert into personne (nom,prenom,login,password)values('"+p.getnom()+"','"+p.getprenom()+"','"+p.getlogin()+"','"+p.getpassword()+"')"+);
	c.disconnect;
	return res ;
}
public int modifier (personne p){
	c.connect();
	int res = c.MAJ("update personne set nom='"+p.getnom()+"',prenom='"+p.getprenom()+"',login='"+p.getlogin()+"',password='"+p.getpassword()+"'where id="p.getid"");
	c.Disconnect();
	return res;
}  
public Arraylist <personne> listepersonne(){
	personne p=null;
	Arraylist<personne> personne =new Arraylist<personne>();
	c.connect();
	ResultSet res=c.select("Select * from personne");
	while (res.next()) {
		p=new personne (res.get.int(1),res.get.string(2),res.get.string(3),res.get.string(4),res.get.string(5));
		personne.add(p);
	}
	c.disconnect();
	return personne;
}
}