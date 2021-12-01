package com.rajeshkawali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajeshkawali.dao.DockerDao;
import com.rajeshkawali.model.DockerModel;

@Service
public class DockerServiceImpl implements DockerService {

	@Autowired
	private DockerDao dockerDao;
	
	@Override
	public List<DockerModel> getDetails() {
		System.out.println("DockerServiceImpl.getDetails()");
		return dockerDao.findAll();
	}

	@Override
	public DockerModel saveDetails(DockerModel dModel) {
		System.out.println("DockerServiceImpl.saveDetails()");
		return dockerDao.save(dModel);
	}

}
