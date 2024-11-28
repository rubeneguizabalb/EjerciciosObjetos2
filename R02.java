package EjerciciosObjetos2;
import java.util.*;

public class R02 {
	//R2.- Crea la función cartaBarajaFrancesa que muestre al azar el nombre de una carta de la baraja francesa. 
	//Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. 
	//Cada palo está formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7,  8, 9, 10, J, Q, K y A (que sería el 1).

    public static void cartaBarajaFrancesa() {
        Random rand = new Random();

        //Generar un número aleatorio entre 1 y 4 para el palo
        int paloNum = rand.nextInt(4) + 1;
        String palo = "";

        //Selección del palo basado en el número generado
        switch(paloNum) {
	        case 1:
	        	palo = "Picas";
	        	break;
	        case 2:
	        	palo = "Corazones";
	        	break;
	        case 3:
	        	palo = "Diamantes";
	        	break;
	        case 4:
	        	palo = "Tréboles";
	        default:
        }


        //Generar un número aleatorio entre 1 y 13 para la carta
        int cartaNum = rand.nextInt(13) + 1;
        String carta = "";

        switch(cartaNum) {
	        case 1:
	        	carta = "As";
	        	break;
	        case 11:
	        	carta = "J";
	        	break;
	        case 12:
	        	carta = "Q";
	        	break;
	        case 13:
	        	carta = "K";
	        	break;
	        default:
		        	carta = String.valueOf(cartaNum);
        }

        //Mostrar la carta seleccionada
        System.out.println("Carta seleccionada: " + carta + " de " + palo);
    }

    public static void main(String[] args) {
        //Llamar a la función para mostrar una carta aleatoria
        cartaBarajaFrancesa();
    }
}
