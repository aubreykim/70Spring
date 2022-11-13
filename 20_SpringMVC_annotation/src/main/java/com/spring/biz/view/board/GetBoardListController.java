package com.spring.biz.view.board;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;

@Controller
public class GetBoardListController {

	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardDAO boardDAO, ModelAndView mav) {	
		System.out.println(">> 게시글 목록 보여주기");
		//1. 게시글 목록 조회 (SELECT)
		List<BoardVO> list = boardDAO.getBoardList();
		//3. 목록 화면 이동
		//mav.addObject(boardList); //왜 안 되는지 모르겠음
		mav.addObject("boardList", list); //Model에  데이터 저장
		mav.setViewName("getBoardList.jsp"); //ViewResolver 안 쓰고 있어서		
		return mav;	
	}

}
