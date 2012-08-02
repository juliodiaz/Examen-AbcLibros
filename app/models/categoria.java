package models;

import javax.persistence.*;

import play.db.jpa.Model;

@Entity
public class categoria extends Model{

	public String nombre;
	public String descripcion;
	
	public categoria (String n, String d){
		
		nombre = n;
		descripcion = d;
		
	}
	
}
