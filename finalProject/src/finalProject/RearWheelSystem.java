package finalProject;
/*
 * 後輪總成
 */
class RearWheelSystem {

	WheelAxle wheelAxle;
	Tire rearTire;
	
	RearWheelSystem(){
		this.wheelAxle=new WheelAxle(3.071);
		this.rearTire=new Tire(140,70,17);
	}
	
	//回傳rpm
	public double speedToWheelRotation(double speed){
		return (speed/rearTire.getPerimeter())*rearTire.secondToMinute;
	}
	
	//回傳時速
	public double wheelRoataionTospeed(double wheelRotation){
		return wheelRotation*rearTire.getPerimeter()*rearTire.secondToMinute/1000.0;
	}
	
}
