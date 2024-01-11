package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;

public class TestRetrieveData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		MyUser u1=sess.get(MyUser.class,10);
		System.out.println("before");
		System.out.println(u1.getName());
		System.out.println("After name");
		System.out.println(u1.getAddr());
		
	}

}
