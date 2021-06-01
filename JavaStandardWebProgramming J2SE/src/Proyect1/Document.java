package Proyect1;

public class Document {
	
	
	public String dnitype;
	public int dninumber;
	
	
	public Document(String dnitype, int dninumber) {
		
		this.dnitype = dnitype;
		this.dninumber = dninumber;
				
	}
	
	public String viewdocument(){
		
		return "Tipo de documento: " + dnitype + " Numero de documento: " + dninumber;
		
	}
	
	
	
	
	
	
	
	
	

}
