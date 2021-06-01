

///////////////////////////////////// PRACTICA HACIENDO UN PROYECTO RANDOM ////////////////////////



package Proyect1;

import java.util.Scanner;

import Proyect1.Document;
import Proyect1.Person;

public class MainClass {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		Person[] persons;
		int amountofpeople;
		

		System.out.println("Ingresando los datos de las personas");
		System.out.println("\n");
		
		System.out.println("Ingrese la cantidad de personas");
		
		amountofpeople = keyboard.nextInt();
		persons = new Person[amountofpeople];
		
		
		for(int i = 0; i <= persons.length; i++){
			
			System.out.print("Ingrese el Nombre de la Persona [" + (i + 1) + "]: ");
			String name = keyboard.next();
			System.out.print("Ingrese el Apellido de la Persona [" + (i + 1) + "]: ");
			String surname = keyboard.next();
			System.out.print("Ingrese el Tipo de Documento de la Persona [" + (i + 1) + "]: ");
			String dnitype = keyboard.next();
			System.out.print("Ingrese el Numero de Documento de la Persona [" + (i + 1) + "]: ");
			int dninumber = keyboard.nextInt();
			
			
			Person peraux = new Person(name, surname, new Document(dnitype, dninumber));
			
			persons[i] = peraux;
			System.out.println();
			
		}
		
		System.out.println("\n");

		System.out.println("Datos de las Personas");
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].message());

		}
		
		
		keyboard.close();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
