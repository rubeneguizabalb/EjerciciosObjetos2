package EjerciciosObjetos2;

public class S05 {
	/*
	 * S5.- Crea la función mismoCaracterEstrella, donde devuelve verdadero si para cada '*' (estrella) en la cadena, si hay caracteres inmediatamente antes y después de la estrella, son iguales.
	 * */
	
	public static boolean mismoCaracterEstrella(String str) {
	    for(int i = 1; i < str.length() - 1; i++) {
	        if(str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
	        {
	            return false;
	        }
	    }
	                
	    return true;
	}

	public static void main(String[] args) {
        System.out.println(mismoCaracterEstrella("xy*yzz"));
        System.out.println(mismoCaracterEstrella("xy*zzz")); 
        System.out.println(mismoCaracterEstrella("*xa*az"));
    }
}
