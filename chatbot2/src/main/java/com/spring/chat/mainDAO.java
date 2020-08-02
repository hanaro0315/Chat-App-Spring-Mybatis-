package com.spring.chat;

import java.util.List;

public interface mainDAO {

	public List<mainDTO> listUp();
	public void insert(mainDTO md);
}
