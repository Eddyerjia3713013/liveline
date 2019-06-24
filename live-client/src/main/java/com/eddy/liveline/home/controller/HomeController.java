/**
 * Copyright (c) 2017 Guangzhou Ourchem Infomation Consulting Co., Ltd.
 */
package com.eddy.liveline.home.controller;

import com.eddy.liveline.user.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Function: TODO. <br/>
 *
 * @author liusx
 * @date 2017年9月4日 下午6:12:51
 */
@Controller
public class HomeController {

	@Autowired
	AccountService userService;

	@RequestMapping("/index")
	public String index(Model model) throws Exception{
		return "index";
	}
	

}
