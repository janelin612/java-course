package d0526;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {
	static Scanner scan=new Scanner(System.in);
	private Adder adder;
	
	//總管整支程式
	public void initial(){
		welcome();
	}

	private void welcome() {
		System.out.println("請選擇需要的運算:");
		System.out.println("1.字元字串相加\n2.二維陣列相加\n3.整數實數相加");
		System.out.println("4.實數整數相加\n5.複數相加\n6.遞增二\n7.任意項數相加");
		int flag=scan.nextInt();
		operator(flag);
		
	}

	private void operator(int flag) {
		switch(flag){
		case 1:
			System.out.println("請輸入字元");
			char ch=scan.next().charAt(0);
			System.out.println("請輸入字串");
			String st=scan.next();
			
			adder=new Adder(ch,st);
			break;
		case 2:
			TwoDimArray arrayA=new TwoDimArray();
			TwoDimArray arrayB=new TwoDimArray();
			
			System.out.println("陣列一:");
			arrayA.manualInitial();
			System.out.println("陣列二:");
			arrayB.manualInitial();
			
			adder=new Adder(arrayA,arrayB);
			break;
		case 3:
			System.out.println("請輸入整數:");
			int integer=scan.nextInt();
			System.out.println("請輸入實數:");
			double doub=scan.nextDouble();
			
			adder=new Adder(integer,doub);
			break;
		case 4:
			System.out.println("請輸入實數:");
			double doub2=scan.nextDouble();
			System.out.println("請輸入整數:");
			int integer2=scan.nextInt();

			adder=new Adder(integer2,doub2);
			break;
		case 5:
			ComplexNum comA=new ComplexNum();
			ComplexNum comB=new ComplexNum();
			
			System.out.println("複數一:");
			comA.manualInitial();
			System.out.println("複數二:");
			comB.manualInitial();
			
			adder=new Adder(comA,comB);
			break;
		case 6:
			System.out.println("請輸入值:");
			double num=scan.nextDouble();

			adder=new Adder(num,2);
			break;
		case 7:
			Stack<Double> stack = new Stack<Double>();
			double item=0;
			do{
				System.out.println("請輸入數值，輸入0結束輸入:");
				item=scan.nextDouble();
				stack.push(item);
			}while(item!=0);
			
			adder=new Adder(stack);
			break;
			default:
				System.out.print("無此項目，請重新輸入:");
				int reflag = scan.nextInt();
				operator(reflag);
				
		}
	}
}
