package com.demo.triangle_creational_pattern.models.rest;


public class TriangleRestResponse {

	double area;
	String name;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public TriangleRestResponse(double area, String name) {
		super();
		this.area = area;
		this.name = name;
	}

	

}
