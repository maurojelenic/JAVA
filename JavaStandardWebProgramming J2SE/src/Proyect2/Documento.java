package Proyect2;

public class Documento {

	
	private String tipoDocumento;
	private int numeroDocumento;
	
	
	public Documento() {
		
	}
	
	
	public Documento(String tipoDocumento, int numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public String mostrarDocumento(){
		
		return "El tipo de documento es: " + tipoDocumento + " El numero de documento es: " + numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
	
	
	
}
