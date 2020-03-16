package com.brugier.prototype;

public class Car {
	private String brand;
	private String model;
	private String color;

	private Car() {

	}

	public Car(String brand, String model, String color) {
		this.brand = brand;
		this.model = model;
		this.color = color;
	}

	public static Car copy(Car car) {
		Car copy = new Car();
		copy.brand = car.brand;
		copy.model = car.model;
		copy.color = car.color;
		return copy;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + "]";
	}

	
}
