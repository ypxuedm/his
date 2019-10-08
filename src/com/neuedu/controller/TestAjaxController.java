package com.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.neuedu.model.bean.UserInfo;
import com.neuedu.model.service.UserInfoService;

@Controller
public class TestAjaxController {
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping("testAjax")
	@ResponseBody
	public List<UserInfo> selectUser(String username){
		System.out.println("================"+username);
		List<UserInfo> list = userInfoService.selectUser();
		return list;
	}
	
}