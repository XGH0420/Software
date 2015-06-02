package com.se.model;

/**
 * Login entity. @author MyEclipse Persistence Tools
 */
public class Login extends AbstractLogin implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Login() {
	}

	/** minimal constructor */
	public Login(String username) {
		super(username);
	}

	/** full constructor */
	public Login(String username, String password) {
		super(username, password);
	}

}
