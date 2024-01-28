package com.entities;

public class Cone {
private static double PI=Math.PI;
private double radius;
private double h;
private double l;
private double diameter;
private double circumference;
private double volume;
private double surfaceArea;

public Cone(double radius, double h, double l, double diameter, double circumference, double volume,
		double surfaceArea) {
	super();
	this.radius = radius;
	this.h = h;
	this.l = l;
	this.diameter = diameter;
	this.circumference = circumference;
	this.volume = volume;
	this.surfaceArea = surfaceArea;
}
public Cone() {}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public double calculateDiameter() {
	this.diameter=2*this.radius;
	return diameter;
}
public double calculateCircumference() {
	this.circumference=2*this.radius*this.PI;
	return circumference;
}
public double calculatesurfaceArea() {
	this.surfaceArea=4*PI*Math.pow(radius, 2);
	return this.surfaceArea;
}
public double calculateVolume() {
	this.volume=(4/3)*PI*Math.pow(radius, 3);
	System.out.println(this.volume);
	return this.volume;
}
}
