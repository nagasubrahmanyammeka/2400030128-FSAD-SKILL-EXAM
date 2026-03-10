package com.klef.fsad.exam;

import org.hibernate.Session;

public class ClientDemo {
	public static void main(String[] args) {

		org.hibernate.cfg.Configuration conf =
				new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml");

		org.hibernate.SessionFactory sf = conf.buildSessionFactory();

		CustomerAccount c = new CustomerAccount();
		Session s = sf.openSession();

		org.hibernate.Transaction tx = s.beginTransaction();

		c.setName("Subbu");
		c.setDate("10/03/26");
		c.setDescription("A Student");
		c.setLocation("Vijayawada");
		c.setStatus("Selected");

		s.persist(c);

		tx.commit();
		s.close();

		// Second session
		Session s1 = sf.openSession();
		org.hibernate.Transaction tx1 = s1.beginTransaction();

		CustomerAccount c1 = s1.find(CustomerAccount.class, 1);
		c1.setName("Subrahmanyam");

		tx1.commit();
		s1.close();

		sf.close();
	}
}