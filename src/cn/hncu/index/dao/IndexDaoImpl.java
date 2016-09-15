package cn.hncu.index.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import sun.net.www.content.audio.basic;

import cn.hncu.domain.clothing.Clothing;
import cn.hncu.domain.clothing.Types;
import cn.hncu.domain.users.Users;
import cn.hncu.utils.C3p0Pool;
import cn.hncu.utils.QueryRunner;

public class IndexDaoImpl implements IIndexDAO {
	@Override
	public List<Clothing> findMassesRecommendClothing() {
		List<Clothing> lists = new ArrayList<Clothing>();

		// TODO Auto-generated method stub
		return lists;
	}

	@Override
	public List<Clothing> findAdminRecommendClothing() {
		List<Clothing> lists = new ArrayList<Clothing>();
		// TODO Auto-generated method stub
		return lists;
	}

	@Override
	public List<Clothing> findUsersClothing(Users user) {
		List<Clothing> lists = new ArrayList<Clothing>();
		// TODO Auto-generated method stub
		return lists;
	}
	
	
	//查询所有的服装类型
	@Override
	public List<Types> findAllTypes() {
		List<Types> lists = new ArrayList<Types>();
		String sql = "select id,name,parentId,grade from types";
		QueryRunner run = new QueryRunner(C3p0Pool.getDataSource());
		lists = run.query(sql,new BeanListHandler<Types>(Types.class));
		return lists;
	}

}
