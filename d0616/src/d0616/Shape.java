package d0616;


public abstract class Shape implements Area,Perimeter{
	double[] center;
	
	public Shape(){
		center = new double[2];
		center[0]=0;
		center[1]=0;
	}
	
}
