//COMPONENTES FUNDAMENTALES DE UNA CLASE + CALCULAR EL COCHE MAS RÁPIDO

//clase
class Car{
	//variables de la clase
	String marca;
	String tipo;
	int velocidad;
	//constructor de la clase
	Car(String m, String t,int v){
		this.marca = m;
		this.tipo = t;
		this.velocidad = v;
	}
//métodos accesores (set es mutador)
public String getBrand() {
	return this.brand;
}

public String getType() {
	return this.type;
}

public int getSpeed() {
	return this.speed;
}

//método de la clase
Car veryFastCar = compareCarSpeeds(cars);
System.out.println(
	"The fastest car is "
	+ veryFastCar.getBrand
	+" "
	+veryFastCar.getBrand
	+" with "
	+veryFastCar.getSpeed
	+"Km/h"
	);

/*método de la clase para comparar y encontrar el más rápido*/
public static car compareCarSpeeds(Car[] cars){
		//se inicializa en el valor mas alto posible el contador
		double minTime = Double.MAX_VALUE;
		//se establece la distancia a recorrer
		int distance = 100;
		//se crea al objeto "coche mas rápido"
		Car fastestCar = new Car();
//for each "Car" es un tipo y "car" es un elemento del array
		for (Car car:cars){
			double cartTimeForDistance =
				(double)distance / (double)car.getSpeed();
			if (cartTimeForDistance<minTime) {
				minTime = cartTimeForDistance;
				fastestCar = car;
			}
		}
		return fastestCar;
	}
}


/*-----------------------------------*/

//Creación de la instancia de la clase
Car c1 = new Car("Toyota","4x4",90);
Car c2 = new Car("Ferrari","Deportivo",350);
Car c3 = new Car("Carromato","2 Caballos",15);
Car c4 = new Car("Citroën","Berlina",120);

//Recorrer los objetos
Car[] cars= {c1,c2,c3};
int masRapidez = 0;
String masRapido ="";
for (int i=0;i<cars.length;i++) {
//Imprimimos por pantalla los objetos
	System.out.println("brand: "+cars[i].brand);
	System.out.println("type: "+cars[i].type);
	System.out.println("speed: "+cars[i].speed);
	System.out.println("Tardará en recorrer 100km: "+((float)100/cars[i].speed)*60+" minutos");
	System.out.println("");

	if (cars[i].speed>masRapidez) {
		masRapidez=cars[i].speed;
		masRapido=cars[i].brand;
	}
}
System.out.println("The fastest car is "+masRapido+" with "+masRapidez+"Km/h");
