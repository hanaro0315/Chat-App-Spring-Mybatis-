package com.spring.chat;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;


public interface mainService {
	
	public List<mainDTO> list() throws Exception;
	public void insert(mainDTO md);
}
