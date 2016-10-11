package services;

import daos.ContactDAO;

public class ContactService {
	
	public boolean createContact(String id, String nom, String prenom, String mail){
		
		ContactDAO cdao = new ContactDAO();
		cdao.createContact(id, nom, prenom, mail);
		return true;
	}
	
	public boolean readContact(String id){
		ContactDAO cdao = new ContactDAO();
		cdao.readContact(id);
		return true;
	}
	
	public boolean updateContact(String id, String nom, String prenom, String mail){
		ContactDAO cdao = new ContactDAO();
		cdao.updateContact(id, nom, prenom, mail);
		return true;
	}
	
	public boolean deleteContact(String id){
		ContactDAO cdao = new ContactDAO();
		cdao.deleteContact(id);
		return true;
	}
}
