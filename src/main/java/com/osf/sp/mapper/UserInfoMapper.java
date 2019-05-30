package com.osf.sp.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.osf.sp.vo.UserInfoVO;

@MapperScan
public interface UserInfoMapper {
	public int insertUserInfo(UserInfoVO ui);
	public List<UserInfoVO> selectUserIofoList();
	public List<UserInfoVO> selectUserIofo(UserInfoVO ui);
	public int deleteUserIofo(int uiNo);
	public int updateUserInfo(UserInfoVO ui);
	public UserInfoVO selectUserInfoByLogin(UserInfoVO ui);
}
