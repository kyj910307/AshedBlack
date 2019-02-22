package ashedblack.com.user.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ashedblack.com.user.member.dao.UserMemberDAO;
import ashedblack.com.user.member.vo.UserMemberVO;

@Service
public class UserMemberServiceImpl implements UserMemberService {
	@Autowired
	UserMemberDAO userdao;
	
	@Override
	public void UserMemberInsert(UserMemberVO vo) {
		userdao.UserMemberInsert(vo);
	}

}
