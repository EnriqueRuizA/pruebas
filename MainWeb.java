//Extraer información de una página web

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MainWeb{
	public static void main(String[] args) {

		try {
	        StringBuffer codeBuffered = new StringBuffer();
	        String code;

	        URL url = new URL("http://www.google.es");
	        InputStream in = url.openStream();
	        BufferedReader read = new BufferedReader(new InputStreamReader(in));

	        String line;
	        while((line = read.readLine()) != null)
	        {
	            codeBuffered.append(line).append("\n");
	        }

	        code = codeBuffered.toString(); // Este es el código de la página :)

	        System.out.println(code); //prueba de que el código sale por pantalla

			//cerramos los streams
			in.close();
			read.close();
	    }
	    catch(IOException e){
	        e.printStackTrace();
	    }
	}
}
