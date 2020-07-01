package com.cds.service;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cds.model.User;

public interface UserService {

	/**
	 * @param file
	 */
	public void save(MultipartFile file);
	
	/**
	 * @param file
	 */
	public void saveFile(File file);
	
	/**
	 * @return
	 */
	public List<User> getUsers(BigDecimal min, BigDecimal max);

}
