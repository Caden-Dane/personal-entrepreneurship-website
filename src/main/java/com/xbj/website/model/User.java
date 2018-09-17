package com.xbj.website.model;


/** 
 * @Description
 * @ClassName User 
 * @Title User.java 
 * @Package com.xbj.website.model
 * @author binjie.xu
 * @E-mail binjie.xu@baozun.com  
 * @version 创建时间：2018年9月3日 下午4:16:19   
 */
public class User {

	private Long id;
	
	private String nickName;
	
	private String password;
	
	private String relName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRelName() {
		return relName;
	}

	public void setRelName(String relName) {
		this.relName = relName;
	}
	
	
}
