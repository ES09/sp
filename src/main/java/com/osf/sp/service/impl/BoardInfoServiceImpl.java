package com.osf.sp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.osf.sp.mapper.BoradInfoMapper;
import com.osf.sp.service.BoradInfoService;
import com.osf.sp.vo.BoardInfoVO;
@Service
public class BoardInfoServiceImpl implements BoradInfoService {
	@Resource
	private BoradInfoMapper bim;
	@Override
	public List<BoardInfoVO> selectBoradInfoList() {
		return bim.selectBoradInfoList();
	}
	@Override
	public int insertBoardInfo(BoardInfoVO bi) {
		return bim.insertBoardInfo(bi);
	}
	@Override
	public int updateBoardInfo(BoardInfoVO bi) {
		return bim.updateBoardInfo(bi);
	}
	@Override
	public List<BoardInfoVO> selectBoradInfoByNum(BoardInfoVO bi) {
		return bim.selectBoradInfoByNum(bi);
	}

}
