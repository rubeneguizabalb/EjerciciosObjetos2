package EjerciciosObjetos2;
import java.util.Random;

public class R09 {
	//R9.- Crea la función monedaYposicion donde de una lista de monedas sacar un tipo de moneda aleatoria (1 centimo, 2 centimos, 5 centimos, 10 centimos, 20 centimos, 50 centimos, 1 euro y 2 euros) 
	//y luego si ha salido cara o cruz.
	

    public static void monedaYposicion() {
        //Definir los tipos de monedas como variables
        String moneda1 = "1 céntimo";
        String moneda2 = "2 céntimos";
        String moneda3 = "5 céntimos";
        String moneda4 = "10 céntimos";
        String moneda5 = "20 céntimos";
        String moneda6 = "50 céntimos";
        String moneda7 = "1 euro";
        String moneda8 = "2 euros";
        
        //Generador de números aleatorios
        Random random = new Random();
        
        //Seleccionar aleatoriamente una moneda (entre 0 y 7)
        int monedaSeleccionada = random.nextInt(8);  
        
        String moneda = "";
        switch (monedaSeleccionada) {
            case 0: 
            	moneda = moneda1; 
            	break;
            case 1:
            	moneda = moneda2; 
            	break;
            case 2: 
            	moneda = moneda3; 
            	break;
            case 3: 
            	moneda = moneda4; 
            	break;
            case 4: 
            	moneda = moneda5; 
            	break;
            case 5:
            	moneda = moneda6; 
            	break;
            case 6:
            	moneda = moneda7; 
            	break;
            case 7: 
            	moneda = moneda8; 
            	break;
        }
        
        String resultadoCaraCruz = "";
        boolean caraCruz = random.nextBoolean(); //La inicializamos calculando de forma aleatoria true/false;
        
        //Determinar si ha salido cara o cruz
        if (caraCruz) {
        	resultadoCaraCruz = "cara";
        }else{
        	resultadoCaraCruz = "cruz";
        }
        
        //Mostrar el resultado
        System.out.println("Moneda seleccionada: " + moneda);
        System.out.println("Resultado de la tirada: " + resultadoCaraCruz);
    }

    public static void main(String[] args) {
        monedaYposicion();
    }
}
