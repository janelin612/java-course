package d0317;

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
		printTwoDimArray(b1,2,3);
		
		System.out.print("\nb2 \n");
		printTwoDimArray(b2,2,3);
		
		System.out.print("\nb1+b2 \n");
		printTwoDimArray(ans,2,3);
	}
	
	//將二維陣列印出來
	private static void printTwoDimArray(int[][] a,int x,int y){
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				System.out.print(a[i][j]);
				if(j<y-1)//避免最後多印一個逗號
					System.out.print(",");
			}
			System.out.print("\n");
		}
	}

}
