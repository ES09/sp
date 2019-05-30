package com.osf.sp.mapper;

import java.util.List;

import com.osf.sp.vo.BoardInfoVO;

public interface BoradInfoMapper {
	List<BoardInfoVO> selectBoradInfoList();
	int insertBoardInfo(BoardInfoVO bi);
	int updateBoardInfo(BoardInfoVO bi);
	List<BoardInfoVO> selectBoradInfoByNum(BoardInfoVO bi);
}
