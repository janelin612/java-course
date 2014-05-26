package d0526;
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
	
	public int getElement(int i){
		return element[i];
	}
	
	public void print(){
		System.out.println(element[0]+" "+element[1]+"\n"+element[2]+" "+element[3]);
	}
}
