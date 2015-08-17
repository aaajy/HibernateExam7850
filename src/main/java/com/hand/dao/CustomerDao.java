package com.hand.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hand.bean.Customer;

public class CustomerDao {
	private HibernateTemplate hibernateTemplate;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	public Short save(Customer customer){
		return (Short) hibernateTemplate.save(customer);
	}
	public Customer getCustomerById(short id){
		Customer customer=(Customer) hibernateTemplate.get(Customer.class,id);
		return customer;
	}
	public void deleteCustomer(Customer customer){
		hibernateTemplate.delete(customer);
	}
}
