//TRY-FINALLY sin CATCH

import java.io.IOException;

//buscar en String un texto concreto que cumpla con número de caracteres

public class Clase01 {
	public static void main(String []args) throws IOException{
		String diasDeLaSemana []= {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
		int numeroCaracteres = 6;	//numero de caracteres
		String texto = "Jueves";	//texto
	  	System.out.println("Vamos a buscar la palabra "+texto+" con "+numeroCaracteres+" letras:");
	  	System.out.println("");
		try {
			for (int i=0;i<diasDeLaSemana.length;i++) {
				if (diasDeLaSemana[i].length() == numeroCaracteres && diasDeLaSemana[i].equals(texto)) {
					System.out.println("El "+diasDeLaSemana[i]+" cumple con el numero de letras y con el texto");
				}else if (diasDeLaSemana[i].equals(texto)) {
					System.out.println("El "+diasDeLaSemana[i]+" cumple con el texto");
				}else if (diasDeLaSemana[i].length() == numeroCaracteres) {
					System.out.println("El "+diasDeLaSemana[i]+" cumple con el numero de letras");
				}else{
					System.out.println("El "+diasDeLaSemana[i]+" no cumple con ninguno de los requisitos");
				}
			}
		}
		//catch (IOException e) {System.out.println("El parámetro no es correcto");}
		finally{
	    System.out.println("");
		System.out.println("-> fin del programa <-");
		}
	}
}
