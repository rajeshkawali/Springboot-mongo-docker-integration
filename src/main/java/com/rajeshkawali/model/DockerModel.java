package com.rajeshkawali.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "dockerModel")
public class DockerModel {

	@Id
    private int id;
	private String imageName;
	private String status;
	private Integer containerId;
	private String version;

}
