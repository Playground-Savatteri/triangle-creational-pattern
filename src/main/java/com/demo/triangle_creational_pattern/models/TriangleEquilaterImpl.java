package com.demo.triangle_creational_pattern.models;

import com.demo.triangle_creational_pattern.models.interfaces.ShapeItem;

public class TriangleEquilaterImpl implements ShapeItem{

	@Override
	public double area(double side1, double side2, double side3) {
		return (double) (Math.pow(side1, 2)*Math.sqrt(3)/4);
	}

	@Override
	public String getTriangleType() {
		return "Equilatero";
	}


}
