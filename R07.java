package EjerciciosObjetos2;
import java.util.Random;

public class R07 {
	//R7.- Crea la función tresCartasAleatorias donde se saquen 3 cartas aleatorias de una lista de 5 (Corazón, Herradura, Diamante, Campana y Limón), mostrar el resultado de las tres cartas y un mensaje.
	//Si el resultado es que las tres cartas es diferente mostrar el mensaje “Lo siento, ha perdido”, si las tres cartas son iguales “Enhorabuena, ha ganado 10 monedas.”, en otro caso que muestre “Bien, ha recuperado su moneda”.

    public static void tresCartasAleatorias() {
        //Definimos las cartas disponibles como variables individuales
        String carta1 = "Corazón";
        String carta2 = "Herradura";
        String carta3 = "Diamante";
        String carta4 = "Campana";
        String carta5 = "Limón";
        
        //Sacar tres cartas aleatorias
        String cartaSeleccionada1;
        String cartaSeleccionada2;
        String cartaSeleccionada3;

        //Crear un generador de números aleatorios
        Random random = new Random();
        
        
        int indice = random.nextInt(5);
        //Guardamos la carta 1 seleccionada de forma aleatoria
        switch (indice) {
            case 0: 
            	cartaSeleccionada1 = carta1;
            	break;
            case 1: 
            	cartaSeleccionada1 = carta2;
            	break;
            case 2: 
            	cartaSeleccionada1 = carta3;
            	break;
            case 3: 
            	cartaSeleccionada1 = carta4;
            	break;
            case 4: 
            	cartaSeleccionada1 = carta5;
            	break;
            default: 
            	cartaSeleccionada1 = "No hay indice";
            	break;  //Este caso no debería ocurrir
        }
        
        //Calculamos otro numero aleatorio
        indice = random.nextInt(5);
        //Guardamos la carta 2 seleccionada de forma aleatoria
        switch (indice) {
            case 0: 
            	cartaSeleccionada2 = carta1;
            	break;
            case 1: 
            	cartaSeleccionada2 = carta2;
            	break;
            case 2: 
            	cartaSeleccionada2 = carta3;
            	break;
            case 3: 
            	cartaSeleccionada2 = carta4;
            	break;
            case 4: 
            	cartaSeleccionada2 = carta5;
            	break;
            default: 
            	cartaSeleccionada2 = "No hay indice";
            	break;  //Este caso no debería ocurrir
        }
        
        //Calculamos otro numero aleatorio
        indice = random.nextInt(5);
        //Guardamos la carta 3 seleccionada de forma aleatoria
        switch (indice) {
            case 0: 
            	cartaSeleccionada3 = carta1;
            	break;
            case 1: 
            	cartaSeleccionada3 = carta2;
            	break;
            case 2: 
            	cartaSeleccionada3 = carta3;
            	break;
            case 3: 
            	cartaSeleccionada3 = carta4;
            	break;
            case 4: 
            	cartaSeleccionada3 = carta5;
            	break;
            default: 
            	cartaSeleccionada3 = "No hay indice";
            	break;  //Este caso no debería ocurrir
        }

        // Mostrar las cartas seleccionadas
        System.out.println("Cartas seleccionadas: " + cartaSeleccionada1 + ", " + cartaSeleccionada2 + ", " + cartaSeleccionada3);

        // Verificar el resultado
        if (cartaSeleccionada1.equals(cartaSeleccionada2) && cartaSeleccionada2.equals(cartaSeleccionada3)) {
            System.out.println("Enhorabuena, ha ganado 10 monedas.");
        } else if (!cartaSeleccionada1.equals(cartaSeleccionada2) && !cartaSeleccionada2.equals(cartaSeleccionada3) && !cartaSeleccionada1.equals(cartaSeleccionada3)) {
            System.out.println("Lo siento, ha perdido.");
        } else {
            System.out.println("Bien, ha recuperado su moneda.");
        }
    }

    public static void main(String[] args) {
        tresCartasAleatorias();
    }
}
