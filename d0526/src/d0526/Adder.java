package d0526;

import java.util.Stack;

public class Adder {
	/***************
	 * 字元與字串相加
	 * 二維陣列相加
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
	private void charAndStringOperator(char inputChar, String inputString) {
		char[] stringArray=inputString.toCharArray();
		final int stringLength=stringArray.length;	//獲得字串的字數
		char[] output=new char[stringLength+1];		//新增一個可以容納原本字串加一個字元的陣列
		
		output[0]=inputChar;
		for(int i=0;i<stringLength;i++){
			output[i+1]=stringArray[i];
		}
		
		System.out.println(output);
		
	}

	/*
	 * 分別在四個象限的值相加後
	 * 建立一個新的二維陣列實體
	 * 然後輸出
	 */
	private void twoDimArrayOperator(TwoDimArray a, TwoDimArray b) {
		int[] newElement = new int[4];
		for(int i=0;i<4;i++)
			newElement[i]=a.getElement(i)+b.getElement(i);
		
		new TwoDimArray(newElement[0],newElement[1],newElement[2],newElement[3]).print();
		
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
		new Complex(a.getReal()+b.getReal() , a.getImag()+b.getImag() ).print();
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
