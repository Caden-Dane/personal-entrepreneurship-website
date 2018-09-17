package com.xbj.website.service;

import com.xbj.website.model.User;

public interface UserService {

	
	/** 
	 * @Description: 
	 * @Title: findUserById 
	 *<ul>
	 *<li>@param id
	 *<li>@return</li>
	 * </ul>
	 * @return User    返回类型 
	 * @author binjie.xu
	 * @throws 
	 * @time 2018年9月3日 下午5:30:30 
	 */
	User findUserById(Long id); 
	
	
	
	/** 
	 * @Description: 
	 * @Title: findUserByNickName 
	 *<ul>
	 *<li>@param nickName
	 *<li>@return</li>
	 * </ul>
	 * @return User    返回类型 
	 * @author binjie.xu
	 * @throws 
	 * @time 2018年9月4日 上午9:53:03 
	 */
	User findUserByNickName(String nickName);
}
