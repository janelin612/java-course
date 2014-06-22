package finalProject;
import java.util.Scanner;

class Motorcycle {
	static Scanner scan=new Scanner(System.in);
	RearWheelSystem rearWheelSystem;
	Transmission transmission;
	CrankShaft crank;
	double speed; //車速
	double engineRotation; //引擎轉速
	static final double KmHrToMS=1000.0/3600.0; //時速轉換
	
	//Constructor
	public Motorcycle(){
		this.rearWheelSystem=new RearWheelSystem();
		this.transmission=new Transmission();
		this.crank=new CrankShaft(3.086);
	}
	
	//最終傳動比=第一減速比x第二減速比x變速箱減速比
	private double finalReductionRatio() {
		double ratio1=crank.getReductionRatio();
		double ratio2=transmission.getReductionRatio();
		double ratio3=rearWheelSystem.wheelAxle.getReductionRatio();
		return ratio1*ratio2*ratio3;
	}
	
	//操作介面由此開始
	public void start(){
		System.out.println("本系統將為你換算Ninja250在各檔位的時速與引擎轉速");
		functionChosen();
	}
	
	private void functionChosen(){
		int flag=0;
		System.out.println("請輸入 1 or 2 選擇:\n 1.時速換轉速\n 2.轉速換時速");
		flag=scan.nextInt();			
		switch (flag){
			case 1:
				speedToRotation();
				break;
			case 2:
				rotationToSpeed();
				break;
			default:
				System.out.println("輸入錯誤，請重新輸入");	
				functionChosen();
		}
	}


	private void speedToRotation() {
		System.out.println("請輸入時速(km/hr)");
		speed=scan.nextDouble()*KmHrToMS; //輸入，順便轉換單位
		if(speed<0){
			System.out.println("時速不可小於0");
			speedToRotation();
		}
		if(speed>41.667){
			System.out.println("時速過高(<150)");
			speedToRotation();
		}
		
		setTransmission();
		
		//引擎轉速=輪轉速x最終傳動比 
		engineRotation=rearWheelSystem.speedToWheelRotation(speed)*finalReductionRatio();
		if(finalReductionRatio()!=0) //處理空檔特殊條件
			System.out.println("引擎轉速為:"+engineRotation+"rpm");
		else
			System.out.println("進入空檔，故引擎轉速未知");
	}

	private void rotationToSpeed() {
		System.out.println("請輸入引擎轉速(rpm)");
		engineRotation=scan.nextDouble();
		if(engineRotation<0){
			System.out.println("轉速不可小於0");
			rotationToSpeed();
		}
		if(engineRotation>13000){
			System.out.println("轉速過高(<13,000)");
			rotationToSpeed();
		}
		
		setTransmission();
		
		//輪轉速=引擎轉速/最終傳動比
		double realWheelRotation=engineRotation/finalReductionRatio();
		if(finalReductionRatio()!=0) //處理空檔特殊條件
			speed=rearWheelSystem.wheelRoataionTospeed(realWheelRotation);
		else{
			speed=0;
			System.out.print("由於空檔，故理論");
		}
		System.out.println("車速為:"+speed+"km/hr");
	}
	
	//讓使用者選定檔位
	private void setTransmission() {
		int transminnionFlag;
		System.out.println("請選擇檔位(1~6檔 空檔請輸入0)");
		transminnionFlag=scan.nextInt();
		if(transminnionFlag>6||transminnionFlag<0){
			System.out.println("檔位不存在");
			setTransmission();
		}
		this.transmission.setChosenGear(transminnionFlag);
	}


}