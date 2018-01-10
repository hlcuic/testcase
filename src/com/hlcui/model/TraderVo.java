package com.hlcui.model;

public class TraderVo {
	
	private int id;
	
	private String name;
	
	public TraderVo(){
		
	}

	public TraderVo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TraderVo [id=" + id + ", name=" + name + "]";
	}

}
