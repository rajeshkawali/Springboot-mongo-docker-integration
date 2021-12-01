package com.rajeshkawali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajeshkawali.model.DockerModel;
import com.rajeshkawali.service.DockerService;

@RestController
public class DockerController {

	@Autowired
	private DockerService dockerService;

	@RequestMapping("/")
	public DockerModel rootPath() {
		System.out.println("DockerController.rootPath()");
		DockerModel model = new DockerModel();
		model.setId(0);
		model.setImageName("openjdk8");
		model.setVersion("1.0");
		model.setContainerId(7372213);
		model.setStatus("Active");
		return model;
	}

	@GetMapping("/get")
	public List<DockerModel> getDetails() {
		System.out.println("DockerController.getDetails()");
		return dockerService.getDetails();
	}

	@PostMapping("/save")
	public DockerModel saveDetails(@RequestBody DockerModel dModel) {
		System.out.println("DockerController.saveDetails()");
		return dockerService.saveDetails(dModel);
	}
}
