package com.demo.model;


//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="User123")
public class MyUser {
	@Id
	private int uid;
	private String name;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Addrid")
	private Address addr;
	public MyUser() {
		super();
	}
	public MyUser(int uid, String name, Address addr) {
		super();
		this.uid = uid;
		this.name = name;
		this.addr = addr;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", name=" + name + ", addr=" + addr + "]";
	}
	

}
