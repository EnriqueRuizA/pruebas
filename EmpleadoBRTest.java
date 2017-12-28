/*TEST UNITARIO*/

package com.generation.jwd.salaryApp;

//para poder importar junit hace falta modificar las
//dependencias en el POMdel proyecto MAVEN
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmpleadoBRTest {
	//el comando expected se usa para capturar la excepción
	@Test (expected = BRException.class)
	//el nombre sirve para facilitar su identificación en el log del test
	//su formato es TEST - WITH - RETURNS
	public void testCalculaSalarioBrutoWithVendorHigherSalesAndExtraHoursReturnsCorrectData() throws BRException {
		//EmpleadoBR es la clase a la que pertenecen los métodos a testear
		EmpleadoBR ebr = new EmpleadoBR();
		//calculaSalarioBruto es el método que vamos a testear con los parámetros
		float resultadoReal = ebr.calculaSalarioBruto("vendedor", 2000.0f, 8.0f);
		float resultadoEsperado = 1360.0f;
		//se definen los parámetros y el resultado que "debería" devolver
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
	}
}
