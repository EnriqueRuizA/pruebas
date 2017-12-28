//ESCRIBIR y LEER OBJETOS EN UNA BASE DE DATOS FALSA

package pruebas;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//CLASS USER WITH PRIVATE VARIABLES
class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

//CLASS CONSTRUCTOR
	User(String nom,String pas){
		this.userName = nom;
		this.password = pas;
	}

//PUBLIC ACCESSORS
	public String getUserName()
		{return userName;}
	public String getPassword()
		{return password;}
}
