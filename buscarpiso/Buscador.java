
package buscarpiso;
import java.io.IOException;

public class Buscador {
	public static void main(String[] args) throws IOException {
		//precio, distancia a sol, teléfono de contacto y enlace
		Piso piso001 = new Piso
				(350,120,657381725,"google.com");
		//precio y telefono de contacto
		Piso piso002 = new Piso (250,657321548);

		Piso piso003 = new Piso (400,789456123);

		System.out.println("El mejor piso es: " + mejorPiso.getInfoPage);
		System.out.println("Y cuesta: " + mejorPiso.getPrice + " al mes");
		System.out.println("El teléfono de contacto: "+mejorPiso.getMovilPhone);
	}
}
