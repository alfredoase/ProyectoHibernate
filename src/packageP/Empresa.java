package packageP;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private int idEmpresa;
	private String CIF;
	private String nombre;
	private int empleados;
	private String direccionS;
	private List<Pedido> listaPedido = new ArrayList<Pedido>();
	
	private Direccion dir;
	
	public Empresa() {
		setDireccion(new Direccion());
	}
	
	public Empresa(int idEmpresa, String Cif, String nombre, int empleados, String direccionS, List<Pedido> listaPedido) {
		super();
		this.idEmpresa = idEmpresa;
		this.CIF = Cif;
		this.nombre = nombre;
		this.empleados = empleados;
		this.direccionS = direccionS;
		this.listaPedido = listaPedido;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	public Direccion getDireccion() {
		return dir;
	}
	public void setDireccion(Direccion dir) {
		this.dir = dir;
		dir.setEmpresa(this);
	}
 
	public List<Pedido> getListaPedido() {
		return listaPedido;
	}
	public void setListaPedido(List<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}
	public void addPedido(Pedido pedido){
		pedido.setEmpresa(this);
		this.listaPedido.add(pedido);
	}
 
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
 
}
