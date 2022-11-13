package com.spring.biz.board;

import java.util.List;

import com.spring.biz.board.impl.BoardDAO;

public class BoardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("테스트2");
		vo.setWriter("홍길동2");
		vo.setContent("테스트2-내용");
		
		dao.insertBoard(vo);
		
		//수정
		vo.setTitle("테스트2-수정");
		vo.setContent("테스트2-내용-수정");
		vo.setSeq(2);
		
		//dao.updateBoard(vo);
		
		//삭제
		//dao.deleteBoard(vo);
		
		//게시글 1 개 조회
		vo = new BoardVO();
		vo.setSeq(1);
		BoardVO board = dao.getBoard(vo);
		System.out.println("게시글 한 개 조회 : " + board);
		
		List<BoardVO> list = dao.getBoardList();
		System.out.println("list: " + list);
		for (BoardVO voo : list) {
			System.out.println(voo);
		}

	}

}
