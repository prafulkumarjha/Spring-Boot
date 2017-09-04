package com.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.domain.Robot;

public interface RobotRepository extends CrudRepository<Robot,Integer> {

}
