package fr.heritage;

class Main {
	  public static void main(String[] args){
	
		  
		   // Avant polymorphisme
		  
		  
	Ville v = new Ville();
	System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
//	System.out.println("Le nombre d'instances bis de la classe Ville est : " + Ville.getNombreInstancesBis());
	Ville v1 = new Ville("Marseille", 123456, "France");
	System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
	//	System.out.println("Le nombre d'instances bis de la classe Ville est : " + Ville.getNombreInstancesBis());       
	Ville v2 = new Ville("Rio", 321654, "Brésil");
	System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
	//	System.out.println("Le nombre d'instances bis de la classe Ville est : " + Ville.getNombreInstancesBis());

	System.out.println("\n v = "+v.getNom()+" ville de  "+v.getNombreHabitants()+ 
			" habitants se situant en "+v.getNomPays());
	System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ 
			" habitants se situant en "+v1.getNomPays());
	System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ 
			" habitants se situant en "+v2.getNomPays()+"\n\n");
//	        
	/*
	  Nous allons interchanger les Villes v1 et v2
	  tout ça par l'intermédiaire d'un autre objet Ville.        
	*/       
	Ville temp = new Ville();
	temp = v1;
	v1 = v2;
	v2 = temp;
	       
	System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
	System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");

	/*       
	  Nous allons maintenant interchanger leurs noms
	  cette fois par le biais de leurs mutateurs.
	*/   
	v1.setNom("Hong Kong");
	v2.setNom("Djibouti");
	      
	System.out.println(" v1 = "+v1.getNom()+" ville de  "+v1.getNombreHabitants()+ " habitants se situant en "+v1.getNomPays());
	System.out.println(" v2 = "+v2.getNom()+" ville de  "+v2.getNombreHabitants()+ " habitants se situant en "+v2.getNomPays()+"\n\n");
	  
//	  // Essai pour héritage
//	Capitale cap = new Capitale();
//	System.out.println("D'une capitale par défaut, cap.decrisToi()" + cap.decrisToi());
	  
	// Essai 2 pour héritage https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/21424-gerez-les-heritages#/id/r-2181190
//	Capitale cap2 = new Capitale("Paris", 654987, "France", "Tour Eiffel");
//	System.out.println("\n"+cap2.decrisToi());
	  

	// Définition d'un tableau de villes null
	Ville[] tableau = new Ville[6];
	Ville[] tableau2 = new Capitale[1];
	        
	//Définition d'un tableau de noms de villes et un autre de nombres d'habitants
	String[] tab = {"Marseille", "lille", "caen", "lyon", "paris", "nantes"};
	int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
	         
	//Les trois premiers éléments du tableau seront des villes,
	//et le reste, des capitales
	for(int i = 0; i < 6; i++){
	  if (i <3){
	    Ville V = new Ville(tab[i], tab2[i], "france");
	    tableau[i] = V;
	    tableau2[0] = V;
	  }
	         
	  else{
	    Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
	    tableau[i] = C;
	  }
	}
	                 
	//Il ne nous reste plus qu'à décrire tout notre tableau !
	for(Ville V : tableau){
	  System.out.println(V.decrisToi()+"\n");
	} 	  
		  
		  
 
		 
	
		  
		  
	  }
}

