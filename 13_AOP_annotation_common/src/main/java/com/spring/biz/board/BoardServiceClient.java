package com.spring.biz.board;

import java.util.List;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.spring.biz.board.impl.BoardServiceImpl;

public class BoardServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------ 스프링 컨테이너 구동 전 ------");
		//1. 스프링 컨테이너 구동(스프링 설정 파일 읽어서)
		// 파일만 main/java와 main/resource로 분리해 놓은 것 결국 Class 파일 있는 위치에
		GenericXmlApplicationContext container
			= new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("------ 스프링 컨테이너 구동 후 ------");
		BoardService boardService = (BoardService) container.getBean("boardService");
		
		BoardVO vo = new BoardVO();
		vo.setTitle("테스트-spring");
		vo.setWriter("홍길동-spring");
		vo.setContent("테스트내용-spring");
		
		try {			
			boardService.insertBoard(vo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		List<BoardVO> list = boardService.getBoardList();
		for (BoardVO board : list) {
			System.out.println(board);
		}
		
		System.out.println("------ 스프링 컨테이너 사용 후 종료 ------");
		
		//3. 스프링 컨테이너 종료(close)
		container.close();
		
	}

}
