package fr.KOOR.C.D.for_each;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 int [] array = { 10,20,30,40,50,60,70,80,90,100 };
		 
//		 for (int i = 0; i < array.length; i++) {
//			int value = array[i];
//			System.out.println(value);
//		}
//		 System.out.println("_______________________");
		 
		 //Depuis java 5
		 for (int value : array) {
			System.out.println(value);
		}
		 System.out.println("_________________________");
		 
		 //Collection : pas de taille à formater, donc pas de taille maximale
		 ArrayList<String> languages = new ArrayList<String>();
		 languages.add("java");
		 languages.add("python");
		 languages.add("javascript");
		 languages.add("c++");
		 languages.add("HTML5");
		 for (String string : languages) {
			System.out.println(string);
		}
		 
	}

}
