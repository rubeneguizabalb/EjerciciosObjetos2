package EjerciciosObjetos2;

public class M02 {
	//M2.- Crea la función RedondeoHaciaArriba que el valor de un nº redondeado hacia arriba.
	
	
    public static double RedondeoHaciaArriba(double numero) {
        //Utilizamos Math.ceil para redondear hacia arriba
        return Math.ceil(numero);
    }

    public static void main(String[] args) {
        double numero = 4.3;
        double resultado = RedondeoHaciaArriba(numero);
        
        System.out.println("El número redondeado hacia arriba es: " + resultado);
        
        
        double numero2 = 6.824;
        double resultado2 = RedondeoHaciaArriba(numero2);
        
        System.out.println("El número redondeado hacia arriba es: " + resultado2);
    }
}
