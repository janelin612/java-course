package d0526;

import java.util.Scanner;

//複數的資料結構
public class ComplexNum {
	
	private double real,imag;
	
	public ComplexNum(double realNum,double imaginaryNum){
		real=realNum;
		imag=imaginaryNum;
	}
	public ComplexNum(){
		real=0;
		imag=0;
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
	
	/*
	 * 讓使用者自行輸入的方法
	 */
	public void manualInitial(){
		Scanner scan=new Scanner(System.in);
		
		System.out.println("請輸入實部:");
		real=scan.nextDouble();
		System.out.println("請輸入虛部:");
		imag=scan.nextDouble();
	}

}
