package com.paul.wh5_2;

public class Circle implements Shape {
	double Area;
	double Preimeter;
	final double pi = 3.14;
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void computeArea() {
		Area = radius * radius * pi;
		System.out.println("Circle面積 : " + Area);
	}
	
	public void computeCircumference() {
		Preimeter = 2 * radius * pi;
		System.out.println("Circle周長 : " + Preimeter + "\n");
	}
}
