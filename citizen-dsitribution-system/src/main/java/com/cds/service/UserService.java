package com.cds.service;

import java.io.File;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cds.model.User;

public interface UserService {

	public void save(MultipartFile file);
	
	public void saveFile(File file);
	
	public List<User> getUsers();
}
