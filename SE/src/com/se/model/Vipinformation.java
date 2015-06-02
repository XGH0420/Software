package com.se.model;

/**
 * Vipinformation entity. @author MyEclipse Persistence Tools
 */
public class Vipinformation extends AbstractVipinformation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Vipinformation() {
	}

	/** full constructor */
	public Vipinformation(String vipNum, String phone, String vipName,
			String sex, String vipId) {
		super(vipNum, phone, vipName, sex, vipId);
	}

}
