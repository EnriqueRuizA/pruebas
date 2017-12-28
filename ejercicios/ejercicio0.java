/*
0.
Preparemos la gestión de la fábrica "robotines robotronic". Los robots tienen
como único comportamiento "hablar" pero cada uno dice una frase distinta.Crea
varios robots y que cada uno diga su frase.
*/


class MyCode {
	class Robot {
	  Robot(){}

	  public void speak (String word){
	    System.out.println(word);
	  }
	  public int valorDoblado (int x){
	   return x*2;
	  }
	}

  public static void main (String[] args) {
    Robot losRobots[] = new Robot[5];
    for(int i=0; i<4; i++){
      losRobots[i]= new Robot();
      losRobots[i].speak("Hola soy el robot nº "+i);
    }
  }
}
