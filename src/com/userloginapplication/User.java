package com.userloginapplication;

import java.io.Serializable;

public class User implements Serializable, Comparable<User>{
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
	public static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String name;
	protected String role;
	
	public User(String[] details) {
		this.userName = details[0];
		this.password = details[1];
		this.name = details[2];
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User() {}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setUsers(User[] populateUsersFromFile) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int compareTo(User that) {
		if (this.userName.compareTo(that.userName)<0) {
			return -1;
		}else if (this.userName.equals(that.userName)){
			return 0;
		}else {
			return 1;
		}
	}

}
