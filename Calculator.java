package com.generation.jwd.calculadoraConCondiciones;

public class Calculator
{
/*
1-Crea una calculadora de cadena con un método int Add (cadena de números)
	sumará los números introducidos

3-Permite que el metodo Add maneje una cantidad ilimitade de números

4-Permite que el metodo Add maneje nuevas lineas entre numeros
	(en lugar de comas) se puede introducir "1 /n 2,3" y sera "6"

6a-Llamar Add con un numero negativo lanzara una excepcion
	"negativos no permitidos" y el negativo introducido

6b-	Si hay varios negativos se muestran todos y se escribe
	"detengase si es un principiante"

7-Los números mayores de 1000 deben ser ignorados, por lo que 1001+2 = 2
*/
package com.generation.jwd.calculadoraConCondiciones;

class Calculator{

	public static void main( String[] args ){
	/*	Introducción de datos*/
		String input = "1,6\n1001,69,88.58";
	/*	División de la cadena por comas y salto de linea
	 * 	separador |\\	*/
		String[] splitted = input.split(",|\\\n|\\.");

	//  Metodo
		int result = 0;
		for(String letter:splitted){
			int noLetter =Integer.parseInt(letter);
			result = (noLetter<=1000? (result+noLetter):(result));
		}
		System.out.println(result);
	}
}
