package com.xylem.rajesh;

import java.util.ArrayList;
import java.util.List;

public class Person2 {
	int id;
	String name;
	List<Skill> skills;
	List<Hobbies>hobbies;
	long phoneNo;
	public static void main(String[] args) {
		Skill sk,sk2=null;
		sk=new Skill(new String[] {"JAVA","Python","JavaScript"});
	List<Skill> l=new ArrayList<Skill>();
	l.add(sk);
	
	Hobbies hobbie=null;
	hobbie=new Hobbies(new String[]{"Bike Riding","Playing PUBG","Reading"});
	
	List<Hobbies> hob=new ArrayList<Hobbies>();
	hob.add(hobbie);
	

	
	System.out.println(l);
	System.out.println(hob);
	}
}
