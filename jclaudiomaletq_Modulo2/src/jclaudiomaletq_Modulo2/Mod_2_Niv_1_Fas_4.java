package jclaudiomaletq_Modulo2;

import java.util.ArrayList;

/*
 * Crea una altra llista amb el teu cognom on cada posició correspongui a una lletra. 
 * Fusiona les dues llistes en una sola.
 * A més, afegeix una posició amb un espai buit entre la primera i la segona. És a dir, partim de la llista name i surname i al acabar l’execució només tindrem una que es dirà fullName. 
 * FullName: [‘N’, ‘A’, ‘M’, ‘E’, ‘ ‘, ‘S’, ‘U’, ‘R‘, ‘N’, ‘A’, ‘M’, ‘E’] 
 */
public class Mod_2_Niv_1_Fas_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> lista_n = new ArrayList(); 
		ArrayList <String> lista_c = new ArrayList();
		ArrayList <String> lista_f = new ArrayList(); 
		//String name="Jaime Claudio";
		String name="Leo";
		//String surname="Malet Quintar";
		String surname="Messi";
	// lleno las dos listas enunciadas	
		for (int i=0;i<name.length();i++) {
			String inter = Character.toString(name.charAt(i));
			lista_n.add(inter);
	            }
		for (int i=0;i<surname.length();i++) {
			String inter = Character.toString(surname.charAt(i));
			lista_c.add(inter);
	            }
	// lleno a lista resultado
		for(int i=0;i<lista_n.size();i++) {
			String pos= (lista_n.get(i));
			lista_f.add(pos.toUpperCase());
		}
		lista_f.add(" ");
		for(int i=0;i<lista_c.size();i++) {
			String pos= (lista_c.get(i));
			lista_f.add(pos.toUpperCase());
		}
	// visualización
		System.out.println(lista_f);
		
}
}
