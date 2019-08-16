package fr.tableau;

import java.util.Scanner;

public class sc_nextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner (System.in);
		  System.out.println("Veuillez saisir un mot, svp: ");
		  String str = sc.nextLine(); //Mise en mémoire de l'entrée clavier
		  System.out.println("Vous avez saisi : " + str );
		  sc.nextLine();
	}

}
