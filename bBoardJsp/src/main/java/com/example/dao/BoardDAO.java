package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.BoardVO;

@Mapper
public interface BoardDAO {
	// 목록
	public List<BoardVO> getBoardList(BoardVO vo);

	// 상세조회
	public BoardVO getBoard(BoardVO vo);
	
	// 글 입력
	public void saveBoard(BoardVO vo);
	
	// 글 수정
	public void updateBoard(BoardVO vo) ;

	// 글 삭제
	public void deleteBoard(BoardVO vo);
}


/* 기본적인 구조라면, 인터페이스를 구현한 클래스 BoardDAOImpl.java가 필요함
 * 그 클래스에 @Repository를 지정했어야 함 
 * 하지만 여기선 바로 매퍼랑 연결해버리겠다!
 */
