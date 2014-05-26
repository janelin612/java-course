package d0526;
//自定義的陣列資料結構
public class twoDimArray {
	private int LU,RU,LD,RD;
	
	public twoDimArray(int leftUp,int rightUp,int leftDown,int rightDown){
		LU=leftUp;
		RU=rightUp;
		LD=leftDown;
		RD=rightDown;
	}
	
	public int getElement(int i){
		switch(i){
		case 0:
			return LU;
		case 1:
			return RU;
		case 2:
			return LD;
		case 3:
			return RD;
		}
		return 0;
	}
	
	public void print(){
		System.out.println(LU+" "+RU+"\n"+LD+" "+RD);
	}
}
