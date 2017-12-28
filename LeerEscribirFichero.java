//LEER Y ESCRIBIR UN ARRAY A UN FICHERO
//////////////////////////////////////////////////////////////////////////////

package pruebas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LeerEscribirFichero {

	public static void main(String[] args) throws Exception {
	    // 1. crear arreglo.
	    String[][] array = new String[2][];
	    array[0] = new String[2];
	    array[0][0] = "(User_01)";
	    array[0][1] = "(Passwors_01)";
	    array[1] = new String[2];
	    array[1][0] = "(User_02)";
	    array[1][1] = "(Password_02)";

	    // 2. Escribir el arreglo al archivo.
	    writeArray(array);

	    // 3. Leer el arreglo del archivo.
	    String[][] deserializedArray = readArray();

	    // 4. Verificar contenidos del arreglo.
	    for (String[] subArray : deserializedArray) {
	        for (String item : subArray) {
	            System.out.println(item);
	        }
	    }
	}
	// Método para escribir en la base de datos
	private static void writeArray(String[][] array) throws IOException {
	    try (ObjectOutputStream out = new ObjectOutputStream(
	            new FileOutputStream("C:\\Users\\Arranque 1\\Desktop\\database\\userpassword.dat"))) {

	        out.writeObject(array);
	    }
	}
	// Método para actualizar el programa con la base de datos
	private static String[][] readArray() throws IOException, ClassNotFoundException {
	    try (ObjectInputStream in = new ObjectInputStream(
	            new FileInputStream("C:\\Users\\Arranque 1\\Desktop\\database\\userpassword.dat"))) {

	        return (String[][]) in.readObject();
		    }
		}

	}
