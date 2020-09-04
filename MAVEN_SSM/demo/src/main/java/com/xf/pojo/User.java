package com.xf.pojo;

public class User {
	private Integer uid;
	private String username;
	private Integer roleid;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", roleid=" + roleid + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String username, Integer roleid) {
		super();
		this.uid = uid;
		this.username = username;
		this.roleid = roleid;
	}
}
