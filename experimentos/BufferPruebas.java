package experimentos;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class BufferPruebas implements Serializable {

	public static void main(String[] args) throws IOException {
        String ruta = "C:/Users/Arranque 1/Desktop/Nueva Carpeta/cars.dat";
        String texto = "me gusta la tortilla de patatas";

        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(texto+", ");
            bw.close();
    }

}
