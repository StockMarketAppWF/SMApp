package com.springbootstarter;

public class Sector {
	private String id,sector,desc;
	public Sector() {
	}
	public Sector(String id,String sector, String desc) {
		super();
		this.id=id;
		this.sector = sector;
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Sector [id=" + id + ", sector=" + sector + ", desc=" + desc + "]";
	}
	
}
