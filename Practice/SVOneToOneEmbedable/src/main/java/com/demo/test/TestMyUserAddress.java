package com.demo.test;

//Two classes with single table (one to one)

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;


public class TestMyUserAddress {

	public static void main(String[] args) {
		Address addr=new Address(1,"Wakad","Pune");
		Address addr1=new Address(2,"Baner","Pune");
		MyUser u1=new MyUser(10,"Kishor",addr);
		MyUser u2=new MyUser(20,"Kiran",addr1);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(u1);
		sess.save(u2);
		
		tr.commit();
//		sess.close();
		

	}

}
