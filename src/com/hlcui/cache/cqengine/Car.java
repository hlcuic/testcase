/**
 * 
 */
package com.hlcui.cache.cqengine;

import java.util.List;

import com.hlcui.cache.cqengine.Car;

public class Car {
	
	private int carId;
	
	private String description;
	
	private String features;
	
	private List<String> others;

	public Car() {
		
	}

	public Car(int carId, String description, String features, List<String> others) {
		this.carId = carId;
		this.description = description;
		this.features = features;
		this.others = others;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public List<String> getOthers() {
		return others;
	}

	public void setOthers(List<String> others) {
		this.others = others;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", description=" + description + ", "
				+ "features=" + features + ", others=" + others
				+ "]";
	}

}
