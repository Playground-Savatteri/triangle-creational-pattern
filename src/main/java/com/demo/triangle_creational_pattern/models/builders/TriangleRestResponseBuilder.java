package com.demo.triangle_creational_pattern.models.builders;

import com.demo.triangle_creational_pattern.models.rest.TriangleRestResponse;

public final class TriangleRestResponseBuilder {

	double area;
	String name;


	 public static TriangleRestResponseBuilder newBuilder() {
	 return new TriangleRestResponseBuilder();
	 }
	
	public TriangleRestResponseBuilder area(double area) {
		this.area = area;
		return this;
	}
	public TriangleRestResponseBuilder name(String name) {
		this.name = name;
		return this;
	}	
	 
	 public TriangleRestResponse build() {
		 return new TriangleRestResponse(area, name);
		 }


}
