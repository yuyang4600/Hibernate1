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
		 * 删除
		 */
		Session session = MySessionFactory.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = (Employee)session.load(Employee.class, 2);
		session.delete(emp);
		transaction.commit();
		session.close();
	}
	/**
	 * 修改
	 */
	public static void updateEmployee() {
		Session session = MySessionFactory.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		/*
		 * load是通过主键属性获取对象示例，返回的是一个对象
		 */
		Employee emp = (Employee)session.load(Employee.class, 2);
		emp.setName("mk");
		transaction.commit();
		session.close();
	}
	/**
	 * 添加
	 */
	public static void addEmployee() {
		/*
		 * configure有参数读取参数，无参数默认读取hibernate.cfg.xml文件
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
