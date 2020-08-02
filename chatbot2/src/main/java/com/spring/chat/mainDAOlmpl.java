package com.spring.chat;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class mainDAOlmpl implements mainDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String ns = "UserMapper";
	
	@Override
	public List<mainDTO> listUp(){
		
		return sqlSession.selectList(ns+".selectMember");
		
	};
	@Override
	public void insert(mainDTO md) {
		sqlSession.insert(ns+".insertMember",md);
	};
}
