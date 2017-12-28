ENLACES DE INTERES
/* https://codepad.remoteinterview.io */

/////////////////////////////////////////////////////////////////////
/*Array de valores, hay que definir siempre el número de valores
El array se declara en el momento de escribir "new int[]{1,2,..."*/
int[] nombreArray = new int[]{1,2,3,4};
String[] nombreArray = new int[]{"hola","adios","espera un momento"};

/////////////////////////////////////////////////////////////////////
/*Ejercicio nº 1: crea dos arrays uno con los meses del año y otro
con los días de la semana*/

String[] diasDeLaSemana = new String[]{"Lunes ","Martes ","Miércoles ","Jueves ","Viernes ","Sábado ","Domingo "};
int[] diasDelMes = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
String[] mesesDelAño = new String[]{"Enero ","Febrero ","Marzo ","Abril ","Mayo ","Junio ","Julio ","Agosto ","Septiembre ","Octubre ","Noviembre ","Diciembre "};

System.out.println("mi día favorito del año es el "+diasDeLaSemana[3]+diasDelMes[22]+" de "+mesesDelAño[7]);

/////////////////////////////////////////////////////////////////////

int notaDelExamen = 6;
char evaluacion;

if (notaDelExamen>=9){
	evaluacion = "sobresaliente";
}
else if (notaDelExamen>=7){
	evaluacion = "notable";
}
else if (notaDelExamen>=5){
	evaluacion = "aprobado";
}
else {
	evaluacion = "suspenso";
}
System.out.println(evaluacion);

/////////////////////////////////////////////////////////////////////
/*Identificar si un valor es "hola"*/
String palabra = "Hola";
	if (palabra == ("Hola") || palabra.equals ("hola")){ // NUNCA USAR PARA COMPARAR CADENAS DE TEXTO ==
		System.out.println("la palabra si es Hola");
	}
	else {
		System.out.println("la palabra no es Hola");
	}

list[i]
/*Bucle FOR*/
for(int i=1;i<=10;i++){
	System.out.printIn(i)
}

int[] diasDelMes = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
for(int i=0;i<diasDelMes.length;i++){
	total+= list[i];
	System.out.printIn(list[i])
}

//Bucle FOR mas corto (for each)
int nombredelAray[]={1,2,3,4,5,6,7,8,9,10};
for(int i:nombredelAray){
	System.out.println(i);
}

/////////////////////////////////////////////////////////////////////
/*Crea un programa llamado letter counter con un array de strings
que muestre cada valor del array y su longitud*/
String[] mesesDelAño = new String[]{"Lunes ","Martes ","Miércoles ","Jueves ","Viernes ","Sábado ","Domingo "};
String longitudPalabra;

/*for (String i: mesesDelAño) {*/
for (int i=0;i<mesesDelAño.length;i++) {
	System.out.println(mesesDelAño[i]);
	System.out.println(mesesDelAño[i].length());}

