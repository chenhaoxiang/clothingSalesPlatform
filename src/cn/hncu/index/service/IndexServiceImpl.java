package cn.hncu.index.service;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.hncu.domain.clothing.Clothing;
import cn.hncu.domain.clothing.Types;
import cn.hncu.domain.users.Users;
import cn.hncu.index.dao.IIndexDAO;
import cn.hncu.utils.C3p0Pool;
import cn.hncu.utils.QueryRunner;

/**
 * service层的实现类
 * @author 陈浩翔
 * 2016-9-11
 */
public class IndexServiceImpl implements IIndexService{
	
	//依赖注入
	private IIndexDAO dao;
	public IIndexDAO getDao() {
		return dao;
	}
	public void setDao(IIndexDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Clothing> findMassesRecommendClothing() {
		return dao.findMassesRecommendClothing();
	}

	@Override
	public List<Clothing> findAdminRecommendClothing() {
		return dao.findAdminRecommendClothing();
	}

	@Override
	public List<Clothing> findUsersClothing(Users user) {
		return dao.findUsersClothing(user);
	}
	
	
	@Override
	public List<Types> findAllTypes() {
		return dao.findAllTypes();
	}
	
}
