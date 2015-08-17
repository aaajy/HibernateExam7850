package com.hand.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.bean.Address;
import com.hand.bean.Customer;
import com.hand.dao.AddressDao;
import com.hand.dao.CustomerDao;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = 
			      new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AddressDao adddao=(AddressDao) context.getBean("addressdao");
		CustomerDao cusdao=(CustomerDao) context.getBean("customerdao");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入FirstName(first_name):");
		String firstname=sc.nextLine();
		System.out.println("请输入LastName(last_name):");
		String lastname=sc.nextLine();
		System.out.println("请输入Email(email):");
		String email=sc.nextLine();
		System.out.println("请输入AddressID:");
		short addressid=sc.nextShort();
		Address add=null;
		while((add=adddao.getAddressById(addressid))==null){
			System.out.println("你输入的AddressID不存在，请重新输入：");
			addressid=sc.nextShort();
		}
		Timestamp time=new Timestamp(new Date().getTime());
		Customer cus=new Customer((byte) 1,firstname,lastname,email,addressid,time);
		short customid=cusdao.save(cus);
		cus=cusdao.getCustomerById(customid);
		System.out.println("已经保存的数据如下:");
		System.out.println("ID:"+cus.getId());
		System.out.println("FirstName:"+cus.getFirstname());
		System.out.println("LastName:"+cus.getLastname());
		System.out.println("Email:"+cus.getEmail());
		System.out.println("Address:"+add.getAddress());
		System.out.println();
		System.out.println("请输入你要删除的CustomerID:");
		customid=sc.nextShort();
		while((cus=cusdao.getCustomerById(customid))==null){
			System.out.println("你输入的CustomerID不存在，请重新输入：");
			customid=sc.nextShort();
		}
		cusdao.deleteCustomer(cus);
		System.out.println("你输入的ID为"+customid+"的Customer已经删除.");
	}
}
