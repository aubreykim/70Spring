package com.spring.biz.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;


@Controller
public class BoardController {
	
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {		
		System.out.println(">> 게시글 상세 보여주기");
		BoardVO board = boardDAO.getBoard(vo);
		mav.addObject("board", board);
		mav.setViewName("getBoard.jsp");			
		//3. 페이지 전환 (상세보기 페이지)
		return mav;	
	}	
}
