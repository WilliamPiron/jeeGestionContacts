package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ContactDAO {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/jee_td_contact";
	private String uid = "root";
	private String passwd = "root";
	
	public void createContact(String id, String nom, String prenom, String mail){
		//devra faire appel � JDBC et cr�er les infos dans une BDD
		//System.out.println("Contact cr�� !");
		
		Connection cx = null;
		Statement stmt = null;
		
		try{
			Class.forName(driver);
			cx = DriverManager.getConnection(url,uid,passwd);
			stmt = cx.createStatement();
			String requete = "INSERT INTO contact VALUES ('" + id +	"','" + nom + "','" + prenom + "','" + mail + "');";
			int nb = stmt.executeUpdate(requete);
			System.out.println("Nombre de contacts cr��s : "+ nb);
			
		} catch (ClassNotFoundException e){
			//classe du pilote introuvable
			System.out.println("pilote pas trouv� !");
			
		}catch (SQLException e){
			//acc�s refus�
			throw new RuntimeException(e);
			
		}finally{
			try {
				if (stmt != null) stmt.close();
				if (cx!=null) cx.close();
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("pas pu fermer !");
			}
		}
	}
	
	public void readContact(String id){
		//devra faire appel � JDBC et lire les infos dans une BDD
		//System.out.println("Contact lu !");
		
		Connection cx = null;
		Statement stmt = null;
		
		try{
			Class.forName(driver);
			cx = DriverManager.getConnection(url,uid,passwd);
			stmt = cx.createStatement();
			String requete = "SELECT * FROM contact WHERE id = '"+id+"';";
			//int nb = stmt.executeUpdate(requete);
			//System.out.println("Contact : "+ nb);
			ResultSet rs = stmt.executeQuery(requete);
			while (rs.next()){
				System.out.println("Contact : " + rs.getString("id") + " " + rs.getString("nom") + " " + rs.getString("prenom") + " " + rs.getString("mail"));
			}
			
		} catch (ClassNotFoundException e){
			//classe du pilote introuvable
			System.out.println("pilote pas trouv� !");
			
		}catch (SQLException e){
			//acc�s refus�
			throw new RuntimeException(e);
			
		}finally{
			try {
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();				
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("pas pu fermer !");
			}
		}
		
	}
	
	public void updateContact(String id, String nom, String prenom, String mail){
		//devra faire appel � JDBC et mettre � jour les infos dans une BDD
		//System.out.println("Contact mis � jour !");
		
		Connection cx = null;
		Statement stmt = null;
		
		try{
			Class.forName(driver);
			cx = DriverManager.getConnection(url,uid,passwd);
			stmt = cx.createStatement();
			String requete = "UPDATE contact SET nom='" + nom + "', prenom='" + prenom + "', mail='" + mail + "' WHERE id = '"+id+"';";
			int nb = stmt.executeUpdate(requete);
			System.out.println("Nombre de contacts mis � jour : "+ nb);
			
		} catch (ClassNotFoundException e){
			//classe du pilote introuvable
			System.out.println("pilote pas trouv� !");
			
		}catch (SQLException e){
			//acc�s refus�
			throw new RuntimeException(e);
			
		}finally{
			try {
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();				
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("pas pu fermer !");
			}
		}
		
	}
	
	public void deleteContact(String id){
		//devra faire appel � JDBC et supprimer les infos dans une BDD
		//System.out.println("Contact supprim� !");
		Connection cx = null;
		Statement stmt = null;
		
		try{
			Class.forName(driver);
			cx = DriverManager.getConnection(url,uid,passwd);
			stmt = cx.createStatement();
			String requete = "DELETE FROM contact WHERE id = '"+id+"';";
			int nb = stmt.executeUpdate(requete);
			System.out.println("Nombre de contacts supprim�s : "+ nb);
			
		} catch (ClassNotFoundException e){
			//classe du pilote introuvable
			System.out.println("pilote pas trouv� !");
			
		}catch (SQLException e){
			//acc�s refus�
			throw new RuntimeException(e);
			
		}finally{
			try {
				if (stmt != null) stmt.close();
				if (cx != null) cx.close();				
			}catch(SQLException e){
				e.printStackTrace();
				System.out.println("pas pu fermer !");
			}
		}
		
	}
}
