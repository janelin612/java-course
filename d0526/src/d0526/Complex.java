package d0526;
//複數的資料結構
public class Complex {
	
	private double real,imag;
	
	public Complex(double realNum,double imaginaryNum){
		real=realNum;
		imag=imaginaryNum;
	}
	
	public double getReal(){
		return real;
	}
	public double getImag(){
		return imag;
	}
	
	public void print(){
		System.out.println(real+"+"+imag+"i");
	}

}
