package EjerciciosObjetos2;

public class S01 {
	/*
	 * Crea la función finCualquiera, donde Dadas dos cadenas, devuelve verdadero si alguna de las cadenas aparece al final de la otra cadena, ignorando las diferencias entre mayúsculas y minúsculas (en otras palabras, el cálculo no debe distinguir entre mayúsculas y minúsculas). 
		finCualquiera ("Hiabc", "abc") → verdadero
		finCualquiera ("AbC", "HiaBc") → verdadero
		finCualquiera ("abc", "abXabc") → verdadero

	 * */
	
	public static boolean finCualquiera(String a, String b) {
	    if(a.length() < b.length()) {
	        //Nos quedamos con la cadena mas pequeña en la variable a
	    	//La grande en la variable b y las guardamos en minusculas
	    	
	    	String temp = a;
	        a = b.toLowerCase();
	        b = temp.toLowerCase();
	    }
	    
	    //
	    return a.substring(a.length() - b.length()).equals(b);
	}

	public static void main(String[] args) {
        System.out.println(finCualquiera("Hiabc", "abc"));
        System.out.println(finCualquiera("AbC", "HiaBc")); 
        System.out.println(finCualquiera("abc", "abXabc"));
        System.out.println(finCualquiera("abd", "abXabc")); 
    }
}
