//Buscar palabra en una cadena de texto
import java.util.regex.*;
public class MainRegex{
	public static void main(String[] args) {


		String aguja = "sql";             //palabra buscada
		String pajar = "lenguaje SQL sql sqll";    //texto

		//escapar y agregar limites de palabra completa - case-insensitive
		Pattern regex = Pattern.compile("\\b" + Pattern.quote(aguja) + "\\b", Pattern.CASE_INSENSITIVE);
		Matcher match = regex.matcher(pajar);

		//la palabra está en el texto??
		if (match.find()) {  //si se quiere encontrar todas las ocurrencias: cambiar el if por while
		    System.out.println("Encontrado: '" + match.group()
		                     + "' dentro de '"
		                     + pajar
		                     + "' de la posición "
		                     + match.start()
		                     + " a la posicion "
		                     + match.end()
		                     );
		} else {
		    System.out.println("'" + aguja + "' NO está dentro de '" + pajar);
		}

	}
}
