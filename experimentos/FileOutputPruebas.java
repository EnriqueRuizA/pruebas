package experimentos;
import java.io.*;



public class FileOutputPruebas implements Serializable {		//para poder convertirlo en binario
	public static void main(String[] args) throws IOException {
		FileOutputStream ruta = new FileOutputStream ("C:/Users/Arranque 1/Desktop/Nueva Carpeta/cars.dat");
        String texto = "me gusta la tortilla de patatas";
        ObjectOutputStream archivo = new ObjectOutputStream(ruta);

        archivo.writeBytes(texto);
        archivo.close();

	}

}
