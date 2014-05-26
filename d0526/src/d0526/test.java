package d0526;

public class test {

	public static void main(String[] args) {
		Adder myadder1=new Adder('2',"Taiwan");
		Adder myadder2=new Adder(new TwoDimArray(1,2,3,4),new TwoDimArray(1,2,3,4));
		Adder myadder3=new Adder(3.0,1);
		Adder myadder4=new Adder(1,3.01);
		Adder myadder5=new Adder(new Complex(2,3),new Complex(5,-5));
	}


}
