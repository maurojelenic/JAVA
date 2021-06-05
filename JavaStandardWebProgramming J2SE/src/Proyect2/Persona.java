package Proyect2;
import java.util.Random;

public class Persona {

	
	private static int contador = 0;
	
	private int id;
	private String nombre;
	private String apellido;
	private Documento documento;
	private byte edad;
	
	public Persona() {
		contador ++;
		id = contador;
	}

	public Persona(int id, String nombre, String apellido, Documento documento, byte edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = asignarEdad();
	}
	
	
	public boolean mayorEdad(){
		return edad >= 18;
	}
	
	public String mostrarAtributos() {
		String mensaje = "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", "
				+ documento.mostrarDocumento() + ", edad=" + edad + " y es "
				+ (mayorEdad() ? "mayor de edad" : "menor de edad");
		return mensaje;
	}
	
	
	
	public byte asignarEdad(){
		Random nuevaEdad = new Random();
		return (byte) nuevaEdad.nextInt(127);
		
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Persona.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	
	
	
	
}
