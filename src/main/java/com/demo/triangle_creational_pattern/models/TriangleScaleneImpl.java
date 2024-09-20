package com.demo.triangle_creational_pattern.models;

import com.demo.triangle_creational_pattern.models.interfaces.ShapeItem;

public class TriangleScaleneImpl implements ShapeItem{

	@Override
	public double area(double side1, double side2, double side3) {
		
		double s = (side1 + side2 + side3) / 2;
        return (double) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override
	public String getTriangleType() {
		return "Scaleno";
	}


    
}

