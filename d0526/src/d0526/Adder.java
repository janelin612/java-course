package d0526;

import java.util.Stack;

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
	public Adder(Stack stack){
		stackOperator(stack);
	}
	
	
	/*
	 * 將字串打散成字元陣列後
	 * 開一個新的陣列將字元跟原本的字元陣列結合
	 * 然後輸出
	 */
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

	/*
	 * 分別在四個象限的值相加後
	 * 建立一個新的二微陣列實體
	 * 然後輸出
	 */
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

	/*
	 * 分別各自取出實部虛部
	 * 然後輸出
	 */
	private void complexOperator(Complex a, Complex b) {
		Complex output=new Complex(a.getReal()+b.getReal() , a.getImag()+b.getImag() );
		output.print();
	}
	
	/*
	 * 任意項加總
	 * 將原先推入的元素一個一個推出後加總
	 * 然後輸出
	 */
	private void stackOperator(Stack stack) {
		final int  stackSize=stack.size();
		double sum=0;
		double item=0;
		for(int i=0;i<stackSize;i++){
			item=(double) stack.pop();
			sum+=item;
		}
		
		System.out.println(sum);
	}
		

}
