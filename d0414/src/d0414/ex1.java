package d0414;
//只印出對角線

public class ex1 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				boolean isDiagonal=(i==j|i+j==10); //封裝判斷式
				
				if(isDiagonal)
					System.out.print(i*j<10?("0"+i*j):i*j); //如果小於十，前方補零以方便對齊
				else
					System.out.print("--");
				
				System.out.print(" ");
				
			}
			System.out.print("\n");

		}
	}

}
