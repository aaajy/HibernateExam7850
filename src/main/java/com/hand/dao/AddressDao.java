package com.hand.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hand.bean.Address;

public class AddressDao {
	private HibernateTemplate hibernateTemplate;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	public Address getAddressById(short id){
		Address address = (Address) hibernateTemplate.get(Address.class, id);  
        return address;
	}
}
