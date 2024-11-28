package EjerciciosObjetos2;
import java.util.*;

public class I02 {
	//I2.- Crea una función segundosMedianoche donde dada una hora por teclado, 
	//dice los segundos que faltan para la medianoche.
	
    public static int segundosMedianoche(int hora, int minutos, int segundos) {
        //Total de segundos en un día (24 horas) (86400)
        int totalSegundosDia = 24 * 60 * 60;

        //Calculamos los segundos transcurridos desde la medianoche hasta la hora ingresada
        int segundosTranscurridos = (hora * 60 * 60) + (minutos * 60) + segundos;

        //Calculamos los segundos restantes hasta la medianoche
        return totalSegundosDia - segundosTranscurridos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedimos la hora, minutos y segundos al usuario (NO SE ESTA CONTROLANDO QUE SEAN VALIDOS)
        System.out.print("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();
        
        System.out.print("Ingresa los minutos (0-59): ");
        int minutos = scanner.nextInt();

        System.out.print("Ingresa los segundos (0-59): ");
        int segundos = scanner.nextInt();

        //Llamamos a la función segundosMedianoche
        int segundosRestantes = segundosMedianoche(hora, minutos, segundos);

        //Mostramos el resultado
        System.out.println("Faltan " + segundosRestantes + " segundos para la medianoche.");
        
        scanner.close();
    }
}
