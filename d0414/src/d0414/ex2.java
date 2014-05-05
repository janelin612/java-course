package d0414;
//印出V字形

public class ex2 {

	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				
				//左半邊有規律 右半邊只能直接輸入
				boolean isV=(i==(j*2-1)|i==7&j==6|i==5&j==7|i==3&j==8|i==1&j==9);
				
				if(isV) 
					System.out.print(i*j<10?("0"+i*j):i*j);
				else
					System.out.print("--");
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
