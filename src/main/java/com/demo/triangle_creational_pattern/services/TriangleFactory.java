package com.demo.triangle_creational_pattern.services;

import org.springframework.stereotype.Service;

import com.demo.triangle_creational_pattern.models.TriangleEquilaterImpl;
import com.demo.triangle_creational_pattern.models.TriangleIsoscelesImpl;
import com.demo.triangle_creational_pattern.models.TriangleScaleneImpl;
import com.demo.triangle_creational_pattern.models.interfaces.ShapeItem;

@Service
public class TriangleFactory {

	public ShapeItem getTriangleBySides(double side1, double side2, double side3) {

		ShapeItem shapeItem = null;
		if(side1 == side2 && side2 == side3)
			shapeItem = new TriangleEquilaterImpl();
		else if(side1 != side2 && side2 != side3 && side3 != side1)
			shapeItem = new TriangleScaleneImpl();
		else
			shapeItem = new TriangleIsoscelesImpl();
		

		return shapeItem;
	}
}
