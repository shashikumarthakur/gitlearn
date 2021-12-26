package com.xylem.rajesh;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public static void main(String[] args) {
		OfficeStaf os=null;
		Employee e=null;
		Person p=null;
		Skill sk=null;
		sk=new Skill(new String[] {"JAVA","Python"});
		Hobbies hb=null;
		hb=new Hobbies(new String[] {"Reading","Sleeping"});
		
		List<Skill> skills=null;
		skills=new ArrayList<Skill>();
		skills.add(sk);
		
		List<Hobbies> hobbie=null;
		hobbie=new ArrayList<Hobbies>();
		hobbie.add(hb);
		
		p=new Person();
		p.setId(50420);
		p.setName("Rajesh");
		p.setPhoneNo(9078634173l);
		p.setHobbies(hobbie);
		p.setSkills(skills);
		
		e=new Employee();
		e.setEid(101);
		e.setHeadPhone("Sony");
		e.setLaptopModel("Dell");
		e.setOffice("Xylem");
		e.setRole("Software Developer");
		e.setP(p);
		
		System.out.println(e);
		
		
		
		
	}
}
