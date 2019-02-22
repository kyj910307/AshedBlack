package ashedblack.com.user.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import ashedblack.com.user.member.service.UserMemberService;
import ashedblack.com.user.member.vo.UserMemberVO;

@Controller
public class UserMemberController {
	
	// 의존성 주입
	@Autowired
	private UserMemberService userService;
	
	@RequestMapping("user/member/insert.do")
	public String UserMemberInsert(@ModelAttribute UserMemberVO vo){
		userService.UserMemberInsert(vo);
		return "redirect:/user/member/login.do";
	}
}
