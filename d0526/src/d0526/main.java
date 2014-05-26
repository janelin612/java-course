package d0526;

import java.util.Scanner;

public class main {
	static Scanner scan=new Scanner(System.in);
	static String input1,input2;

	public static void main(String[] args) {
		System.out.println("請選擇需要的運算:");
		System.out.println("1.字元字串相加\n2.二微陣列相加\n3.整數實數相加");
		System.out.println("4.實數整數相加\n5.複數相加");
		int flag=scan.nextInt();
		operator(flag);
		
	}

	private static void operator(int flag) {
		switch(flag){
		case 1:
			System.out.println("請輸入字元");
			char ch=scan.next().charAt(0);
			System.out.println("請輸入字串");
			String st=scan.next();
			
			new Adder(ch,st);
			break;
		case 2:
			TwoDimArray a=new TwoDimArray();
			TwoDimArray b=new TwoDimArray();
			
			System.out.println("陣列一:");
			a.initial();
			System.out.println("陣列二:");
			b.initial();
			
			new Adder(a,b);
			break;
		case 3:
			System.out.println("請輸入整數:");
			int integer=scan.nextInt();
			System.out.println("請輸入實數:");
			double doub=scan.nextDouble();
			
			new Adder(integer,doub);
			break;
		case 4:
			System.out.println("請輸入實數:");
			double doub2=scan.nextDouble();
			System.out.println("請輸入整數:");
			int integer2=scan.nextInt();

			
			new Adder(integer2,doub2);
			break;
		case 5:
			
			default:
				System.out.print("無此項目");
		}
	}


}