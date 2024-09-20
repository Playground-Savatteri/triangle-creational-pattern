package com.demo.triangle_creational_pattern.services;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.triangle_creational_pattern.models.TriangleEquilaterImpl;
import com.demo.triangle_creational_pattern.models.TriangleIsoscelesImpl;
import com.demo.triangle_creational_pattern.models.TriangleScaleneImpl;
import com.demo.triangle_creational_pattern.models.interfaces.ShapeItem;
import com.demo.triangle_creational_pattern.utils.TriangleUtils;

@Service
public class TriangleService {

	@Autowired
	private TriangleFactory triangleFactory;
	
	public ShapeItem getShapeItemBySides(double side1, double side2, double side3) {
				
		ShapeItem shapeItem = (ShapeItem) triangleFactory.getTriangleBySides(side1, side2, side3);

		return shapeItem;
	}
}
