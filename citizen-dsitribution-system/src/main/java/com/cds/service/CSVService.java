package com.cds.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cds.model.User;
import com.cds.util.CSVHelper;

@Service
public class CSVService {
	@Autowired
	UserRepository repository;

	public void save(MultipartFile file) {
		try {
			List<User> tutorials = CSVHelper.csvToUsers(file.getInputStream());
			repository.saveAll(tutorials);
		} catch (IOException e) {
			throw new RuntimeException("fail to store csv data: " + e.getMessage());
		}
	}

	public List<User> getUsers() {
		return repository.findUsers();
	}
}