package packageP;

import java.util.Date;

import org.hibernate.Session;

public class Program {
		
	public static void main(String[] args) {
		System.out.println("Hola");
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		//COMIENZA INSERTAR
		session.beginTransaction();
		
		Pedido p = new Pedido();
		p.setFechaPedido(new Date());
		p.getListaItem().add(new Item("Pedido 1 Prueba Listas", 20));
		p.getListaItem().add(new Item("Pedido 2 Prueba Listas", 10));

		session.save(p);
		session.getTransaction().commit(); 
		
		//ACABA INSERTAR
		
		//COMIENZA MOSTRAR
		
		session.beginTransaction();
		
		Pedido ped = session.get(Pedido.class, 1);
		System.out.println("Hemos recuperado pedido: "+ ped.getIdPedido() + " y fecha: " + ped.getFechaPedido());
		
		for(Item it : ped.getListaItem()) {
			System.out.println("Con los siguientes items: "+ it.getNombre() + " " + it.getCantidadPedido());
		}
		
		session.getTransaction().commit();
		
		//ACABA MOSTRAR
		
		session.close();	
		HibernateUtilities.getSessionFactory().close();
	}
	
}
