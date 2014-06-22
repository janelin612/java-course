package finalProject;
/*
 * 輪胎
 */
class Tire {
	//基本常數
	static final double pi=3.14159;
	static final double inchToMeter=0.0254; //吋轉公尺
	static final int secondToMinute=60; //秒轉分鐘
	
	double width; //輪胎寬度
	double flatnessRatio;  //扁平比(%)
	double insideDiameter; //內徑(吋)
	private double ousideDiameter; //外徑(吋)

	
	//constructor
	Tire(double width,double ratio,double diameter){
		this.width=width*0.001;
		this.flatnessRatio=ratio*0.01;
		this.insideDiameter=diameter;
		calculateOutsideDiameter();
	}

	//計算外徑(公尺)
	private void calculateOutsideDiameter() {
		/*
		 * 外徑=內徑+2倍橡皮厚度
		 * 橡皮厚度=扁平比*寬度
		 */
		this.ousideDiameter=insideDiameter*inchToMeter+2*flatnessRatio*width;
	}
	
	//回傳輪胎周長(公尺)
	public double getPerimeter(){
		return ousideDiameter*pi;
	}
	

}
