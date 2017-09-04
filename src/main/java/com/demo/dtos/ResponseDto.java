package com.demo.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)

public class ResponseDto {

	 @JsonProperty("batteryPercentage")
	private double remaining_battery_percentage;
	 
	 @JsonProperty("messge")
	private String message;

	

	public double getRemaining_battery_percentage() {
		return remaining_battery_percentage;
	}

	public void setRemaining_battery_percentage(double remaining_battery_percentage) {
		this.remaining_battery_percentage = remaining_battery_percentage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	} 
	 
}
