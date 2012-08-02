import org.junit.*;

import java.util.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest {

	 @Test
	    public void alta() {
	        libro l = new libro ("Julio", "Progra1", 01).save();
	        
	        categoria c = new categoria ("Programacion Basica", "Introduccion al lenguaje C#").save();
	    }
	    
	    @Test
	    public void buscar() {
	    	libro l = libro.find("byAutor","Julio").first();
	        
	        categoria c = categoria.find("byNombre","Programacion Basica").first();
	        
	        System.out.println("El autor del libro es: "+ l.autor + "\nEl nombre del libro es: "+ c.nombre);
	    }
	    
	    @Test
	    public void cambio() {
	    	libro l = libro.find("byAutor","Julio").first();
	    	categoria c = categoria.find("byNombre","Programacion Basica").first();
	    	l.autor = "Julio Cesar Diaz";
	    	l.save();
	    	c.nombre = "Programacion Basica en C#";
	    	c.save();
	        System.out.println("El Autor es: "+ l.autor); 
	    }
	    
	    @Test
	    public void del() {
	    	libro l = libro.find("byAutor","Julio Cesar Diaz").first();
	    	categoria c = categoria.find("byNombre","Programacion Basica en C#").first();
	    	l.delete();
	    	c.delete();
	    	
	    	System.out.println("Se borro exitosamente"); 
	        
	    }

}
