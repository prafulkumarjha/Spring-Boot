package com.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Robot {

	@Id
	private int id;
	private String name;
	private double max_weight;
	private double max_distance;
	private int max_battery_status;
	private double remaining_battery_percentage ;
	private double battery_per_kg ;
	
	public Robot() {
		
	}
	
	public Robot(int id, String name,double max_weight, double max_distance, int max_battery_status, 
			double remaining_battery_percentage, double battery_per_kg) {
		super();
		this.id = id;
		this.name = name;
		this.max_weight = max_weight;
		this.max_distance = max_distance;
		this.max_battery_status = max_battery_status;
		this.remaining_battery_percentage = remaining_battery_percentage;
		this.battery_per_kg = battery_per_kg;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getMax_weight() {
		return max_weight;
	}
	public void setMax_weight(double max_weight) {
		this.max_weight = max_weight;
	}
	public double getMax_distance() {
		return max_distance;
	}
	public void setMax_distance(double max_distance) {
		this.max_distance = max_distance;
	}
	public int getMax_battery_status() {
		return max_battery_status;
	}
	public void setMax_battery_status(int max_battery_status) {
		this.max_battery_status = max_battery_status;
	}
	public double getRemaining_battery_percentage() {
		return remaining_battery_percentage;
	}
	public void setRemaining_battery_percentage(double remaining_battery_percentage) {
		this.remaining_battery_percentage = remaining_battery_percentage;
	}

	public double getBattery_per_kg() {
		return battery_per_kg;
	}

	public void setBattery_per_kg(double battery_per_kg) {
		this.battery_per_kg = battery_per_kg;
	}

	
	
	
	
}
