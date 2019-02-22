package ashedblack.com.user.member.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ashedblack.com.user.member.vo.UserMemberVO;

@Repository
public class UserMemberDAOImpl implements UserMemberDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void UserMemberInsert(UserMemberVO vo) {
		 sqlSession.insert("user.UserMemberInsert",vo);
	}
}
