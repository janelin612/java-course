package finalProject;
/*
 * 後輪總成
 */
class RealWheelSystem {

	WheelAxle wheelAxle;
	Tire rearTire;
	
	RealWheelSystem(){
		this.wheelAxle=new WheelAxle(3.071);
		this.rearTire=new Tire(140,70,17);
	}
}
