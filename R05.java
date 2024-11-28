package EjerciciosObjetos2;
import java.util.*;

public class R05 {
	//R5.- Crea la función generaQuiniela que crea una quiniela aleatoria con tres columnas rellenas y pleno al quince.
	//Ej:

	//	1      |
	//	     2 | 
	//	  X    |

	public static void generaQuiniela() {
        //Crear un objeto Random
        Random rand = new Random();
        //Para guardar el resultado de un partido
        int resultado;
        
        //Para guardar si hay resultado en cada columna
        String resultadoColumna1 = "";
        String resultadoColumnaX = "";
        String resultadoColumna2 = "";
        
        //Mostrar el encabezado de la quiniela
        System.out.println("Quiniela aleatoria:");
        System.out.println("Partido | Columna 1 | Columna X | Columna 2");
        
        //Generar y mostrar los resultados de los 15 partidos para las tres columnas
        for (int partido = 1; partido <= 15; partido++) {
        	resultado = rand.nextInt(3);  //Genera un número aleatorio entre 0 y 2
        	switch (resultado) {
        		case 0: 
        			resultadoColumna1 = "1";
                 	resultadoColumnaX = " ";
                  	resultadoColumna2 = " ";
                	break; //Local gana
                case 1: 
                	resultadoColumna1 = " ";
                 	resultadoColumnaX = "X";
                  	resultadoColumna2 = " ";
                	break; //Empate
                case 2: 
                	resultadoColumna1 = " ";
                 	resultadoColumnaX = " ";
                  	resultadoColumna2 = "2";
                	break; //Visitante gana
                default: 
                	break; //Esto no debería ocurrir, pero lo dejamos por si acaso
            }
        	//Mostrar los resultados de este partido en las tres columnas
        	System.out.println("  " + partido + "     |   " + resultadoColumna1 + "       |    " + resultadoColumnaX + "      |    " + resultadoColumna2);
        }
    }

    public static void main(String[] args) {
        //Llamar a la función para generar y mostrar la quiniela aleatoria
        generaQuiniela();
    }
}
