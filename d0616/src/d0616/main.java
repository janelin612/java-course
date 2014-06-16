package d0616;

/*
 * 包含三角形 圓形 長方形
 * 可計算面積 周長
 * 各自衍生出立體結構
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Circle extends Shape implements Area,Perimeter {
	private double radius;
	private final double pi=3.1415926;
	
	public double perimeter() {
		return 2*radius*pi;
	}

	public double area() {
		return radius*radius*pi;
	}
	
}
class Triangle extends Shape implements Area,Perimeter {

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
class Rectangle extends Shape implements Area,Perimeter{
	private double length;
	private double width;

	
	public double perimeter() {	
		return 2*length*width;
	}

	public double area() {
		return length*width;
	}
	
}
