
package com.generation.jwd.testJunit;

public class EmpleadoBR {

	enum tipoEmpleado {VENDEDOR, ENCARGADO};
/*	Funcion para calcular salario bruto*/
	public float calculaSalarioBruto
		(tipoEmpleado tipo,
		float ventasMes,
		float horasExtra)
		throws BRException {
/*		Mensaje de error*/
		if (tipo == null || ventasMes < 0 || horasExtra < 0) {
			throw new BRException("ParÃ¡metro errÃ³neo");}
/*		Salario Base (si es encargado 1500, si no 1000)*/
		float baseSalary =
			tipo == tipoEmpleado.ENCARGADO ? 1500 : 1000;
/*		Salario Complementario (si vende 1500 mas 200,
 *		si no pero vende mas de 1000 mas 100, si no 0)*/
		float bonus =
			ventasMes >= 1500 ? 200 : (ventasMes >= 1000 ? 100 : 0);
/*		Si hay horas extras añadirlas al bonus a 20 cada
 * 		una, si no hay añade 0*/
		bonus += (horasExtra > 0 ? (horasExtra * 20) : 0);
/*		Se suman ambas cantidades para obtener salario bruto*/
		return baseSalary + bonus;}
/*	Funcion para calcular salario neto*/
	public float calculaSalarioNeto(float salarioBruto) throws BRException {
/*		Mensaje de error*/
		if (salarioBruto < 0) {
			throw new BRException("ParÃ¡metro errÃ³neo");}
/*		Si el salario bruto es menor a 1000 no se aplica retencion,
 * 		si es mayor a 1000 se aplica un 16%
 * 		y si es mayor o igual a 1500 se aplica un 18% */
		int retentionPercentage =
				salarioBruto < 1000 ? 0	: (salarioBruto >= 1500  ? 18/100 : 16/100);
/*		Se aplica la retencion pertinente al salario bruto
 * 		para obtener el salario neto*/
		return salarioBruto * (1 - retentionPercentage);
	}
}
