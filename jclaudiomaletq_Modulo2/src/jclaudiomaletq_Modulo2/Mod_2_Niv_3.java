package jclaudiomaletq_Modulo2;
import java.util.*;
import java.lang.*;
public class Mod_2_Niv_3 {
/*
 *En aquest exercici es proposa un exercici complex de    comprovacions i bucles per crear un cronòmetre  digital que vagi mostrant el temps transcorregut en format rellotge hh:mm:ss amb un segon d'espera. 
 *Només necessites 3 variables int (hour, minutes, seconds) 
 *El cronòmetre ha de tenir 6 dígits en tot moment i ha d'iniciar a 00:00:00 
 *L’aplicació no ha de finalitzar mai. 
 *Per que el rellotge trigui un segon has d’implementar:  Thread.sleep(1000); 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // variables
		int hour = 0;
		int minutes= 0;
		int seconds= 0;
	// visualización
	  for(hour=0;hour<=24;hour++) {
		for (minutes=0;minutes<=59;minutes++) {
		 for (seconds=0;seconds<=59;seconds++) {
		   System.out.printf("%02d:" ,hour)	;
		   System.out.printf("%02d:" ,minutes)	;
		   System.out.printf("%02d %n" ,seconds)	;
		   try {
			   Thread.sleep(1000); 
		       } catch(InterruptedException e) {
			   
		                               }
		   }
		  }
		}

}
}