package fr.tableau;

import java.util.Scanner;

public class tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		int i = 0;
		char reponse = ' ',carac = ' ';
		Scanner sc = new Scanner(System.in);
		         
		do {//Boucle principale
		  do {//On répète cette boucle tant que l'utilisateur n'a pas rentré une lettre figurant dans le fr.tableau
		    i = 0;
		    System.out.println("Rentrez une lettre en minuscule, SVP ");
		                
		    carac = sc.nextLine().charAt(0);
		    //Boucle de recherche dans le fr.tableau
		    while(i < tableauCaractere.length && carac != tableauCaractere[i])
		      i++;
		         
		    //Si i < 7 c'est que la boucle n'a pas dépassé le nombre de cases du fr.tableau 
		    if (i < tableauCaractere.length)
		      System.out.println(" La lettre " +carac+ " se trouve bien dans le fr.tableau !");
		    else //Sinon
		      System.out.println(" La lettre " +carac+ " ne se trouve pas dans le fr.tableau !");
		         
		  }while(i >= tableauCaractere.length);

		  //Tant que la lettre de l'utilisateur ne correspond pas à une lettre du fr.tableau    
		  do{
		    System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'N' && reponse != 'O');      
		}while (reponse == 'O');
		                
		System.out.println("Au revoir !");
	
	}

}

