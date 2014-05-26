package d0526;

import java.util.Scanner;

//自定義的陣列資料結構
public class TwoDimArray {
	private int[] element;
	
	public TwoDimArray(int leftUp,int rightUp,int leftDown,int rightDown){
		element=new int[4];
		element[0]=leftUp;
		element[1]=rightUp;
		element[2]=leftDown;
		element[3]=rightDown;
	}
	public TwoDimArray(){
		element=new int[4];
		for(int i=0;i<4;i++)
			element[i]=0;
	}
	
	
	public int getElement(int i){
		return element[i];
	}
	
	public void print(){
		System.out.println(element[0]+" "+element[1]+"\n"+element[2]+" "+element[3]);
	}
	
	public void initial(){
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<4;i++ ){
			System.out.print("請輸入第"+(i+1)+"個值");
			element[i]=scan.nextInt();
		}
	}
}
