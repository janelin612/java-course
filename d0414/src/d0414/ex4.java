package d0414;
//浮點數版本

public class ex4 {
	final static double smallNum=0.00000001; //防止浮點數誤差
	
	public static void main(String[] args) {	
		for(float i=1.1f ; i-2<smallNum ; i+=0.1){
			for(float j=1.1f ; j-2<smallNum ; j+=0.1){
				System.out.printf("%.2f",i*j); //無條件捨去印出兩位小數
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}

}
