package fr.tableau;

public class ImpressionTableau {
		// essai push commit 24 04 19 14:01 
	  public static void main(String[] args)
	  {
	    String[] tab = {"toto", "tata", "titi", "tete"};
	    parcourirTableau(tab);
	    System.out.println(toString(tab));   
	  }
 
	  static void parcourirTableau(String[] tab)
	  {
	    for(String str : tab)
	    System.out.println(str);
	  }
	           
	  static String toString(String[] tab)
	  {
	    System.out.println("Méthode toString() !\n----------");
	    String retour = "";
	                   
	    for(String str : tab)
	      retour += str + "\n"; 
	                   
	    return retour;
	  }   
}

