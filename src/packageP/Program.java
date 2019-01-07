package packageP;

import java.sql.Timestamp;

import org.hibernate.Session;

public class Program {
		
	public static void main(String[] args) {
		System.out.println("Hola");
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Pedido p = new Pedido();
		p.setFechaPedido("23-34-2019");

		
		session.save(p);
		
		session.getTransaction().commit(); 
		
		/*
		session.beginTransaction();
		
		
		Empresa u = session.get(Empresa.class, "AFG");
		System.out.println("Hemos recuperado empresa: "+u.getNombre()+" "+u.getCIF());
		
		session.getTransaction().commit();*/
		
		session.close();	
		
		HibernateUtilities.getSessionFactory().close();
	}
	
}
