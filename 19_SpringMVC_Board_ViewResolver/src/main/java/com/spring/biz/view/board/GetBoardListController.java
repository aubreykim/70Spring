package com.spring.biz.view.board;

import java.util.List; 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;

public class GetBoardListController implements Controller {

	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println(">> 게시글 목록 보여주기");
		
		//1. 게시글 목록 조회 (SELECT)
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> list = boardDAO.getBoardList();
		System.out.println("list size" + list.size());
		//2. 검색 결과 데이터를 세션에 저장
		//화면 이동을 forwarding 할 거라면 request 처리해도 가능
		//재요청 sendRedirect 처리할 거라면 request 객체는 소멸되기 때문에 session에 저장
		//request.getSession().setAttribute("boardList", list);
		
		//3. 목록 화면 이동
		//response.sendRedirect("getBoardList.jsp");
	
		//return "getBoardList";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList", list); //Model에  데이터 저장
		//mav.addObject()는 첫글자만 소문자로 변경되어 변수명으로 처리
		mav.setViewName("getBoardList"); //View 명칭 저장 (뷰리졸버 적용)
		
		return mav;
		
	}

}
