package com.wj.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.wj.domain.Index_TableDTO;
import com.wj.domain.UserInfoDTO;

@Repository
public class Index_TableDAOImpl implements Index_TableDAO{

	@Inject
	private SqlSession session;
	private static String namespace = "com.wj.Mappers.Index_TableMapper";
	
	
	@Override
	public String tableIndex(Index_TableDTO dto) throws Exception {
		return session.selectOne(namespace+".getTableIndex",dto);
	}
	@Override
	public void indexInc(UserInfoDTO dto) throws Exception {
		session.selectOne(namespace+".modTableCount_num",dto);
	}
	@Override
	public void indexSecInc(UserInfoDTO dto) throws Exception {
		session.selectOne(namespace+".modTableSecond",dto);
	}
	
	
	
}
