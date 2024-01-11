package com.demo.test;

//Two classes with two separate tables (one to one)

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;


public class TestMyUserAddress {

	public static void main(String[] args) {
		Address addr=new Address(1,"Nigdi","Pune");
		Address addr1=new Address(2,"Chinchwad","Pune");
		MyUser u1=new MyUser(10,"Vishal",addr);
		MyUser u2=new MyUser(11,"Amar",addr1);
		
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(addr);
		sess.save(addr1);
		sess.save(u1);
		sess.save(u2);
		
		tr.commit();
//		sess.close();
	}

}
