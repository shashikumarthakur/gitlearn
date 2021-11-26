package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainControllerImpl;
import com.nt.vo.CustomerVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		String cname=null,cadd=null,pamt=null,rate=null,time=null;
		String result=null;
		Scanner sc=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		CustomerVO vo=null;
		MainControllerImpl controller=null;
		sc=new Scanner(System.in);
		System.out.print("Enter Customer Name : ");
		cname=sc.nextLine();
		System.out.print("Enter Customer Address : ");
		cadd=sc.nextLine();
		System.out.print("Enter Ammont : ");
		pamt=sc.next();
		System.out.print("Enter Customer Rate : ");
		rate=sc.next();
		System.out.print("Enter Customer Time : ");
		time=sc.next();
		vo=new CustomerVO();
		vo.setCname(cname);
		vo.setCadd(cadd);
		vo.setPamt(pamt);
		vo.setRate(rate);
		vo.setTime(time);
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		controller=factory.getBean("ctrl", MainControllerImpl.class);
		
		try {
			result=controller.ProccessCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}

}