/////////////////////////////////////////////////////////////////////
/*for each, se declara el índice "i" y se hace referencia al array
que se va a recorrer, ya sabe que el origen es en i=0 la longitud
del array y que el incremento es i++*/
String[] mesesDelAño = new String[]{"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
String longitudPalabra;

//Este for each enumera cada elemento
for (String letras: mesesDelAño) {
	/*System.out.println(letras);*/
//seguido de su número de letras
	/*System.out.println(letras.length());*/
	System.out.println("La palabra "+mesesDelAño[i]+" tiene "+mesesDelAño[i].length()+" letras");
}

/////////////////////////////////////////////////////////////////////
/*args [i] indica las posiciones en un String en este caso */
String[] mesesDelAño = new String[]{"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
int longitud = Integer.parseInt(args[0]);

/////////////////////////////////////////////////////////////////////
//TERNARIOS//
resultado = (condicion?si_es_que_si:si_es_que_no);

int numero = 5;
String elMayor;

elMayor = (numero>10?
	"El número es mayor a 10.":
	"El número es menor o igual a 10.");

System.out.println(elMayor);

/////////////////////////////////////////////////////////////////////
//Saca por consola los días que tienen el número de letras que se indica
String[] diasDeLaSemana = new String[]{"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
int longitud = 6;
for (int i=0;i<diasDeLaSemana.length;i++) {
	if (longitud == diasDeLaSemana[i].length()) {
		System.out.println(diasDeLaSemana[i]);
	}
}

/////////////////////////////////////////////////////////////////////
//Saca por consola los días que tienen el número de letras que se indica mediante FOR EACH y TERNARIOS
String[] diasDeLaSemana = new String[]{"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
int longitud = 6; //int porque es un número
String palabra; //String porque es una cadena de texto
/*FOR EACH (en este for each se enumeran los elementos "dias[i]" del aray "diasDeLaSemana")*/
for (String dia:diasDeLaSemana) {
/*TERNARIOS (el ternario "palabra" devuelve el resultado de comparar la longitud introducida con la de cada palabra)*/
	palabra = (longitud == dia.length() ? "el "+dia+" si que tiene "+longitud+" letras":"el "+dia+" no tiene "+longitud+" letras");
	System.out.println(palabra);
}

/////////////////////////////////////////////////////////////////////
// El String contiene la secuencia específica de valores "char"
String frase = "Entonces parecía una buena idea";
String contiene = "un";
  boolean retval = frase.contains(contiene);
  System.out.println("¿La frase contiene '" +contiene+ "'? : " + retval);

/////////////////////////////////////////////////////////////////////
//EJEMPLO DE EXCEPCIÓN O ERROR
private static void function(int numeroCaracteres, String texto, String diasDeLaSemana) {
	for (int i=0;i<diasDeLaSemana.length;i++) {
	diasDeLaSemana.contains();
		if (diasDeLaSemana[i].length() == numeroCaracteres && diasDeLaSemana[i].equals(texto)) {
			System.out.println("BIEN! el "+diasDeLaSemana[i]+" cumple con el numero");
		}else{
			System.out.println("El "+diasDeLaSemana[565]+" no cumple con los requisitos");
			}
		//El mensaje de error saldrá si ocurre esto
		if (numeroCaracteres<=0) {
		//las excepciones se lanzan
		throw new IllegalArgumentException("Number of char cant be 0 or lower");
		}
	}

//////////////////////////////////////////////////////////////////////////////

Map <Integer,Car> cars = new HasMap <> ();					// inferencia de tipos <key, value>
cars.put(1, seatPanda);										//cars.value(); equivale un array de coches
cars.put(2, opelZafira);									//entry es "(3, ferrariEnzo)" el conjunto de
cars.put(3, ferrariEnzo);									//	key y value



List <Integer> cars = new ArrayList <> ();					//list extends collection
cars.add(landRover);										//las lista es una interfaz con apariencia de array
cars.add(opelZafira);										//
cars.add(ferrariEnzo);



Map <String, list <Car> > carsByBrand = new HasMap <> ();	//mapear listas
	List <Car> seatsCars = new ArrayList <> ();				//
		seatsCars.add(seatPanda);							//
		seatsCars.add(seatIbiza);							//
	List <Car> ferrariCars = new ArrayList <> ();			//
		ferrariCars.add(ferrariEnzo);						//
		ferrariCars.add(ferrariTestarrosa);					//

	carsByBrand.get(seatIbiza.getBrand());					//llamada

//////////////////////////////////////////////////////////////////////////////

Map <String, list <Car> > carsByBrand = new HasMap <> ();	//mapear listas
	List <Car> seatsCars = new ArrayList <> ();				//
		seatsCars.add(seatPanda);							//
		seatsCars.add(seatIbiza);							//
	List <Car> ferrariCars = new ArrayList <> ();			//
		ferrariCars.add(ferrariEnzo);						//
		ferrariCars.add(ferrariTestarrosa);					//

	carsByBrand.get(seatIbiza.getBrand());					//llamada

//////////////////////////////////////////////////////////////////////////////
/*IF / ELSE IF / ELSE*/

if (DesplazamientoX == 0 && DesplazamientoY == 1) {
        System.out.println ("Se procede a bajar el personaje 1 posición");
}
 else if (DesplazamientoX == 1 && DesplazamientoY == 0) {
    System.out.println ("Se procede a mover el personaje 1 posición a la derecha");
}
else if (DesplazamientoX == -1 && DesplazamientoY == 0) {
    System.out.println ("Se procede a mover el personaje 1 posición a la izquierda");
}
 else {
    System.out.println ("Los valores no son válidos");
}

//////////////////////////////////////////////////////////////////////////////


/*
1.
Modelemos el molometro. Tendra una unidad de medida llamada molines y trés
métodos: mola, no mola y moloONoMolo.
*/

/*
2.
Clase que gestione la multiplicidad de nombres de Enrique. Tendrá un
contenedor interno que almacene los nombres y un saludo de Enrique del tipo
"Hola, soy [NOMBRE_ALEATORIO_DEL_CONTENEDOR]"
*/

/*
3.
El profesor dice muchas sigals y me cuesta recordarlas todas, modelarea algo
para poder almacenarlas en un contenedor y mostrarlas todas por pantalla
cuando las necesite. Cuando añada una sigla comprobaré si ya está en el
contenedor.
*/

/*

*/

//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
/* BATALLA DE ROBOTS */
//Creamos la clase robot con su constructor
class Robot {
  int hp;
  int attack;
  String name;
  Robot(int a, int b, String c){
    this.hp = a;
    this.attack = b;
    this.name = c;
  }
  //Este método sirve para comprobar si quedan puntos de hp
  boolean isAlive (){
    if(hp>0){
      return true;
    }else{
      return false;
    }
  }
  //Este método sirve para obtener el nombre de cada instancia
  String getName(){
    return this.name;
  }
  //Este método sirve para restar vida y mostrarla por pantalla
  void damageReceived(int a){
    this.hp = this.hp - a;
    System.out.println("Al robot " + this.name
    + " le queda " + this.hp + " puntos de vida");
  }
  //Este método es el principal de la batalla, y usa el anterior
  void atacar(Robot target){
    System.out.println
      (this.name + " ataca a " + target.getName()
      + " y le hace un daño de: " + this.attack);
    target.damageReceived(this.attack);
  }
}
/*--------------------------------------------------------------------------*/
//Esta clase es en donde se ejecuta la batalla
class MyCode {
  public static void main (String[] args) {
  	//Construimos las dos instancias de Robot que van a luchar
    Robot ludarro = new Robot(
      100,
      15,
      "LudotronX5");
    Robot enricacho = new Robot(
      150,
      20,
      "Enritron el poderoso");
    //Establecemos el ciclo de combate a muerte
    do {
      ludarro.atacar(enricacho);
    }
      while(ludarro.isAlive() && enricacho.isAlive());
  }
}
/*--------------------------------------------------------------------------*/
/*DEVUELVE:
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 135 puntos de vida
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 120 puntos de vida
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 105 puntos de vida
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 90 puntos de vida
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 75 puntos de vida
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 60 puntos de vida
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 45 puntos de vida
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 30 puntos de vida
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 15 puntos de vida
LudotronX5 ataca a Enritron el poderoso y le hace un daño de: 15
Al robot Enritron el poderoso le queda 0 puntos de vida
*/

//////////////////////////////////////////////////////////////////////////////////
//			//////		//////		//////		//////		//	//	//			//
//	 		//			  //		//	//		//	//		//	//	//			//
//			//////		  //		//	//		//////		//	//	//			//
// 				//		  //		//	//		//								//
//			//////		  //		//////		//			//	//	//			//
//////////////////////////////////////////////////////////////////////////////////
