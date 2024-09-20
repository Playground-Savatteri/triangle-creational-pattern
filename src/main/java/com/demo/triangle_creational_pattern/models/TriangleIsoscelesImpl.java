package com.demo.triangle_creational_pattern.models;

import com.demo.triangle_creational_pattern.models.interfaces.ShapeItem;

public class TriangleIsoscelesImpl implements ShapeItem {

	@Override
	public double area(double side1, double side2, double side3) {

		double base = 0;
		double sideEqual = 0;
		
		if(side1 == side2) {
			base = side3;
			sideEqual = side1;
		}
		if(side2 == side3) {
			base = side1;
			sideEqual = side2;
		}
		if(side1==side3) {
			base = side2;
			sideEqual = side1;
		}
		
		double a = (2*sideEqual + base)/2;
		double b = (float) Math.pow(base/2, 2);
		double c = (2*sideEqual - base)/2;
		
		
		return Math.sqrt(a*b*c);
	}

	@Override
	public String getTriangleType() {
		return "Isoscele";
	}

}
