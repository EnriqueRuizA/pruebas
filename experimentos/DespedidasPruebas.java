
package experimentos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DespedidasPruebas {

	public static void main (String[] args) {

		Map <String, List <String> > saludos = new HashMap <> ();		//mapear listas
																			//
		ArrayList <String> recibimientos = new ArrayList <> ();						//
		recibimientos.add("Hola");												//
		recibimientos.add("Ey!");												//
																			//
		ArrayList <String> despedidas = new ArrayList <> ();						//
		despedidas.add("Adios");											//
		despedidas.add("Hasta luego");									//
																			//
		System.out.println(despedidas);								//llamada

    }
}
