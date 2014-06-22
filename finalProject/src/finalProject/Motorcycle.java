package finalProject;

import java.util.Scanner;

public class Motorcycle {
	static Scanner scan=new Scanner(System.in);
	RearWheelSystem rearWheelSystem;
	Transmission transmission;
	CrankShaft crank;
	double speed;
	static final double KmHrToMS=(1000/3600);
	
	
	public Motorcycle(){
		this.rearWheelSystem=new RearWheelSystem();
		this.transmission=new Transmission();
		this.crank=new CrankShaft(3.086);
	}
	

	public void functionChosen(){

		int flag=0;
		System.out.println("本系統將為你換算Ninja250在各檔位的時速與引擎轉速");
		System.out.println("請輸入1or2選擇: 1.時速換轉速 2.轉速換時速");
		flag=scan.nextInt();			
		switch (flag){
			case 1:
				speedToRotation();
				break;
			case 2:
				rotationToSpeed();
				default:
					System.out.println("輸入錯誤");	
		}
	}


	private void speedToRotation() {
		System.out.println("請輸入時速(km/hr)");
		speed=scan.nextDouble();
		if(speed<0){
			System.out.println("時速不可小於0");
			speedToRotation();
		}
		speed*=KmHrToMS;
		
	}


	private void rotationToSpeed() {
		// TODO 自動產生的方法 Stub
		
	}
}
