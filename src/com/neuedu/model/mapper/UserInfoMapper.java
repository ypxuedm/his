package com.neuedu.model.mapper;

import java.util.List;

import com.neuedu.model.bean.UserInfo;

public interface UserInfoMapper {
	public List<UserInfo> selectUsers();
}
