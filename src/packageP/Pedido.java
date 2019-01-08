package packageP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

	private int idPedido;
	private Date fechaPedido;
	
	private List<Item> listaItem = new ArrayList<Item>();
	
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
}
