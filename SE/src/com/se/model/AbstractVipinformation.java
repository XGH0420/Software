package com.se.model;

/**
 * AbstractVipinformation entity provides the base persistence definition of the
 * Vipinformation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVipinformation implements java.io.Serializable {

	// Fields

	private String vipNum;
	private String phone;
	private String vipName;
	private String sex;
	private String vipId;

	// Constructors

	/** default constructor */
	public AbstractVipinformation() {
	}

	/** full constructor */
	public AbstractVipinformation(String vipNum, String phone, String vipName,
			String sex, String vipId) {
		this.vipNum = vipNum;
		this.phone = phone;
		this.vipName = vipName;
		this.sex = sex;
		this.vipId = vipId;
	}

	// Property accessors

	public String getVipNum() {
		return this.vipNum;
	}

	public void setVipNum(String vipNum) {
		this.vipNum = vipNum;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getVipName() {
		return this.vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getVipId() {
		return this.vipId;
	}

	public void setVipId(String vipId) {
		this.vipId = vipId;
	}

}