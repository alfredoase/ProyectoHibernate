package packageP;

public class Empresa {

	private String CIF;
	private String nombre;
	private int empleados;
	private String direccion;
	
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String Cif) {
		CIF = Cif;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEmpleados() {
		return empleados;
	}
	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}