package finalProject;
/*
 * 後輪總成
 */
class RearWheelSystem {

	WheelAxle wheelAxle;
	Tire rearTire;
	static final int secondToMinute=60; //秒轉分鐘
	
	RearWheelSystem(){
		this.wheelAxle=new WheelAxle(3.071);
		this.rearTire=new Tire(140,70,17);
	}
	
	//回傳rpm
	public double speedToWheelRotation(double speed){
		return (speed/rearTire.getPerimeter())*secondToMinute;
	}
	
	//回傳時速
	public double wheelRoataionTospeed(double wheelRotation){
		return wheelRotation*rearTire.getPerimeter()*secondToMinute/1000.0;
	}
	
}
