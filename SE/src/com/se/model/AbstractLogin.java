package com.se.model;

/**
 * AbstractLogin entity provides the base persistence definition of the Login
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLogin implements java.io.Serializable {

	// Fields

	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public AbstractLogin() {
	}

	/** minimal constructor */
	public AbstractLogin(String username) {
		this.username = username;
	}

	/** full constructor */
	public AbstractLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}