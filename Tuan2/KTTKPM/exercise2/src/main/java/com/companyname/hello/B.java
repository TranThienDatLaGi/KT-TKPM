package com.companyname.hello;
/**
 * @author Thien Dat
 * 
 *
 */
public class B {
	private long id;
	private String name;

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "B [id=" + id + ", name=" + name + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		//Set id
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
