package finalProject;
/*
 * 後輪總成
 */
class RearWheelSystem {

	WheelAxle wheelAxle;
	Tire rearTire;
	static final int secondToMinute=60; //秒轉分鐘
	
	//constructor
	RearWheelSystem(){
		this.wheelAxle=new WheelAxle(3.071);
		this.rearTire=new Tire(140,70,17);
	}
	
	//傳入速度(m/s)回傳轉速(rpm)
	public double speedToWheelRotation(double speed){
		return (speed/rearTire.getPerimeter())*secondToMinute;
	}
	
	//傳入轉速(rpm)回傳時速(km/hr)
	public double wheelRoataionTospeed(double wheelRotation){
		return wheelRotation*rearTire.getPerimeter()*secondToMinute/1000.0;
	}
	
}

/*
 * 輪胎
 */
class Tire {
	
	static final double pi=3.14159;
	static final double inchToMeter=0.0254; //吋轉公尺
	
	private double width; //輪胎寬度(公尺)
	private double flatnessRatio;  //扁平比(%)
	private double insideDiameter; //內徑(吋)
	private double outsideDiameter; //外徑(吋)

	//constructor
	Tire(double width,double ratio,double diameter){
		this.width=width*0.001; //輸入值轉公尺
		this.flatnessRatio=ratio*0.01; //輸入值轉百分比
		this.insideDiameter=diameter;
		calculateOutsideDiameter();
	}

	//計算外徑(公尺)
	private void calculateOutsideDiameter() {
		/*
		 * 外徑=內徑+2倍橡皮高度
		 * 橡皮高度=扁平比*寬度
		 */
		this.outsideDiameter=insideDiameter*inchToMeter+2*flatnessRatio*width;
	}
	
	//回傳輪胎周長(公尺)
	public double getPerimeter(){
		return outsideDiameter*pi;
	}
	
}
