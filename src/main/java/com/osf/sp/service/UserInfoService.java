package com.osf.sp.service;

import java.util.List;

import com.osf.sp.vo.ParamVO;
import com.osf.sp.vo.UserInfoVO;

public interface UserInfoService {
	int insertUserInfo(UserInfoVO ui);
	public List<UserInfoVO> selectUserIofoList();
	public List<UserInfoVO> selectUserIofo(UserInfoVO ui);
	public int deleteUserIofo(int uiNo);
	int save(ParamVO params);
	public int updateUserInfo(UserInfoVO ui);
	public UserInfoVO selectUserInfoByLogin(UserInfoVO ui);

}
