import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		//Creamos las variables
		String palabra= "";
		String texto= "";
		int contador=0;
		
		//Introducimos los datos
		System.out.print("Dame las palabras: ");
		palabra=sc.nextLine().toLowerCase();
		
		System.out.print("Introduce el texto: ");
		texto=sc.nextLine().toLowerCase();
		
		// Funcion split para separar por espacios (De esta forma separamos palabra por palabra)
		String[] str1 = palabra.split(" ");
		String[] str = texto.split(" ");
 
		/*Recorremos los 2 for
		 * El primero será la primera palabra introducida
		 * Y esta palabra recorrerá todo el texto palabra por palabra, porque las hemos separado por espacios
		 */
		for(int x = 0; x<str1.length; x++) {
			for(int i = 0; i<str.length; i++ ) {

				//Comparamos si tienen la misma longitud las 2 palabras y si es así hacemos:
				if(str1[x].length() == str[i].length()) {
					
					
					//Transformamos cada palabra (str1[x] y str[i]) en un char, para poder comparar después carácter a carácter
					char[] palabraV = str1[x].toCharArray();
					char[] textoV = str[i].toCharArray();
					
					//Con la funcion SORT ordenamos alfabéticamente estas palabras
					Arrays.sort(palabraV);
					Arrays.sort(textoV);
					
					//Guardamos las palabras ordenadas alfabeticamente un nuevo String (palabraD y textoD)
					String palabraD = new String(palabraV);
					String textoD = new String(textoV);

					
					// Miramos con la funcion equals si su sequencia de caracteres es la misma
					// Recuerda que estan ordenados alfabeticamente asi que Zar--> arz
					if(palabraD.equals(textoD)) {
						//Si son iguales mostramos por pantalla str1[x] y str[i] y no palabrasD porque queremos ver Zar y no queremos ver arz
						System.out.println("La palabra "+str1[x]+" tiene el anagrama "+str[i]+" en el texto");
						//se suma el contador para saber cuantos anagramas llevamos
						contador++;
					}
					
				}
			}
		}
		//Mostramos por pantalla el contador
		System.out.println("En total hay "+contador+" anagramas en el texto");
	}

}

