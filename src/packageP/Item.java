package packageP;

public class Item {
	
	private String nombre;
	private int cantidadPedido;
	private int id;
	private Pedido pedido;
	
	public Item() {
		
	}
	
	public Item(String nombre, int cantidadPedido) {
		super();
		this.nombre = nombre;
		this.cantidadPedido = cantidadPedido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadPedido() {
		return cantidadPedido;
	}
	public void setCantidadPedido(int cantidadPedido) {
		this.cantidadPedido = cantidadPedido;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
 
	
}
