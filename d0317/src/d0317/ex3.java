package d0317;
// 印出兩矩陣相加的結果
 
public class ex3 {

	public static void main(String[] args) {
		int b1[][]={{3,5,7},{5,3,1}},
			b2[][]={{2,4,8},{8,4,2}};	
		
		int ans[][];
		ans=new int[2][3];
		
		//b1+b2
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				ans[i][j]=b1[i][j]+b2[i][j];
			}
		}
		
		//output
		System.out.print("b1 \n");
		printTwoDimArray(b1);
		
		System.out.print("\nb2 \n");
		printTwoDimArray(b2);
		
		System.out.print("\nb1+b2 \n");
		printTwoDimArray(ans);
	}
	
	//將二維陣列印出來
	private static void printTwoDimArray(int[][] a){
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]);
				
				boolean isNotLast=(j<2);
				if(isNotLast)//避免最後多印一個逗號
					System.out.print(",");
				
			}
			System.out.print("\n");
		}
	}

}
