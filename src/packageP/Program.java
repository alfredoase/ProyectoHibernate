package packageP;

import java.util.Date;

import org.hibernate.Session;

public class Program {
		
	public static void main(String[] args) {
		System.out.println("COMIENZA PROGRAMA");
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		System.out.println("EMPIEZA INSERTAR AQUI: ");
		System.out.println(" ");
		//COMIENZA INSERTAR
		session.beginTransaction();
		
		Pedido p = new Pedido();
		
		p.setFechaPedido(new Date());
		p.addItem(new Item("Pedido 1 Prueba Listas", 20));
		p.addItem(new Item("Pedido 2 Prueba Listas", 10));
		
		Empresa e = new Empresa();
		e.setCIF("QWE");
		e.setNombre("Empresa 6c");
		e.setEmpleados(6);
		
		e.addPedido(p);
		
		e.setDireccion(new Direccion("Calle R", "Pueblo", 46325, e.getIdEmpresa(), e));

		session.save(e);
		session.getTransaction().commit(); 
		
		System.out.println("ACABA INSERTAR AQUI");
		System.out.println("--------------------");
		//ACABA INSERTAR
		
		//COMIENZA MOSTRAR
		System.out.println("COMIENZA: MOSTRAR AQUI: ");
		System.out.println(" ");
		
		session.beginTransaction();
		
		Empresa ped = session.get(Empresa.class, 1);
		System.out.println("Hemos recuperado pedido: "+ ped.getCIF() + " y fecha: " + ped.getNombre());
		
		for(Pedido it : ped.getListaPedido()) {
			System.out.println("Con los siguientes items: "+ it.getFechaPedido());
		}
		
		session.getTransaction().commit();
		
		System.out.println("ACABA MOSTRAR AQUI");
		System.out.println("--------------------");
		//ACABA MOSTRAR
		
		session.close();	
		HibernateUtilities.getSessionFactory().close();
	}
	
}
