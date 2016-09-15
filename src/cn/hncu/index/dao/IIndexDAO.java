package cn.hncu.index.dao;

import java.util.List;
import cn.hncu.domain.clothing.Clothing;
import cn.hncu.domain.clothing.Types;
import cn.hncu.domain.users.Users;
/**
 * dao层的接口
 * 写了对大众化服装，管理员推荐的服装，所有分类进行查询以及查询针对用户个性化推荐的服装的接口
 * @author 陈浩翔
 * 2016-9-11
 */
public interface IIndexDAO {
	/**
	 * @return 返回20种大众化推荐的服装
	 */
	public List<Clothing> findMassesRecommendClothing();
	
	/**
	 * @return 返回20种管理员推荐的服装
	 */
	public List<Clothing> findAdminRecommendClothing();
	
	/**
	 * @return 返回20种针对用户个性化推荐的服装
	 */
	public List<Clothing> findUsersClothing(Users user);
	
	/**
	 * @return 返回所有服装的类型
	 */
	public List<Types> findAllTypes();
}
