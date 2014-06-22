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
}
