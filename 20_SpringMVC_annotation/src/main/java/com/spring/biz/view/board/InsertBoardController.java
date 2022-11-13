package com.spring.biz.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;

@Controller
public class InsertBoardController {
	
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO dao) {
		//Spring에 의해 BoardVO vo에 요청url의 파라미터들 의존주입되고 있는 것
		System.out.println(">> 게시글 입력");
		System.out.println("vo: " + vo);
		dao.insertBoard(vo);		
		return "getBoardList.do";
	}
}	

	/*
		@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
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
		
		//3. 화면 네비게이션 (페이지 전환)
		ModelAndView mav = new ModelAndView();
		mav.setViewName("getBoardList.do");
		
		return mav;
	}
	 */

