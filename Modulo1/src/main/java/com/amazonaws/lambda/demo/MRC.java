package com.amazonaws.lambda.demo;

public class MRC {
	private Point[] curva;

	
	public MRC(Point[] curva) {
		super();
		this.curva = curva;
	}


	public Point[] getCurva() {
		return curva;
	}
	

	public void setCurva(Point[] curva) {
		this.curva = curva;
	}


	public MRC() {
		super();
	}
	
}
