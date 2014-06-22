package finalProject;
/*
 * 輪胎
 */
class Tire {
	double width;
	double flatnessRatio;
	double insideDiameter;
	private double ousideDiameter;
	static final double pi=3.14159;
	
	Tire(double width,double ratio,double diameter){
		this.width=width;
		this.flatnessRatio=ratio;
		this.insideDiameter=diameter;
		calculatorOutsideDiameter();
	}

	private void calculatorOutsideDiameter() {
		this.ousideDiameter=insideDiameter+2*flatnessRatio*width;
	}

	public double getPerimeter(){
		return ousideDiameter*pi;
	}
}
