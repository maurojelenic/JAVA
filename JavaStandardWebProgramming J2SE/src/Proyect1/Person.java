package Proyect1;

import java.util.Random;

public class Person {
	
	public String name;
	public String surname;
	public int age;
	public Document document;
	
	public Person(String name, String surname, Document document) {
		
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.document = document;
		
	}
	
	
	public boolean adult(int age){
		
		return(age >= 18);
	}
	
	
	
	public String message() {
		
		String message = "Nombre: " + name + " Apellido: " + surname + " Datos del documento: " + document.viewdocument() + " Edad: " + age +
							" Y es " + (adult(age)? "Es mayor de edad" : "Es menor de edad");
		
		return message;
	}
	
	public byte assingage(){
		
		Random newage = new Random();
		
		return(byte) newage.nextInt(127);
	}
	
	

}
