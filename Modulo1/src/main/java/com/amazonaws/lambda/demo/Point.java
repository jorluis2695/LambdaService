package com.amazonaws.lambda.demo;

public class Point {
	double a, b;
	
	public Point() {
		super();
	}

	public Point(int a, double b)
	{
		this.a = a;
		this.b = b;
	}
//	public Point(double a, double b)
//	{
//		double[] p = new double[2];
//		p[0] = a;
//		p[1] = b;
//		this.punto = p;
//	}
//
//	public double[] getPunto() {
//		return punto;
//	}
//
//	public void setPunto(double[] punto) {
//		this.punto = punto;
//	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Point(int a) {
		super();
		this.a = a;
	}

	public Point(double b) {
		super();
		this.b = b;
	}

	public Point(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	

}
