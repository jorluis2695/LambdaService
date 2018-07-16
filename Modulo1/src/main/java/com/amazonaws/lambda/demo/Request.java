package com.amazonaws.lambda.demo;


public class Request {
	private long totalMemory;  //Total Memory in bytes
	private int[] frequency;
	private float[] cdi;
	private float[] bdi;
	private int[] weights;
	private long[] minimumMemory;
	private Point[] mrc;
	
//    public Request(long totalMemory, int[] frequency, float[] cdi, float[] bdi, int[] weights, long[] minimumMemory,
//    		MRC[] mrc) {
//		super();
//		this.totalMemory = totalMemory;
//		this.frequency = frequency;
//		this.cdi = cdi;
//		this.bdi = bdi;
//		this.weights = weights;
//		this.minimumMemory = minimumMemory;
//		this.mrc = mrc;
//	}
//    public Request(long totalMemory, int[] frequency, float[] cdi, float[] bdi, int[] weights, long[] minimumMemory) {
//		super();
//		this.totalMemory = totalMemory;
//		this.frequency = frequency;
//		this.cdi = cdi;
//		this.bdi = bdi;
//		this.weights = weights;
//		this.minimumMemory = minimumMemory;
//	}
    public Request(long totalMemory, int[] frequency, float[] cdi, float[] bdi, int[] weights, long[] minimumMemory,
    		Point[] mrc) {
		super();
		this.totalMemory = totalMemory;
		this.frequency = frequency;
		this.cdi = cdi;
		this.bdi = bdi;
		this.weights = weights;
		this.minimumMemory = minimumMemory;
		this.mrc = mrc;
	}


	public Request() {
		super();
    }


	public long getTotalMemory() {
		return totalMemory;
	}


	public void setTotalMemory(long totalMemory) {
		this.totalMemory = totalMemory;
	}


	public int[] getFrequency() {
		return frequency;
	}


	public void setFrequency(int[] frequency) {
		this.frequency = frequency;
	}


	public float[] getCdi() {
		return cdi;
	}


	public void setCdi(float[] cdi) {
		this.cdi = cdi;
	}


	public float[] getBdi() {
		return bdi;
	}


	public void setBdi(float[] bdi) {
		this.bdi = bdi;
	}


	public int[] getWeights() {
		return weights;
	}


	public void setWeights(int[] weights) {
		this.weights = weights;
	}


	public long[] getMinimumMemory() {
		return minimumMemory;
	}


	public void setMinimumMemory(long[] minimumMemory) {
		this.minimumMemory = minimumMemory;
	}


	public Point[] getMrc() {
		return mrc;
	}


	public void setMrc(Point[] mrc) {
		this.mrc = mrc;
	}


//	public MRC[] getMrc() {
//		return mrc;
//	}
//
//
//	public void setMrc(MRC[] mrc) {
//		this.mrc = mrc;
//	}
	


	
	
	
}