package com.osf.sp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.osf.sp.auth.MakeJWT;
import com.osf.sp.auth.SHAEncoder;
import com.osf.sp.mapper.UserInfoMapper;
import com.osf.sp.service.UserInfoService;
import com.osf.sp.vo.ParamVO;
import com.osf.sp.vo.UserInfoVO;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Resource
	private UserInfoMapper uim;
	@Resource
	private MakeJWT mjwt;
	
	@Override
	public int insertUserInfo(UserInfoVO ui) {
		String alterPwd = SHAEncoder.encode(ui.getUiPwd());
		ui.setUiPwd(alterPwd);
		return uim.insertUserInfo(ui);
	}
	
	public List<UserInfoVO> selectUserIofoList(){
		return uim.selectUserIofoList();
	}
	
	@Override
	public List<UserInfoVO> selectUserIofo(UserInfoVO ui) {
		return uim.selectUserIofo(ui);
	}
	
	@Override
	public int save(ParamVO params) {
		int cnt=0;
		int recnt = 0;
		if(params.getDelUiNos()!=null) {
			List<Integer> uiNos=params.getDelUiNos();
			for(int uiNo :uiNos) {
				recnt ++;
				cnt += deleteUserIofo(uiNo);
			}
		}
		if(params.getAddUis() !=null) {
			List<UserInfoVO> uis=params.getAddUis();
			for(UserInfoVO ui:uis) {
				recnt ++;
				cnt +=insertUserInfo(ui);
			}
		}
		if(params.getUpdataUis() !=null) {
			List<UserInfoVO> uis=params.getUpdataUis();
			for(UserInfoVO ui:uis) {
				recnt ++;
				cnt +=updateUserInfo(ui);
			}
		}
		if(recnt != cnt) {
			return 0;
		}
		return cnt;
	}
	
	@Override
	public int deleteUserIofo(int uiNo) {
		return uim.deleteUserIofo(uiNo);
	}
	
	@Override
	public int updateUserInfo(UserInfoVO ui) {
		return uim.updateUserInfo(ui);
	}
	
	@Override
	public UserInfoVO selectUserInfoByLogin(UserInfoVO ui) {
		String pwd = SHAEncoder.encode(ui.getUiPwd());
		ui.setUiPwd(pwd);
		UserInfoVO uivo = uim.selectUserInfoByLogin(ui);
		if(uivo!=null) {
			uivo.setTokken(mjwt.makeJWT(uivo));
		}
		return uivo;
	}

}
