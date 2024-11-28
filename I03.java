package EjerciciosObjetos2;
import java.util.*;

public class I03 {
	//I3.- Crea una función numeroPalindromo donde diga que un número (de 5 cifras máximo) es palíndromo o no.
	
    public static boolean numeroPalindromo(int numero) {
        //Variable para almacenar el número original
        int original = numero;
        int invertido = 0;
        
        //Aseguramos que el número es positivo
        numero = Math.abs(numero);
        
        //Si el numero es mayor a 5 cifras mostramos mensaje y devolvemos falso
        if (numero > 100000){
            System.out.print("La cifra debe tener como máximo 5 cifras.");
            return false;
          } 
        else {
	        //Invertimos el número
	        while (numero > 0) {
	            int digito = numero % 10; //Obtenemos el último dígito
	            invertido = invertido * 10 + digito; //Construimos el número invertido
	            numero = numero / 10; //Eliminamos el último dígito del número original
	        }
	
	        //Comparamos el número original con el invertido y devolvemos directamente el resultado de la comparación
	        return original == invertido;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Pedimos un número al usuario
        System.out.print("Ingresa un número (de 5 cifras máximo): ");
        int numero = scanner.nextInt();

        //Verificamos si el número es palíndromo
        if (numeroPalindromo(numero)) {
            System.out.println(numero + " ES un número palíndromo.");
        } else {
            System.out.println(numero + " NO es un número palíndromo.");
        }
        
        scanner.close();
    }
}
