package jclaudiomaletq_Modulo2;
import java.util.*;
/*
 * Emmagatzemar en un Map tant les lletres de la llista com el nombre
 *  de vegades que apareixen.  Has de recòrrer l'array anterior i anar comptant el número de 
 *  vegades que apareix cada caràcter.
 */
public class Mod_2_Niv_1_Fas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		Map mapa=new HashMap();
	//	String nombre="Jaime Claudio Malet Quintar";
		String nombre="Leo Messi";
      //  ordeno las letras
		char tempo[] = nombre.toCharArray();
		Arrays.sort(tempo);
        String ordenado = "";
      // escojo las letras no repetidas  
        char interm='z';
        int ii = 0;
		do  {
			if (tempo[ii]!=interm)
			{
				ordenado = ordenado + tempo[ii];
			}
			interm = tempo[ii];
			ii++;	
		} while  (ii<nombre.length());  
	  // lleno el map con los datos	
		for (int i=0;i<ordenado.length();i++) {
			int contador = 0;
			for (int j=0;j<nombre.length();j++) {
				if (nombre.charAt(j)==ordenado.charAt(i)){
					contador++;
				}
			}
			mapa.put(ordenado.charAt(i),contador);
		}
		
		
		//visualización	
		
		System.out.println(nombre);
	//	System.out.print(mapa);
	//	System.out.println();
		
	   Iterator itk = mapa.keySet().iterator();
	   Iterator itv = mapa.values().iterator();
		while (itk.hasNext()) {
			System.out.print("clau='");
		    System.out.print(itk.next());
		    System.out.print("', valor='");
		    System.out.println(itv.next());
		}
		
	}

}
