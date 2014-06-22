package finalProject;
/*
 * 齒輪組
 * 
 */
class GearBox {

	double redcutionRatio;
	int drivingGearTooth;
	int passiveGearTooth;
	
	public GearBox(double ratio){
		this.redcutionRatio=ratio;
	}
	public GearBox(int driving,int passive){
		this.drivingGearTooth=driving;
		this.passiveGearTooth=passive;
		this.redcutionRatio= (double)passive / (double)driving;
	}
	
	public void setReductionRatio(double ratio){
		this.redcutionRatio=ratio;
	}
	public double getReductionRatio(){
		return this.redcutionRatio;
	}
}
