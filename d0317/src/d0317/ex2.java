package d0317;
/*
 * 取出四維陣列中，教授指定編號的格子內的值
 * 分別為第一格，第五格，第十八格跟最後一格
 * 由於教授未指定格內填的值，故選擇直接依編號填入
 */

public class ex2 {
	static long[][][][] fourDimArray;
	public static void main(String[] args) {
		fourDimArray = new long[3][3][2][2];

		setArrayElements();
		
		printChosenArrayElement(1);
		printChosenArrayElement(5);
		printChosenArrayElement(18);
		printChosenArrayElement(36);

	}
	
	//對陣列填值
	private static void setArrayElements(){
		long count=1;
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				for(int c=0;c<2;c++){
					for(int d=0;d<2;d++){
						fourDimArray[a][b][c][d]=count;
						count++;
					}
				}
			}
		}
	}

	//印出指定編號的陣列元素值
	private static void printChosenArrayElement(int n){
		int a=0,b=0,c=0,d=0;
		n--; 				//陣列編號從零開始
		
		//以下將指定編號換算為四維陣列的座標
		a=n/12; 			//12=3x2x2
		b=(n%12)/4; 		//4=2x2
		c=((n%12)%4)/2;
		d=((n%12)%4)%2;
		
		System.out.println(fourDimArray[a][b][c][d]);
	}
	
}