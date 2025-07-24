package com.Purushoth.SpringXMLBasedConfig;

public class Student {
	public Student() {
		System.out.println("Stdent");
	}
	private int rno;
	private String name;
	private Writter writter;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Writter getWritter() {
		return writter;
	}
	public void setWritter(Writter writter) {
		this.writter = writter;
	}
	
	public void code() {
		System.out.println("Name : " +name+" Rno : "+rno);
		writter.write();
	}
	

}
