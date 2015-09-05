package com.zju.greenhandforJava;
public class circle implements Icalculate {

	public circle(float rr) throws myException {
		r = rr;
		if (r > 10) {
			throw new myException("error2222");
		}
	}

	class innerclass {
		public int r;
		public float add = circle.this.r + 1;
	}

	innerclass in = new innerclass();

	public float getArea() {
		float area = Pi * r * r;
		return area;
	}

	public float getCircumference() {
		float Circumference = 2 * Pi * r;
		return Circumference;
	}

	public float r;
}
