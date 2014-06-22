package finalProject;
/*
 * 齒輪組
 * 
 */
class GearBox {

	private double redcutionRatio;
	
	public GearBox(double ratio){
		this.redcutionRatio=ratio;
	}
	
	public double getReductionRatio(){
		return this.redcutionRatio;
	}
}


class CrankShaft extends GearBox{

	public CrankShaft(double ratio) {
		super(ratio);
	}

}

class WheelAxle extends GearBox{

	public WheelAxle(double ratio) {
		super(ratio);
	}

}