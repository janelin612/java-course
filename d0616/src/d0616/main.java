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
		
		Cylinder cylinder=new Cylinder(5,2);
		Sphere sphere = new Sphere(5);
		System.out.println("The volume of cylinder is:"+cylinder.volume());
		System.out.println("The volume of sphere is:"+sphere.volume());

	}

}

