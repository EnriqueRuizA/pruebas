// Detecta si cumple alguna condición o no cumple ninguna
import java.io.*;
import java.util.*;
public class FileCondicion{
    public static void main(String[] args) {
      /*Inicio del programa*/
      float numero = 0.5f;
      if(numero>0){
          System.out.println("el número "+numero+" es positivo");
        }
      if (numero>0 && numero<100){
          System.out.println("el número "+numero+" es menor a 100");
        }

      if (numero<0 || numero>100){
          System.out.println("el número "+numero+" no cumple ninguna condición");
        }
      /*Fin del programa*/
         }
}
