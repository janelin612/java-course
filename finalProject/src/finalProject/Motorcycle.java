package finalProject;
import java.util.Scanner;

class Motorcycle {
	static Scanner scan=new Scanner(System.in);
	RearWheelSystem rearWheelSystem;
	Transmission transmission;
	CrankShaft crank;
	double finalReductionRatio; //最終傳動比
	double speed; //車速
	static final double KmHrToMS=1000.0/3600.0; //時速轉換
	
	//Constructor
	public Motorcycle(){
		this.rearWheelSystem=new RearWheelSystem();
		this.transmission=new Transmission();
		this.crank=new CrankShaft(3.086);
	}
	
	//操作介面由此開始
	public void functionChosen(){
		int flag=0;
		System.out.println("本系統將為你換算Ninja250在各檔位的時速與引擎轉速");
		System.out.println("請輸入1 or 2選擇: 1.時速換轉速 2.轉速換時速");
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
		speed=scan.nextDouble()*KmHrToMS;
		if(speed<0){
			System.out.println("時速不可小於0");
			speedToRotation();
		}
		
		setTransmission();
		calculateFinalReductionRatio();
		double engineRotation=rearWheelSystem.rearTire.speedToWheelRotation(speed)*this.finalReductionRatio;
		System.out.print("引擎轉速為:"+engineRotation+"rpm");
	}



	private void rotationToSpeed() {
		// TODO 自動產生的方法 Stub
		
	}

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

	private void calculateFinalReductionRatio() {
		double ratio1=crank.getReductionRatio();
		double ratio2=transmission.getReductionRatio(transmission.chosenGear);
		double ratio3=rearWheelSystem.wheelAxle.getReductionRatio();
		this.finalReductionRatio=ratio1*ratio2*ratio3;
	}
}