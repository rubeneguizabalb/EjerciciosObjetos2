package EjerciciosObjetos2;

public class S04 {
	/*
	 * S4.- Crea la función prefijoDoble, donde dada una cadena, considere la cadena de prefijo formada por los primeros N caracteres de la cadena. ¿Aparece esa cadena de prefijo en algún otro lugar de la cadena? Suponga que la cadena no está vacía y que N está en el rango 1..str.length().
	 * */
	
	public static boolean prefijoDoble(String str, int n) {
	    String prefix = str.substring(0, n);
	    
	    for(int i = n; i <= str.length() - n; i++) {
	        if(str.substring(i, i + n).equals(prefix))
	            return true;
	    }
	                    
	    return false;
	}

	public static void main(String[] args) {
        System.out.println(prefijoDoble("aaxbby",1));
        System.out.println(prefijoDoble("aaxbb",2)); 
        System.out.println(prefijoDoble("yaaxbyaab",3));
    }
}
