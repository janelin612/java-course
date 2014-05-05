package d0317;
/*
 * 取出四維陣列中，教授指定編號的格子內的值
 * 分別為第一格，第五格，第十八格跟最後一格
 * 由於教授未指定格內填的值，故選擇直接依編號填入
 */

public class ex2 {

	public static void main(String[] args) {
		long[][][][] fourDimArray;
		fourDimArray = new long[3][3][2][2];

		setArrayElements(fourDimArray);
		
		printChosenArrayElement(fourDimArray,1);
		printChosenArrayElement(fourDimArray,5);
		printChosenArrayElement(fourDimArray,18);
		printChosenArrayElement(fourDimArray,36);

	}
	
	//對陣列填值
	private static void setArrayElements(long[][][][] array){
		long count=1;
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				for(int c=0;c<2;c++){
					for(int d=0;d<2;d++){
						array[a][b][c][d]=count;
						count++;
					}
				}
			}
		}
	}

	private static void printChosenArrayElement(long[][][][] array,int n){
		int a=0,b=0,c=0,d=0;
		n--; 				//陣列編號從零開始
		
		//以下將指定編號換算為四維陣列的座標
		a=n/12; 			//12=3x2x2
		b=(n%12)/4; 		//4=2x2
		c=((n%12)%4)/2;
		d=((n%12)%4)%2;
		
		System.out.println(array[a][b][c][d]);
	}
	
}