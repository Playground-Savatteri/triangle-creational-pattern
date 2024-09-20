package com.demo.triangle_creational_pattern.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.triangle_creational_pattern.models.builders.TriangleRestResponseBuilder;
import com.demo.triangle_creational_pattern.models.interfaces.ShapeItem;
import com.demo.triangle_creational_pattern.models.rest.TriangleRestResponse;
import com.demo.triangle_creational_pattern.services.TriangleFactory;
import com.demo.triangle_creational_pattern.services.TriangleService;
import com.google.gson.Gson;

@RestController
public class TriangleController {

	@Autowired
	private TriangleService triangleService;

	@GetMapping("/getTriangleAreaBySides")
	public TriangleRestResponse getLegoByName(double side1, double side2, double side3) {

		ShapeItem shapeItem = getTriangleService().getShapeItemBySides(side1, side2, side3);
		
		TriangleRestResponse trrb = TriangleRestResponseBuilder.newBuilder()
				.name(shapeItem.getTriangleType())
				.area(shapeItem.area(side1, side2, side3))
				.build();
		
		return trrb;

	}


	public TriangleService getTriangleService() {
		return triangleService;
	}

	public void setTriangleService(TriangleService triangleService) {
		this.triangleService = triangleService;
	}

}
