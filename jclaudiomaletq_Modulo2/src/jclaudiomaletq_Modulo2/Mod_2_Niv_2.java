package jclaudiomaletq_Modulo2;
import java.util.*;
public class Mod_2_Niv_2 {
/*
 * Crea una aplicaci� que dibuixi una escala de nombres, 
 * sent cada l�nia nombres comen�ant en un i acabant en el nombre de la l�nia. 
 * Aquest �s un exemple, si introdu�m un 5 com a al�ada: 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		final int fin = 5;
		for (int i= 1;i<=fin;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	
/*
 * Crea una aplicaci� que dibuixi una pir�mide invertida
 * de asteriscs. Nosaltres li vam passar l'altura de
 * la pir�mide per teclat. Aquest �s un exemple:
 */
		
	System.out.println("");
	System.out.println("");
	Scanner leer = new Scanner(System.in);
	System.out.println("introduce la altura: ");
	int fina = leer.nextInt();
	for (int i= fina;i>=0;i=i-2) {
		for (int j=1;j<=i;j++) {
			if(j==1) {
			         for (int z=i;z<fina;z=z+2) {
				      System.out.print(" ");
			          }
			        }
			System.out.print("*");
		}
		System.out.println("");
	}

}
}
