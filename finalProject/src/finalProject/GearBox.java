package finalProject;
/*
 * 齒輪組
 * 以及其子類別
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

//曲軸
class CrankShaft extends GearBox{

	public CrankShaft(double ratio) {
		super(ratio);
	}

}

//後輪軸
class WheelAxle extends GearBox{

	public WheelAxle(double ratio) {
		super(ratio);
	}

}

//六速變速箱
class Transmission {
	private GearBox[] gearBox;
	private int chosenGear;

	public Transmission(){
		chosenGear=0; //預設為空檔
		gearBox=new GearBox[7];
		gearBox[0]=new GearBox(0);
		gearBox[1]=new GearBox(2.6);
		gearBox[2]=new GearBox(1.789);
		gearBox[3]=new GearBox(1.409);
		gearBox[4]=new GearBox(1.160);
		gearBox[5]=new GearBox(1.000);
		gearBox[6]=new GearBox(0.892);
	}
	
	//回傳選定檔位的減速比
	public double getReductionRatio(){
		return gearBox[chosenGear].getReductionRatio();
	}
	
	public void setChosenGear(int i){
		this.chosenGear=i;
	}
	
}