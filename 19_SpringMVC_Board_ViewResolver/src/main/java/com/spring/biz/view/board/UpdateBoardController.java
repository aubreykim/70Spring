package com.spring.biz.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;
 
public class UpdateBoardController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(">> 게시글 입력");
		//1. 전달받은 데이터 추출(확인)
		String seq = request.getParameter("seq");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		//2. DB 연동 작업(입력)
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.valueOf(seq));
		
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO dao = new BoardDAO();
		dao.updateBoard(vo);
		
		//BoardVO board = dao.getBoard(vo);
		
		ModelAndView mav = new ModelAndView();
 		mav.addObject("seq", seq);
 		System.out.println("mav: " + mav.getModel().get("board"));
 		mav.setViewName("redirect:getBoard.do");
		//3. 페이지 전환 (목록 페이지 이동)
		return mav;

	}

}
