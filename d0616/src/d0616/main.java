package d0616;

/*
 * 包含三角形 圓形 長方形
 * 可計算面積 周長
 * 各自衍生出立體結構
 */
public class main {

	public static void main(String[] args) {
		Shape[] shape=new Shape[3];
		shape[0]=new Circle(5);
		shape[1]=new Triangle(3,4,5);
		shape[2]=new Rectangle(6,4);
		
		for(int i=0;i<shape.length;i++){
			System.out.println("The Area of shape"+(i+1)+" is:"+shape[i].area());
			System.out.println("The Perimeter of shape"+(i+1)+" is:"+shape[i].perimeter());
			System.out.println("=====");
		}

	}

}
class Circle extends Shape implements Area,Perimeter {
	private double radius;
	private static final double pi=3.1415926;
	
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
	private double halfPerimeter;
	
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
