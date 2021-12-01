package com.rajeshkawali.service;

import java.util.List;

import com.rajeshkawali.model.DockerModel;

public interface DockerService {

	public List<DockerModel> getDetails();

	public DockerModel saveDetails(DockerModel dModel);
}