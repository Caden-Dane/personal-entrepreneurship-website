package com.xbj.website.dao;

import com.xbj.website.model.User;

/** 
 * @Description
 * @ClassName UserDao 
 * @Title UserDao.java 
 * @Package com.xbj.website.dao
 * @author binjie.xu
 * @E-mail binjie.xu@baozun.com  
 * @version 创建时间：2018年9月3日 下午4:44:11   
 */
public interface UserDao {

	
	/** 
	 * @Description: 根据用户Id查询用户
	 * @Title: findUserById 
	 *<ul>
	 *<li>@param id
	 *<li>@return</li>
	 * </ul>
	 * @return User    返回类型 
	 * @author binjie.xu
	 * @throws 
	 * @time 2018年9月3日 下午4:48:33 
	 */
	User findUserById(Long id);
	
	
	/** 
	 * @Description: 根据用户昵称查询用户
	 * @Title: findUserByNickName 
	 *<ul>
	 *<li>@param nickName
	 *<li>@return</li>
	 * </ul>
	 * @return User    返回类型 
	 * @author binjie.xu
	 * @throws 
	 * @time 2018年9月4日 上午9:55:40 
	 */
	User findUserByNickName(String nickName);
	
}
