package d0526;

public class Adder {
	/***************
	 * 字元與字串相加
	 * 二微陣列相加
	 * 整數與實數相加
	 * 實數與整數相加
	 * 複數相加
	 * 遞增二
	 * 任意項數相加
	 ***************/
	
	
	private int i;
	private double d;
	
	private Complex complexA,complexB;
	
	
	//全部的建構子
	public Adder(char c,String s){
		charAndStringOperator(c,s);
	}
	public Adder(TwoDimArray a,TwoDimArray b){
		twoDimArrayOperator(a,b);
	}
	public Adder(int integer,double doub){
		intAndDoubleOperator(integer,doub);
	}
	public Adder(double doub,int integer){
		doubleAndIntOperator(doub,integer);
	}
	public Adder(Complex a,Complex b){
		complexOperator(a,b);
	}
	
	
	
	
	private void charAndStringOperator(char c, String s) {
		char[] stringArray=s.toCharArray();
		final int stringLength=stringArray.length;
		char[] output=new char[stringLength+1];
		
		output[0]=c;
		for(int i=0;i<stringLength;i++){
			output[i+1]=stringArray[i];
		}
		
		System.out.println(output);
		
	}

	private void twoDimArrayOperator(TwoDimArray a, TwoDimArray b) {
		int LU=a.getElement(0)+b.getElement(0);
		int RU=a.getElement(1)+b.getElement(1);
		int LD=a.getElement(2)+b.getElement(2);
		int RD=a.getElement(3)+b.getElement(3);
		
		TwoDimArray c=new TwoDimArray(LU,RU,LD,RD);
		
		c.print();
	}

	private void intAndDoubleOperator(int integer, double doub) {
		System.out.println(integer+doub);
		
	}

	private void doubleAndIntOperator(double doub, int integer) {
		System.out.println(integer+doub);
		
	}

	private void complexOperator(Complex a, Complex b) {
		Complex output=new Complex(a.getReal()+b.getReal() , a.getImag()+b.getImag() );
		output.print();
	}
		

}
