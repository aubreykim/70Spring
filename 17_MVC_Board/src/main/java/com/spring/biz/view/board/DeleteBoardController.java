package com.spring.biz.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;
import com.spring.biz.view.controller.Controller;

public class DeleteBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(">> 게시글 입력");
		//1. 전달받은 데이터 추출(확인)
		String seq = request.getParameter("seq");
	
		//2. DB 연동 작업(입력)
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.valueOf(seq));

		BoardDAO dao = new BoardDAO();
		dao.deleteBoard(vo);
		
		//3. 페이지 전환 (목록 페이지 이동)
		return "getBoardList.do";
		
	}

	
}
