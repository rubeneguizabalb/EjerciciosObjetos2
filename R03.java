package EjerciciosObjetos2;
import java.util.*;

public class R03 {
	//R3.- Crea la función veinteAleatorios que muestre 20 números enteros aleatorios entre 0 y 10 (ambos incluidos)
	
	public static void veinteAleatorios() {
        //Crear un objeto Random
        Random rand = new Random();
        
        //Generar y mostrar 20 números aleatorios entre 0 y 10
        for (int i = 0; i < 20; i++) {
            //Generar un número aleatorio entre 0 y 10 (inclusive)
            int numeroAleatorio = rand.nextInt(11);  // nextInt(11) genera un número entre 0 y 10
            System.out.println(numeroAleatorio);
        }
    }

    public static void main(String[] args) {
        //Llamar a la función para mostrar 20 números aleatorios
        veinteAleatorios();
    }
}

