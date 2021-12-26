package com.xylem.rajesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfficeStaffClient {

	public static void main(String[] args) {
		int eid=0;
		String office=null;
		String role=null;
		OfficeStaf os=null;
		Employee e=null;
		Person p=null;
		Skill sk=null;
		os=new OfficeStaf();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Staff ID ");
		eid=sc.nextInt();
		System.out.print("Enter Staff Role ");
		role=sc.nextLine();
		System.out.print("Enter Office ");
		office=sc.nextLine();
		sk=new Skill(new String[] {"JAVA","Python"});
		Hobbies hb=null;
		hb=new Hobbies(new String[] {"Reading","Sleeping"});

		List<Skill> skills=null;
		skills=new ArrayList<>();
		skills.add(sk);

		List<Hobbies> hobbie=null;
		hobbie=new ArrayList<>();
		hobbie.add(hb);

		p=new Person();
		p.setId(50420);
		p.setName("Rajesh");
		p.setPhoneNo(9078634173l);
		p.setHobbies(hobbie);
		p.setSkills(skills);

		os.setEid(eid);
		os.setOffice(office);
		os.setP(p);
		os.setRole(role);

		System.out.println(os);




	}
}
