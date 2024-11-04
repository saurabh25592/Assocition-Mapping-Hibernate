package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;

public class MappingMain {

	public static void main(String[] args) {

		//It is Configuration class 
		//it is configure the 
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Laptop l = new Laptop();
		l.setL_id(1202);
		l.setL_model("Dell");

		ss.persist(l);

		Student s = new Student();
		s.setId(3);
		s.setName("varad");
		s.setLaptop(l);

		ss.persist(s);
		System.out.println("mapping is completed.....");
		tr.commit();

	}

}
