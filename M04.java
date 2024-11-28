package EjerciciosObjetos2;

public class M04 {
	//M4.- Crea la función RedondeoEnteroCercano que el valor de un nº redondeado hacia el entero más cercano.
	
    public static long RedondeoEnteroCercano(double numero) {
        //Utilizamos Math.round para redondear al entero más cercano
        return Math.round(numero); //El resultado de Math.round es un long
    }

    public static void main(String[] args) {
        double numero1 = 4.3;
        double numero2 = 4.7;
        double numero3 = 4.5;
        
        long resultado1 = RedondeoEnteroCercano(numero1);
        long resultado2 = RedondeoEnteroCercano(numero2);
        long resultado3 = RedondeoEnteroCercano(numero3);
        
        System.out.println("El número " + numero1 + " redondeado al entero más cercano es: " + resultado1);
        System.out.println("El número " + numero2 + " redondeado al entero más cercano es: " + resultado2);
        System.out.println("El número " + numero3 + " redondeado al entero más cercano es: " + resultado3);
    }
}
