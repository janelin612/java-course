package finalProject;
/*
 * 六檔變速箱
 */
class Transmission {
	GearBox[] gearBox;
	int chosenGear;

	public Transmission(){
		gearBox=new GearBox[7];
		gearBox[0]=new GearBox(0);
		gearBox[1]=new GearBox(2.6);
		gearBox[2]=new GearBox(1.789);
		gearBox[3]=new GearBox(1.409);
		gearBox[4]=new GearBox(1.160);
		gearBox[5]=new GearBox(1.000);
		gearBox[6]=new GearBox(0.892);
	}
	
	public double getReductionRatio(int number){
		return gearBox[number].getReductionRatio();
	}
	public void setChosenGear(int i){
		this.chosenGear=i;
	}
	
}
