package EjerciciosObjetos2;

public class I01 {
	
	//I1.- Crea la función esPrimo, donde devuelve si el número es primo o no.
	// Función que determina si un número es primo
    public static boolean esPrimo(int numero) {
        //El 1 no es primo, el 2 es primo
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true; 
        }

        //Verificamos si el número tiene divisores a partir de 3
        for (int i = 3; i <= numero; i++) {
            if (numero % i == 0) {
                return false; //Si es divisible por cualquier número, no es primo
            }
        }

        return true; //Si no es divisible por ningún número, es primo
    }

    public static void main(String[] args) {
        //Prueba de la función esPrimo
        int numero = 29;
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

}
