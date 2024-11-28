package EjerciciosObjetos2;
import java.util.*;

public class R01 {
	//R1.- Crea la función tirada3Dados que muestre la tirada de tres dados. 
	//Se debe mostrar también la suma total (los puntos que suman entre los tres dados).

    public static void tirada3Dados() {
        Random rand = new Random();

        //Tirada de tres dados
        int dado1 = rand.nextInt(6) + 1; //Genera un número entre 1 y 6
        int dado2 = rand.nextInt(6) + 1; //Genera un número entre 1 y 6
        int dado3 = rand.nextInt(6) + 1; //Genera un número entre 1 y 6

        //Suma total de los dados
        int sumaTotal = dado1 + dado2 + dado3;

        //Mostrar resultados de los dados y su suma total
        System.out.println("Resultados de la tirada:");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Dado 3: " + dado3);
        System.out.println("Suma total: " + sumaTotal);
    }

    public static void main(String[] args) {
        // Llamar a la función para realizar la tirada de tres dados
        tirada3Dados();
    }	
}
