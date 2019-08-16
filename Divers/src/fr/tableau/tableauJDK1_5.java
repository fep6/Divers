package fr.tableau;

public class tableauJDK1_5 {

	public static void main(String[] args) {
		
		
		// https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/20998-creez-des-tableaux#/id/r-2180856
		String [][] tab = {{"toto", "titi", "tutu", "tete", "tata"}, {"A", "B", "C", "D"} , {"+-" , "*/" , "=$"}};

		int i=0 , j=0;
		
 // avec i, j
//				System.out.println("Impression avec \'for\'");
//		for (i=0 ; i<tab.length; i++) {
//			for (j=0 ; j<tab[i].length ; j++) {
//				System.out.println(tab [i] [j]);
//			}
//		}
// avec :		
		System.out.println("Impression avec \'for\' et \':\'");
		for(String sousTab[] : tab)
		{
		  i = 0;
		  for(String str : sousTab)
		  {     
		    System.out.println("La valeur de la nouvelle boucle est  : " + str);
		    // System.out.println("La valeur du fr.tableau à l'indice ["+j+"]["+i+"] est : " + tab[j][i]);
		    i++;
		  }
		  j++; 
		}
		
	}
}

