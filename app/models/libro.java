package models;

import javax.persistence.*;

import play.db.jpa.Model;


@Entity
public class libro extends Model {

	public String autor;
	public String titulo;
	public int isbn;
	
	public libro (String a, String t, int i)
	{
		autor = a;
		titulo = t;
		isbn = i;  
	}
	
}

