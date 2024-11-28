package EjerciciosObjetos2;
import java.util.*;

public class S06 {
	/*
	 * S6.-  Crea la función calculaMedia3Notas que calcule la media de tres notas que se introduzcan por teclado y diga la nota del boletín a partir de la media (de 9 a 10 Sobre saliente, entre 7 a menor a 9 Notable, entre 6 a menor a 7 Bien, entre 5 y menor a 6 Suficiente, y menos a 5 insuficiente.
	 * */
	public static String calculaMedia3Notas(double nota1, double nota2, double nota3) {
		String boletin;
		//Calcula la media
	    double media = (nota1+nota2+nota3)/3;
	    //if para decir la nota
	    if (media < 5){
	      boletin = "insuficiente";
	    } else if (media < 6){
	      boletin = "suficiente";
	    } else if (media < 7){
	      boletin = "bien";
	    } else if (media < 9){
	      boletin = "notable";
	    } else if (media <= 10){
	      boletin = "sobresaliente";
	    } else {
	      boletin = "ERROR";
	    }
	    return boletin;
	}		
	
	public static void main(String[] args) {
	    String boletin = "a";
	    Scanner scanner = new Scanner(System.in);
	    
	    //Recibe notas (NO ESTA CONTROLADO QUE SI METEN CUALQUIER COSA DE ERROR)
	    System.out.print("Por favor, introduce la primera nota: ");
	    double nota1 = scanner.nextDouble();
	    System.out.print("Por favor, introduce la segunda nota: ");
	    double nota2 = scanner.nextDouble();
	    System.out.print("Por favor, introduce la tercera nota: ");
	    double nota3 = scanner.nextDouble();
	    
	    boletin = calculaMedia3Notas(nota1, nota2, nota3);
	    
	    if (boletin != "ERROR") {	    
	    	System.out.printf("Su nota en el boletín es: %s.", boletin);
	    }
	    else {
	    	System.out.println("Una de las notas es incorrecta.");
	    }
	    
	    scanner.close();
	}
}
