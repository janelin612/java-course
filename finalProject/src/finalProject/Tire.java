package finalProject;
/*
 * 輪胎
 */
class Tire {
	double width;
	double flatnessRatio;  //扁平比(%)
	double insideDiameter; //內徑(吋)
	private double ousideDiameter; //外徑(吋)
	static final double pi=3.14159;
	static final double inchToMeter=0.0254;
	static final int secondToMinute=60;
	
	Tire(double width,double ratio,double diameter){
		this.width=width*0.001;
		this.flatnessRatio=ratio*0.01;
		this.insideDiameter=diameter;
		calculatorOutsideDiameter();
	}

	//外徑(公尺)
	private void calculatorOutsideDiameter() {
		this.ousideDiameter=insideDiameter*inchToMeter+2*flatnessRatio*width;
	}
	
	//周長(公尺)
	public double getPerimeter(){
		return ousideDiameter*pi;
	}
	

}
