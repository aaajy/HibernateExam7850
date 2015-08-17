package com.hand.common;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import com.hand.bean.Customer;

public class MyInterceptor extends EmptyInterceptor{

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) {
		if ( entity instanceof Customer ) {
	          System.out.println("Before Save");
	          return true; 
	       }
	       return false;
	}
	
}
