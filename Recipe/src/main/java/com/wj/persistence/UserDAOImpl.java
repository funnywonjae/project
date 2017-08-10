package com.wj.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wj.domain.Index_TableDTO;
import com.wj.domain.UserInfoDTO;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Inject
	private SqlSession session;
	private static String namespace = "com.wj.Mappers.UserInfoMapper";
	
	@Override
	public int userCheck(UserInfoDTO dto) throws Exception {
		return session.selectOne(namespace+".userLogin",dto);
	}
	
	@Override
	public void regist(UserInfoDTO dto) throws Exception {
		
		session.selectOne(namespace+".userRegist",dto);
		
	}
	
	
}
