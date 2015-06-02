package com.se.contral;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.se.dao.VipinformationDAO;
import com.se.factory.HibernateSessionFactory;
import com.se.model.Vipinformation;

public class VipinformationContral {
	private static VipinformationContral control = null; 
	public static VipinformationContral getVipinformationContral(){
		if(null==control){
			control = new VipinformationContral();
		}
		return control;
	}
	
	/* AdminDAO
	 * AdminlevelDAO
	 * HibernateSession
	 */
	private VipinformationDAO VipinformationDao = null;
	private Session session = null;
	private VipinformationContral(){
		VipinformationDao = new VipinformationDAO();
		
		session = HibernateSessionFactory.getSession();
	}
	
	/* �෽��
	 *
	 */
	public Vipinformation createVipinformation(String vipNum, String phone, String vipName,
			String sex, String vipId){
		Transaction tran=session.beginTransaction();
		Vipinformation admin = new Vipinformation(vipNum, phone, vipName, sex, vipId);
		VipinformationDao.save(admin);
		tran.commit();
		
		//Hibernate�л����û���ԭ�����޸����ݿ�Ĳ�����������ִ�У�����ÿ��X���ӻ�ÿ����X����ִ�в���ʱִ��һ��
		//��������Ҫ�����鿴���ݿ����У�ԣ��������õ������ݿ�������ʵ������ʹ��flush���ˢ��
		session.flush();
		return admin;
	}
	public void deleteVipinformation(String vipNum){
		Transaction tran=session.beginTransaction();
		Vipinformation vip=VipinformationDao.findById(vipNum);
		VipinformationDao.delete(vip);
		tran.commit();
		
		//Hibernate�л����û���ԭ�����޸����ݿ�Ĳ�����������ִ�У�����ÿ��X���ӻ�ÿ����X����ִ�в���ʱִ��һ��
		//��������Ҫ�����鿴���ݿ����У�ԣ��������õ������ݿ�������ʵ������ʹ��flush���ˢ��
		session.flush();
		
	}
	public Vipinformation findVipinformation(String vipNum){
		Transaction tran=session.beginTransaction();
		Vipinformation vip=VipinformationDao.findById(vipNum);
		tran.commit();
		
		//Hibernate�л����û���ԭ�����޸����ݿ�Ĳ�����������ִ�У�����ÿ��X���ӻ�ÿ����X����ִ�в���ʱִ��һ��
		//��������Ҫ�����鿴���ݿ����У�ԣ��������õ������ݿ�������ʵ������ʹ��flush���ˢ��
		session.flush();
		return vip;
	}
	public List findAllVipinformation(){
		Transaction tran=session.beginTransaction();
		List vip=VipinformationDao.findAll();
		tran.commit();
		
		//Hibernate�л����û���ԭ�����޸����ݿ�Ĳ�����������ִ�У�����ÿ��X���ӻ�ÿ����X����ִ�в���ʱִ��һ��
		//��������Ҫ�����鿴���ݿ����У�ԣ��������õ������ݿ�������ʵ������ʹ��flush���ˢ��
		session.flush();
		return vip;
	}
	public Vipinformation mergeVipinformation(String vipNum, String phone, String vipName,
			String sex, String vipId){
		Transaction tran=session.beginTransaction();
		Vipinformation admin = new Vipinformation(vipNum, phone, vipName, sex, vipId);
		VipinformationDao.merge(admin);
		tran.commit();
		
		//Hibernate�л����û���ԭ�����޸����ݿ�Ĳ�����������ִ�У�����ÿ��X���ӻ�ÿ����X����ִ�в���ʱִ��һ��
		//��������Ҫ�����鿴���ݿ����У�ԣ��������õ������ݿ�������ʵ������ʹ��flush���ˢ��
		session.flush();
		return admin;
	}
}
