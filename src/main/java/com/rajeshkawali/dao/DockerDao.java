package com.rajeshkawali.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rajeshkawali.model.DockerModel;

@Repository
public interface DockerDao extends MongoRepository<DockerModel, Integer> {

}