package EjerciciosObjetos2;
import java.util.Random;
import java.util.Scanner;

public class R11 {
	/* R11.- Crea la función adivinaNumero donde el usuario piensa un numero entre 0 y 10 y el programa intentará adivinarlo eligiendo un numero aleatorio. El programa mostrará un numero, y preguntará lo siguiente:

		"¿Es el ‘X’ ?" donde X será el numero aleatorio elegido por el programa y habrá que mostrar un mensaje con las opciones para contestar.
		 ("[s] Sí  |  [+] Tu número es mayor  |  [-] Tu número es menor");

		Si se acierta mostrar un mensaje y el programa termina, si no se tendrá que elegir un siguiente numero aleatorio, pero acortando el nº aleatorios generados.

		Por ejemplo, pensamos el 77, el programa genera el numero 45, nosotros le decimos que el numero es mayor a 45, por lo tanto en el siguiente intento el programa buscara un numero entre 46 y 100.

		En el segundo intento el programa genera el 89, nosotros le decimos que menor, y en el siguiente intento el programa buscara un numero entre 46 y 88.
		Así hasta que acierte o pasen mas de 8 intentos.

		Si pasan mas de 8 intentos, mostrar un mensaje al usuario diciendo que ha ganado. */
	
    public static void adivinaNumero() {
        Random random = new Random();
        
        int min = 0;
        int max = 10;
        int intentos = 0;
        int numeroElegido;
        
        System.out.println("¡Piensa un número entre 0 y 10 y yo intentaré adivinarlo!");
        
        Scanner scanner = new Scanner(System.in);
		while (intentos < 8) {
            //El programa elige un número aleatorio en el rango actual
            numeroElegido = random.nextInt(max - min + 1) + min;
            
            //Muestra el número elegido
            System.out.println("¿Es el " + numeroElegido + " ?");
            System.out.println("[s] Sí  |  [+] Tu número es mayor  |  [-] Tu número es menor");
            
            //Lee la respuesta del usuario
            //OJO: No se controla que solo se teclee s, + ó -. 
            //     No se controla que nos pasemos diciendo + ó -.
            //     Ejemplo el numero que nos da es el 1, le decimos -, nos da el 0, si volvemos a darle 0 suelta un error.
            String respuesta = scanner.nextLine();
            
            if (respuesta.equalsIgnoreCase("s")) {
                //Si acierta el número, termina el programa
                System.out.println("¡He adivinado tu número " + numeroElegido + " en " + (intentos + 1) + " intentos!");
            } else if (respuesta.equalsIgnoreCase("+")) {
                //Si el número es mayor, ajusta el rango para el siguiente intento
                min = numeroElegido + 1;
            } else if (respuesta.equalsIgnoreCase("-")) {
                //Si el número es menor, ajusta el rango para el siguiente intento
                max = numeroElegido - 1;
            }
            
            //Aumenta el contador de intentos
            intentos++;
        }
        
        //Si no se adivina en 8 intentos, muestra el mensaje de victoria para el usuario
        System.out.println("¡No he adivinado tu número en 8 intentos! ¡Has ganado!");
        
        scanner.close();
    }

    public static void main(String[] args) {
        adivinaNumero();
    }
}

