package com.spring.chat;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class mainServicelmpl implements mainService {
	
	@Inject
	private mainDAO dao;
	
	@Override
	public List<mainDTO> list(){
	
		return dao.listUp();
		
	};
	
	@Override
	public void insert(mainDTO md) {
		dao.insert(md);
	}
	
}
