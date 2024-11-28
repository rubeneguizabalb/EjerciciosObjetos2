package EjerciciosObjetos2;
import java.util.Random;

public class R10 {
	//R10.- Crea la función tiradaDado para un dado con los valores “As, K, Q, J, 7 y 8”, que muestre el valor de la tirada.

    public static void tiradaDado() {
        //Definir los valores posibles del dado
        String valor1 = "As";
        String valor2 = "K";
        String valor3 = "Q";
        String valor4 = "J";
        String valor5 = "7";
        String valor6 = "8";
        
        //Generador de números aleatorios
        Random random = new Random();
        
        //Seleccionar aleatoriamente un valor del dado (entre 0 y 5)
        int dadoSeleccionado = random.nextInt(6);  
        
        //Determina el valor de la tirada basado en el número aleatorio
        String valorTirada = "";
        switch (dadoSeleccionado) {
            case 0: 
            	valorTirada = valor1; 
            	break;
            case 1: 
            	valorTirada = valor2; 
            	break;
            case 2: 
            	valorTirada = valor3; 
            	break;
            case 3: 
            	valorTirada = valor4; 
            	break;
            case 4: 
            	valorTirada = valor5; 
            	break;
            case 5: 
            	valorTirada = valor6; 
            	break;
        }
        
        // Mostrar el resultado de la tirada
        System.out.println("Valor de la tirada: " + valorTirada);
    }

    public static void main(String[] args) {
        tiradaDado();
    }
}
