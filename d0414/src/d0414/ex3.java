package d0414;
//九等分

public class ex3 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.print(i+"x"+j+"=");
				System.out.print(i*j<10?("0"+i*j):i*j);
				
				if (j%3==0)
					System.out.print(" |");
				
				System.out.print(" ");
			}
			System.out.print("\n");
			
			if (i%3==0)
				System.out.println("--------------------------------------------------------------------");
		}
	}

}
