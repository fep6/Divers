package fr.conversionDegreCF;

import java.util.Scanner;

public class Sdz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Décalaration des variables
				int q = 0; //initialisation question type de conversion
				double e = 0; // Variable d'entrée
				Scanner sc; // déclaration objet input
				double r = 0; //résultat de conversion
				int b = 1 ; //Boucle du programme
				
				
				while (b==1) { // pour sortir du programme
					// Affichage question
					System.out.println("Quelle conversion voulez-vous faire: "
							+ "1: °C en °F "
							+ "2: °F en °C ");
					
					// Input
					// Scanner sc1 = new Scanner (System.in);
					sc = new Scanner (System.in);
					q = sc.nextInt();
					
					if (q != 3) {
						// Traitement du choix émis
						while ((q != 1 ) && (q != 2)) {
							System.out.println("Merci de choisir entre 1 ou 2!");
							// Input
							sc = new Scanner (System.in);
							q = sc.nextInt();
						}
						
						// Demande d'entrée de la valeur à convertir
						System.out.println("Merci d'entrer votre valeur:");
						sc = new Scanner (System.in);
						e = sc.nextInt();
						
						//Traitement
						if ( q == 1 ) { //(°C en °F) 
							r = 9*e/5+32;
						} 
						else if (q == 2) { //(°F en °C) 
							r = (e-32)*5/9;
						} 
						System.out.print("Le résultat est : " + r);
						
						
						// Affichage de l'unité de mesure
						if ( q == 1 ) { //(°C en °F) 
							System.out.println("°F");
						} 
						else if (q == 2) { //(°F en °C) 
							System.out.println("°C");
						} 
					}
				
					// on demande si on veut recommencer
				System.out.println("voulez-vous recommencer?: "
						+ "1 -> oui "
						+ "2-> non");
				sc = new Scanner (System.in);
				b = sc.nextInt();
				}
			}
	}
