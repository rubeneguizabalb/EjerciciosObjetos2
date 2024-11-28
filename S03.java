package EjerciciosObjetos2;

public class S03 {
	/*
	 * S3.- Crea la función xyBalance, donde diremos que una cadena está balanceada en xy si para todos los caracteres 'x' de la cadena existe un carácter 'y' en algún lugar posterior de la cadena. Por lo tanto, "xxy" está balanceado, pero "xyx" no. Un 'y' puede balancear múltiples 'x'. Devuelve verdadero si la cadena dada está balanceada en xy.
		xyBalance("aaxbby") → verdadero
		xyBalance("aaxbb") → falso
		xyBalance("yaaxbb") → falso
	 * */
	
	public static boolean xyBalance(String str) {
	    boolean y = false;
	    for(int i = str.length() - 1; i >= 0; i--) {
	        if(str.charAt(i) == 'y')
	            y = true;
	                    
	        if(str.charAt(i) == 'x' && !y)
	            return false;
	    }
	                                  
	    return true;
	}

	public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb")); 
        System.out.println(xyBalance("yaaxbb"));
    }
}
