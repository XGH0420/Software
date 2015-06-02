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
	
	/* 类方法
	 *
	 */
	public Vipinformation createVipinformation(String vipNum, String phone, String vipName,
			String sex, String vipId){
		Transaction tran=session.beginTransaction();
		Vipinformation admin = new Vipinformation(vipNum, phone, vipName, sex, vipId);
		VipinformationDao.save(admin);
		tran.commit();
		
		//Hibernate中会启用缓存原理，即修改数据库的操作不会立即执行，而是每过X分钟或每存在X条待执行操作时执行一次
		//所以若需要立即查看数据库进行校对，或下文用到了数据库操作后的实例，则使用flush语句刷新
		session.flush();
		return admin;
	}
	public void deleteVipinformation(String vipNum){
		Transaction tran=session.beginTransaction();
		Vipinformation vip=VipinformationDao.findById(vipNum);
		VipinformationDao.delete(vip);
		tran.commit();
		
		//Hibernate中会启用缓存原理，即修改数据库的操作不会立即执行，而是每过X分钟或每存在X条待执行操作时执行一次
		//所以若需要立即查看数据库进行校对，或下文用到了数据库操作后的实例，则使用flush语句刷新
		session.flush();
		
	}
	public Vipinformation findVipinformation(String vipNum){
		Transaction tran=session.beginTransaction();
		Vipinformation vip=VipinformationDao.findById(vipNum);
		tran.commit();
		
		//Hibernate中会启用缓存原理，即修改数据库的操作不会立即执行，而是每过X分钟或每存在X条待执行操作时执行一次
		//所以若需要立即查看数据库进行校对，或下文用到了数据库操作后的实例，则使用flush语句刷新
		session.flush();
		return vip;
	}
	public List findAllVipinformation(){
		Transaction tran=session.beginTransaction();
		List vip=VipinformationDao.findAll();
		tran.commit();
		
		//Hibernate中会启用缓存原理，即修改数据库的操作不会立即执行，而是每过X分钟或每存在X条待执行操作时执行一次
		//所以若需要立即查看数据库进行校对，或下文用到了数据库操作后的实例，则使用flush语句刷新
		session.flush();
		return vip;
	}
	public Vipinformation mergeVipinformation(String vipNum, String phone, String vipName,
			String sex, String vipId){
		Transaction tran=session.beginTransaction();
		Vipinformation admin = new Vipinformation(vipNum, phone, vipName, sex, vipId);
		VipinformationDao.merge(admin);
		tran.commit();
		
		//Hibernate中会启用缓存原理，即修改数据库的操作不会立即执行，而是每过X分钟或每存在X条待执行操作时执行一次
		//所以若需要立即查看数据库进行校对，或下文用到了数据库操作后的实例，则使用flush语句刷新
		session.flush();
		return admin;
	}
}
