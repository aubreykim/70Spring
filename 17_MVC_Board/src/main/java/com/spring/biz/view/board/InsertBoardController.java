package com.spring.biz.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;
import com.spring.biz.view.controller.Controller;

public class InsertBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println(">> 게시글 입력");
		//1. 전달받은 데이터 추출(확인)
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		//2. DB 연동 작업(입력)
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
	
		BoardDAO dao = new BoardDAO();
		dao.insertBoard(vo);
		
		//3. 페이지 전환 (목록 페이지 이동)
		//response.sendRedirect("getBoardList.do");
		//response.sendRedirect("getBoardList.jsp");
		//.jsp로 이동하면 과거 데이터, 즉, 새로 데이터 가져와서 처리해야 해서 .do 처리

		return "getBoardList.do";
	}

	
}
