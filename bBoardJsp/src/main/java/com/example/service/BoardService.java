package com.example.service;

import java.util.List;

import com.example.domain.BoardVO;

public interface BoardService {
	
	// 게시글 목록
	List<BoardVO> getBoardList(BoardVO vo);

	// 상세보기
	BoardVO getBoard(BoardVO vo);
	
	// 글 수정
	void updateBoard(BoardVO vo);

	// 글 삭제
	void deleteBoard(BoardVO vo);

	// 글 등록
	void saveBoard(BoardVO vo);
	
}
