package com.spring.biz.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.biz.board.BoardVO;
import com.spring.biz.board.impl.BoardDAO;

@Controller
public class DeleteBoardController {

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard (BoardVO vo, BoardDAO dao) {
		System.out.println(">> 게시글 삭제");
		dao.deleteBoard(vo);
		//3. 페이지 전환 (목록 페이지 이동)
		return "getBoardList.do";	
	}
}
