package com.demo.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)

public class RobotRequestDto  {
	
	@Override
	public String toString() {
		return "RobotRequestDto [robotId=" + robotId + ", distance=" + distance + ", weight=" + weight + "]";
	}
	@JsonProperty("robotId")
	private int robotId;
	
	@JsonProperty("distance")
	private double distance;
	
	@JsonProperty("weight")
	private double weight;
	
	
	public int getRobotId() {
		return robotId;
	}
	public void setRobotId(int robotId) {
		this.robotId = robotId;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
