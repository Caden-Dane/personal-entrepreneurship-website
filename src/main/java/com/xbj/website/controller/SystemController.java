package com.xbj.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @Description 主页的Controller
 * @ClassName SystemController 
 * @Title SystemController.java 
 * @Package com.xbj.website.controller
 * @author binjie.xu
 * @E-mail binjie.xu@baozun.com  
 * @version 创建时间：2018年9月4日 下午3:47:06   
 */
@Controller
public class SystemController {
	
	
	@RequestMapping(value = "main.htm", method=RequestMethod.GET)
    public String home() {
		
        return "main_JSP";  
    }
}
