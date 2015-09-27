package main;

public class Triangle extends GeometricObject{
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	public Triangle(){
	}
	public Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double p=(side1+side2+side3)/2;
		return Math.pow((p*(p-side1)*(p-side2)*(p-side3)),0.5);

	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (side1+side2+side3);
	}
	
	public String toString(){
		return "Side1=" +side1
				+"Side2="+side2+"side3="+side3
				+"parimeter="+getPerimeter()
						+ "Area="+getArea();
	}
	
	
	

}
