

/////////////////////////////////// PROYECT 2 ///////////////////////////////////////////////////


package Proyect2;

import Proyect2.Documento;
import Proyect2.Persona;
import java.util.Scanner;



public class Mainclass {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Persona[] personas;
		int cantPersonas;
		
		System.out.println("Ingreso de Datos de Personas Laboratorio01");
		System.out.print("\n");
		System.out.print("Ingrese la cantidad de Personas que cargara: ");
		
		cantPersonas = teclado.nextInt();
		personas = new Persona[cantPersonas];
		
		for(int i = 0; i <= personas.length; i++) {
			
			Persona personaAuxiliar = new Persona();
			
			Documento documento = new Documento();
			


			System.out.print("Ingrese el Nombre de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.setNombre(teclado.next());
			System.out.print("Ingrese el Apellido de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.setApellido(teclado.next());
			System.out.print("Ingrese el Tipo de Documento de la Persona [" + (i + 1) + "]: ");
			documento.setTipoDocumento(teclado.next());
			System.out.print("Ingrese el Numero de Documento de la Persona [" + (i + 1) + "]: ");
			documento.setNumeroDocumento(teclado.nextInt());
			
			
			personaAuxiliar.setDocumento(documento);
			System.out.print("Ingrese la Edad de la Persona [" + (i + 1) + "]: ");
			personaAuxiliar.setEdad(teclado.nextByte());
			
			

			personas[i] = personaAuxiliar;
			System.out.println();
			
			
		}

		
		System.out.print("\n");

		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i].mostrarAtributos());
		}
		
		System.out.println("Cantidad de Personas " + Persona.getContador());
		
		teclado.close();


			
		
	}

}
