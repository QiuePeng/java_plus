package com.paul.wh5_2;

public class Rectangle implements Shape {
	
	double Area;
	double Preimeter;
	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	

	public void computeArea() {
		Area = height * width;
		System.out.println("Rectangle面積 : " + Area);
	}
	
	public void computeCircumference() {
		Preimeter = (height + width) * 2;
		System.out.println("Rectangle周長 : " + Preimeter + "\n");
	}
}
