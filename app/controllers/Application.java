package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void alta(String au, String tit, int is,String nom,String des) {
        libro l = null;
        categoria c = null;
    	if (au != null && !au.equals("") && nom != null && !nom.equals(""))
    	    l = new libro (au, tit, is).save();
    		c = new categoria (nom , des).save();
    	
    	render(l,c);
    }
    
    
    public static void cambio(String au1, String au2,String nom1,String nom2) {
    	 libro l = null;
    	 categoria c = null;
     	if (au1 != null && !au1.equals("") && nom1 != null && !nom1.equals("")){
     	    l = libro.find("byAutor", au1).first();
     	    c = categoria.find("byNombre",nom1).first();
     	    if ( l != null && c != null){
     	    	l.autor = au2;
     	    	l.save();
     	    	c.nombre = nom2;
     	    	c.save();
     	    }
     	    
     	}
    	render(l,c);
    }
    
    public static void baja(String nom, String au) {
   	 categoria c = null;
   	 libro l = null;
    	if (nom != null && !nom.equals("") && au != null && !au.equals("")){
    	    c = categoria.find("byNombre", nom).first();
    	    l = libro.find("byAutor", au).first();
    	    
    	    if ( c != null && l != null){
    	    	
    	    	c.delete();
    	    	l.delete();
    	    }
    	    
    	}
   	render(c,l);
   }
    

}