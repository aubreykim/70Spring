package com.spring.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.board.BoardService;
import com.spring.biz.board.BoardVO;

// @Service : @Component 상속확장 어노테이션
//			비즈니스 로직 처리 서비스 영역에 사용
@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired //타입이 일치하는 객체(인스턴스) 주입 (DI)
	//private BoardDAO boardDAO;
	private BoardDAOSpring boardDAO;
	
	
	public BoardServiceImpl() {
		System.out.println(">> BoardServiceImpl() 객체 생성");
	}

	@Override
	public void insertBoard(BoardVO vo) {
		vo.setSeq(100);
		boardDAO.insertBoard(vo);
		boardDAO.insertBoard(vo);
		//rowMapper에는 seq 설정이 없기 때문에 setSeq() 설정
		//같은 seq로 insert 2 번 실행으로 오류 제작
		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}

}
