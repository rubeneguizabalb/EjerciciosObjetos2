package EjerciciosObjetos2;

public class M03 {
	//M3.- Crea la función RedondeoHaciaAbajo que el valor de un nº redondeado hacia abajo.

    public static double RedondeoHaciaAbajo(double numero) {
        //Utilizamos Math.floor para redondear hacia abajo
        return Math.floor(numero); 
    }

    public static void main(String[] args) {
        double numero = 4.7;
        double resultado = RedondeoHaciaAbajo(numero);
        
        System.out.println("El número redondeado hacia abajo es: " + resultado);
        
        double numero2 = 8.125;
        double resultado2 = RedondeoHaciaAbajo(numero2);
        
        System.out.println("El número redondeado hacia abajo es: " + resultado2);
    }
}
