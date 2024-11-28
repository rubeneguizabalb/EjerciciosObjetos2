package EjerciciosObjetos2;
import java.util.Random;

public class R08 {
	//R8.- Crea la función tresColores donde de una lista de 6 colores (rojo, azul, verde, amarillo, violeta y naranja), saque de forma aleatoria un color de esa lista. 
	//Hacer este proceso 3 veces obtener 3 colores y mostrarlos en pantalla.
	
	// Función que selecciona tres colores aleatorios de una lista de 6 colores
    public static void tresColores() {
        //Variables para guardar que numero entre 0 y 5 ha salido como aleatorio
    	int c1;
        int c2;
        int c3;
        
        //Crear un generador de números aleatorios
        Random random = new Random();

        //Generar 3 valores de colores
        c1 = random.nextInt(6);  //Genera un número aleatorio entre 0 y 5;  
        c2 = random.nextInt(6);  //Genera un número aleatorio entre 0 y 5; 
        c3 = random.nextInt(6);  //Genera un número aleatorio entre 0 y 5;

        String color1 = "";
        
        switch(c1) {
          case 0:
            color1 = "rojo";
            break;
          case 1:
            color1 = "azul";
            break;
          case 2:
            color1 = "verde";
            break;
          case 3:
            color1 = "amarillo";
            break;
          case 4:
            color1 = "violeta";
            break;
          case 5:
            color1 = "naranja";
            break;
          default:
        }

        String color2 = "";
        
        switch(c2) {
          case 0:
            color2 = "rojo";
            break;
          case 1:
            color2 = "azul";
            break;
          case 2:
            color2 = "verde";
            break;
          case 3:
            color2 = "amarillo";
            break;
          case 4:
            color2 = "violeta";
            break;
          case 5:
            color2 = "naranja";
            break;
          default:
        }

        String color3 = "";
        
        switch(c3) {
          case 0:
            color3 = "rojo";
            break;
          case 1:
            color3 = "azul";
            break;
          case 2:
            color3 = "verde";
            break;
          case 3:
            color3 = "amarillo";
            break;
          case 4:
            color3 = "violeta";
            break;
          case 5:
            color3 = "naranja";
            break;
          default:
        }

        System.out.print(color1 + ", " + color2 + ", " + color3);

    }

    public static void main(String[] args) {
        // Llamamos a la función
        tresColores();
    }
}
