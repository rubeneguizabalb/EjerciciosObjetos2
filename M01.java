package EjerciciosObjetos2;
import java.util.*;

public class M01 {
	//M1.- Crea la función AreaCirculo que calcule del área de un círculo a partir de un radio proporcionado por teclado. 
	//Función que calcula el área del círculo: πr^2
	
    public static double AreaCirculo(double radio) {
        //Definimos el valor de π (USAMOS LA CONSTANTE Math.PI)
        double pi = Math.PI;
        
        //Calculamos el área utilizando la fórmula πr^2
        double area = pi * radio * radio;
        
        return area;
    }

    public static void main(String[] args) {
        //Creamos un objeto Scanner para leer la entrada del usuario (NO SE CONTROLA QUE SE INTRODUZCAN LETRAS)
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario el radio del círculo
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();

        //Llamamos a la función AreaCirculo para calcular el área
        double area = AreaCirculo(radio);

        //Mostramos el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        
        scanner.close();
    }
}
