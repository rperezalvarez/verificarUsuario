package modelo;

public class Usuario {
	private String nombre,clave;

	public Usuario() {
		// TODO Auto-generated constructor stub
		setNombre("Luis");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String validar(){
		if(nombre.equalsIgnoreCase("Pedro")){
			if(clave.equalsIgnoreCase("123")){
				return "exito";
			}
		}
		return "fracaso";
	}
	
	

}
