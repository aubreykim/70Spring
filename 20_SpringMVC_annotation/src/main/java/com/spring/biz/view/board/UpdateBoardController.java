package com.spring.biz.view.board;

import javax.servlet.http.HttpServletResponse; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;

@Controller
public class UpdateBoardController{
	@RequestMapping("/updateBoard.do")
	public ModelAndView updateBoard(BoardVO vo, BoardDAO dao) {
		System.out.println(">> 게시글 수정");
		dao.updateBoard(vo);
		BoardVO board = dao.getBoard(vo);
		
		ModelAndView mav = new ModelAndView();
 		mav.addObject("board", board);
 		mav.setViewName("getBoard.do");
		//3. 페이지 전환 (목록 페이지 이동)
		return mav;
	}
}
