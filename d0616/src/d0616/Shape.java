package d0616;


public abstract class Shape implements Area,Perimeter{

}

class Circle extends Shape implements Area,Perimeter {
	protected double radius;
	public static final double pi=3.1415926;
	
	public Circle(double r){
		radius=r;
	}
	
	public double perimeter() {
		return 2*radius*pi;
	}

	public double area() {
		return radius*radius*pi;
	}
	
}
class Triangle extends Shape implements Area {
	private double[] edge;
	private double halfPerimeter; //半周長，供海龍公式使用
	
	public Triangle(double edge1,double edge2,double edge3){
		edge=new double[3];
		edge[0]=edge1;
		edge[1]=edge2;
		edge[2]=edge3;
		
		halfPerimeter=this.perimeter()*0.5;
	}
	
	public double perimeter() {
		return edge[0]+edge[1]+edge[2];
	}

	public double area() {
		//海龍公式
		return Math.sqrt(halfPerimeter*(halfPerimeter-edge[0])*(halfPerimeter-edge[1])*(halfPerimeter-edge[2]));
	}

	
}
class Rectangle extends Shape implements Perimeter{
	private double length;
	private double width;
	
	public Rectangle(double l,double w){
		length=l;
		width=w;
	}
	
	public double perimeter() {	
		return 2*length*width;
	}

	public double area() {
		return length*width;
	}
	
}


class Cylinder extends Circle {
	private double hight;
	
	public Cylinder(double r,double h) {
		super(r);
		hight=h;
	}
	
	public double volume(){
		return this.area()*hight;
	}
}
class Sphere extends Circle {

	public Sphere(double r) {
		super(r);
	}
	
	public double volume(){
		return 0.75*pi*radius*radius*radius;
	}
	
}