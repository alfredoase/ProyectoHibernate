package packageP;

public class Direccion {
	
	private String calle;
	private String poblacion;
	private int CP;
	private int idDireccion;
	private Empresa empresa;
	
	public Direccion() {
		
	}
	
	public Direccion(String calle, String poblacion, int cP, int idDireccion, Empresa empresa) {
		super();
		this.calle = calle;
		this.poblacion = poblacion;
		this.CP = cP;
		this.idDireccion = idDireccion;
		this.empresa = empresa;
	}
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	public int getCP() {
		return CP;
	}
	public void setCP(int cP) {
		CP = cP;
	}
	
	public int getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}
	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
