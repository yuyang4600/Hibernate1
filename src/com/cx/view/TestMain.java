package com.cx.view;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cx.domain.Employee;
import com.cx.util.MySessionFactory;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	public static void deleteEmployee() {
		/**
		 * ɾ��
		 */
		Session session = MySessionFactory.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = (Employee)session.load(Employee.class, 2);
		session.delete(emp);
		transaction.commit();
		session.close();
	}
	/**
	 * �޸�
	 */
	public static void updateEmployee() {
		Session session = MySessionFactory.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		/*
		 * load��ͨ���������Ի�ȡ����ʾ�������ص���һ������
		 */
		Employee emp = (Employee)session.load(Employee.class, 2);
		emp.setName("mk");
		transaction.commit();
		session.close();
	}
	/**
	 * ���
	 */
	public static void addEmployee() {
		/*
		 * configure�в�����ȡ�������޲���Ĭ�϶�ȡhibernate.cfg.xml�ļ�
		 */
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setName("cx");
		employee.setEmail("1635512074@qq.com");
		employee.setHiredate(new Date());
		
		session.save(employee);
		
		transaction.commit();
		
		session.close();
	}

}
