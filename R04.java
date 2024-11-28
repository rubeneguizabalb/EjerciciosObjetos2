package EjerciciosObjetos2;
import java.util.*;

public class R04 {
	//R4.- Crea la función muestraMininoMaximoMedia que muestre 50 números enteros aleatorios 
	//entre 100 y 199 (ambos incluidos) separados por espacios y muestre el máximo, el mínimo y la media de esos números.

    public static void muestraMinimoMaximoMedia() {
        //Crear un objeto Random
        Random rand = new Random();
        
        //Inicializar variables para el mínimo, máximo y la suma total
        int minimo = 100; //El mínimo posible es 100
        int maximo = 199; //El máximo posible es 199
        int suma = 0;     //Variable para almacenar la suma de los números
        
        //Generar y mostrar 50 números aleatorios entre 100 y 199
        for (int i = 0; i < 50; i++) {
            //Generar un número aleatorio entre 100 y 199 (inclusive)
            int numeroAleatorio = rand.nextInt(100) + 100;  //nextInt(100) genera un número entre 0 y 99, luego le sumamos 100
            
            //Imprimir el número en la misma línea
            System.out.print(numeroAleatorio + " ");
            
            //Actualizar el mínimo y el máximo
            if (numeroAleatorio < minimo) {
                minimo = numeroAleatorio;
            }
            if (numeroAleatorio > maximo) {
                maximo = numeroAleatorio;
            }
            
            //Acumular la suma
            suma = suma + numeroAleatorio;
        }
        
        //Calcular la media
        double media = suma / 50.0; //Realizamos la división en punto flotante
        
        //Mostrar los resultados
        System.out.println(); //Para hacer una nueva línea después de los números
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Media: " + media);
    }

    public static void main(String[] args) {
        //Llamar a la función para generar los números y mostrar los resultados
        muestraMinimoMaximoMedia();
    }
}
