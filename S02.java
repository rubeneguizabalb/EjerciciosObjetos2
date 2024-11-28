package EjerciciosObjetos2;

public class S02 {
	/*
	 * S2.- Crea la función xyzCualquiera, donde devuelve verdadero si la cadena dada contiene una aparición de "xyz" donde xyz no está precedido directamente por un punto (.). Por lo tanto, "xxyz" cuenta, pero "x.xyz" no.
	 * */
	
	public static boolean xyzCualquiera(String str) {
		//Si el largo es > 3 y tiene la cadena xyz en la cadena grande
	    if(str.length() >= 3 && str.substring(0, 3).equals("xyz")){
	        return true;
	    }
	    
	    //Sino recorremos caracter a caracter, buscando xyz, siempre que el caracter leido no sea un . 
	    for(int i = 1; i < str.length() - 2; i++) {
	        if(str.charAt(i - 1) != '.' && str.substring(i, i + 3).equals("xyz")){
	            return true;
	        }
	    }
	                          
	    return false;
	}

	public static void main(String[] args) {
        System.out.println(xyzCualquiera("Hiabxyxc"));
        System.out.println(xyzCualquiera("AbxxyzC")); 
        System.out.println(xyzCualquiera("ax.xyzbc"));
        System.out.println(xyzCualquiera("abx.xyzxxyzd")); 
    }
}
