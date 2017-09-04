package com.demo.services;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.RobotRepository;
import com.demo.domain.Robot;
import com.demo.dtos.ResponseDto;
import com.demo.dtos.RobotDto;
import com.demo.dtos.RobotRequestDto;
import com.demo.resources.Messages;

@Service
public class RobotService {

	//
	
	@Autowired
	private RobotRepository robotRepository;
	
	
	public ResponseDto performOperation(RobotRequestDto robotRequestDto) {
	
		

		System.out.println(robotRequestDto);
		ResponseDto response = new ResponseDto();
		double distance = robotRequestDto.getDistance();
		double weight = robotRequestDto.getWeight();
		
		Robot rob = getRobotById(robotRequestDto.getRobotId());
		
		if(distance >= rob.getMax_distance()) {
			response.setRemaining_battery_percentage(0);
			response.setMessage(Messages.Red_Light_Message);
			
			//System.out.println(message);
			return response;
			}
		if(weight >= rob.getMax_weight()) {
			response.setRemaining_battery_percentage(0);
			response.setMessage(Messages.overWeightMessage);
			//System.out.println(message);
			return response;
			}
	
		
		double remaining_percentage = rob.getRemaining_battery_percentage()-((100/rob.getMax_distance())*distance+ (rob.getBattery_per_kg()*weight));
		if(remaining_percentage < 0)
			remaining_percentage = 0;
		
		rob.setRemaining_battery_percentage(remaining_percentage);
		
		response.setRemaining_battery_percentage(rob.getRemaining_battery_percentage());
		robotRepository.save(rob);
		if(rob.getRemaining_battery_percentage() <=15) {
			
			response.setMessage(Messages.Red_Light_Message);
		}
		else {
			response.setMessage(Messages.everything_Normal);
		}
		
		return response;
		
	}
	
	
	public Robot createRobot(RobotDto roboDto) {
		
		Robot newRobo = new Robot();
		
		newRobo.setId(roboDto.getId());
		newRobo.setName(roboDto.getName());
		newRobo.setMax_battery_status(roboDto.getMax_battery_status());
		newRobo.setMax_distance(roboDto.getMax_distance());
		newRobo.setMax_weight(roboDto.getMax_weight());
		if(roboDto.getRemaining_battery_percentage() < 0)
			newRobo.setRemaining_battery_percentage(0);
		else
		newRobo.setRemaining_battery_percentage(roboDto.getRemaining_battery_percentage());
		newRobo.setBattery_per_kg(roboDto.getBattery_per_kg());
		
	
		robotRepository.save(newRobo);
		
		return newRobo;
		
	}
	
	public Robot getRobotById(int id) {
		
		return robotRepository.findOne(id);
	}
	
	public List<Robot> getAllRobots() {
		List<Robot> robots = new ArrayList<Robot>();
		robotRepository.findAll().forEach(robots::add);
		
		return robots;
	}
}
