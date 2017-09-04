package com.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.Robot;
import com.demo.dtos.ResponseDto;
import com.demo.dtos.RobotDto;
import com.demo.dtos.RobotRequestDto;
import com.demo.services.RobotService;



@RestController
@RequestMapping(value="robot",produces = MediaType.APPLICATION_JSON_VALUE)
public class RobotController {

@Autowired 
private RobotService robotService;


	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/perform")
    public ResponseDto performOperation(@RequestBody RobotRequestDto robotRequestDto) {
        return robotService.performOperation(robotRequestDto);
    }
	
	@RequestMapping(method = RequestMethod.PUT)
	public Robot createRobot(@RequestBody RobotDto robot) {
		
		return robotService.createRobot(robot);
		
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Robot> getAllRobots() {
		return robotService.getAllRobots();
	}
}
