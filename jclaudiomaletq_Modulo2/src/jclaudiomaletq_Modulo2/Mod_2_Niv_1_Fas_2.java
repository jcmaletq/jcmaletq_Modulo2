package jclaudiomaletq_Modulo2;
import java.util.*;
public class Mod_2_Niv_1_Fas_2 {
	   /*
	    * Canvia la taula per una llista (List<Character>) 
	    * Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’. 
	    * Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’ 
	    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Variables
		ArrayList <String> lista = new ArrayList(); 
	//	String nombre="Jaime Claudio Malet Quintar 1961";
		String nombre="Leo Messi";
		String vocales="aeiou";
		String numeros="1234567890";
        String espacio=" ";

		for (int i=0;i<nombre.length();i++) {
			String inter = Character.toString(nombre.charAt(i));
			lista.add(inter);
		
		}
		
		//visualización	
		for(int i=0;i<lista.size();i++) {
			String pos= (lista.get(i));
			System.out.print(pos+" ");
			if (vocales.contains(pos)) {
				System.out.println("VOCAL");		
			}
			else if (numeros.contains(pos)) {
				System.out.println("Els noms de persones no contenen números!");
			}
			else {
			  if (espacio.contains(pos)) {	
				System.out.println("");
			  }
			  else {
				  System.out.println("CONSONANT");
			  }
				  
			}
		}
		
	}

}
