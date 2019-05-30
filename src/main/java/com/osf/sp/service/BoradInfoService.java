package com.osf.sp.service;

import java.util.List;

import com.osf.sp.vo.BoardInfoVO;

public interface BoradInfoService {
	List<BoardInfoVO> selectBoradInfoList();
	int insertBoardInfo(BoardInfoVO bi);
	int updateBoardInfo(BoardInfoVO bi);
	List<BoardInfoVO> selectBoradInfoByNum(BoardInfoVO bi);
}
