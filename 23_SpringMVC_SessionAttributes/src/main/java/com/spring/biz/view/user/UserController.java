package com.spring.biz.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.biz.user.UserVO;
import com.spring.biz.user.impl.UserDAO;


@Controller
public class UserController {

	/* @ModelAttribute : 모델(Model)의 속성값으로 저장 (속성명 별도 지정)
	 * 별도로 명칭부여 안 하면 <데이터타입>의 첫글자 소문자로 작성된 명칭 사용
	 * @ModelAttribute UserVO : 속성명 userVO 명칭 사용
	 * @ModelAttribute("user") UserVO : 속성명 user 명칭 사용
	 */
	
	//value가 "/login.do" 요청일 때 RequestMethod 요청 방식이 GET 방식일 때만 처리
	//@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	@GetMapping("/login.do") //4.3버전부터 사용 가능
	public String loginView(@ModelAttribute("user") UserVO vo) {
		System.out.println(">> 로그인 화면 이동 = loginView()");
		vo.setId("test");
		vo.setPassword("test");
		
		return "login.jsp";
	}
	
	//value가 "/login.do" 요청일 때 RequestMethod 요청 방식이 POST 방식일 때만 처리
	//@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	@PostMapping("/login.do") //4.3버전부터 사용 가능)
	public String login (UserVO vo, UserDAO dao) {
		System.out.println(">> 로그인 처리");
		UserVO user = dao.getUser(vo);
		
		//3. 화면 네비게이션 (화면전환, 화면이동)
		//로그인 성공: 게시글 목록 보여주기
		//로그인 실패: 로그인 화면으로 이동
		if (user != null) {
			System.out.println(">> 로그인 성공!!!");
			return "getBoardList.do";
		} else {
			System.out.println(">> 로그인 실패~~~");
			return "login.jsp";
		}	
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		System.out.println(">> 로그아웃 처리");
		//1. 세션 초기화(세션 객체 무효화)
		session.invalidate();
		return "login.jsp";
	}
}
