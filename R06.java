package EjerciciosObjetos2;
import java.util.*;

public class R06 {
	//R6.- Crea la función sacarNumero24 que vaya generando números aleatorios pares entre 0 y 100 y que no termine hasta que no saque el número 24. 
	//La función deberá decir al final cuántos números se han generado.

    public static void sacarNumero24() {
        Random random = new Random();
        int count = 0;
        int numero = -1;  //Inicializamos con un valor distinto de 24 para entrar en el bucle

        //Bucle while que sigue generando números mientras no sea el número 24
        while (numero != 24) {
            //Generar un número aleatorio par entre 0 y 100
            numero = 2 * random.nextInt(51);  //El número es 2 * un valor entre 0 y 50 (Asi sacamos los pares entre 0 y 100)
            count++;  //Contamos el número generado
        }

        //Mostrar cuántos números se generaron hasta que saliera el 24
        System.out.println("Se generaron " + count + " números hasta que salió el 24.");
    }

    public static void main(String[] args) {
        sacarNumero24();
    }
}
