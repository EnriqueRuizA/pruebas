
package experimentos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheros {

    public static void main(String[] args) throws IOException {
        String ruta = "C:/Users/Arranque 1/Desktop/Nueva Carpeta/datos_01.dat";
        String texto = "me gusta la tortilla de patatas";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
        	//crear nuevo archivo bw
            bw = new BufferedWriter(new FileWriter(ruta, true));
            //escribir en el archivo bw
            bw.write(texto+", }");

        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Archivo recien creado!");
        }
        bw.close();
    }
