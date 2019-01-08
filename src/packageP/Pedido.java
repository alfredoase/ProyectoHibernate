package packageP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

	private int idPedido;
	private Date fechaPedido;
	private List<Item> listaItem = new ArrayList<Item>();
	private Empresa empresa;
	
	public Pedido() {
		
	}
	
	public Pedido(int idPedido, Date fechaPedido, List<Item> listaItem, Empresa empresa) {
		super();
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.listaItem = listaItem;
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	
	public List<Item> getListaItem() {
		return listaItem;
	}
	public void setListaItem(List<Item> listaItem) {
		this.listaItem = listaItem;
	}
	
	public void addItem(Item item){
		item.setPedido(this);
		this.listaItem.add(item);
	}
}
