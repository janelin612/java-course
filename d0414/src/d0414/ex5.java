package d0414;
//9~1乘法表

public class ex5 {
	
	public static void main(String[] args) {
		for(int i=9;i>0;i--){
			for(int j=9;j>0;j--){
				System.out.print(i*j<10?("0"+i*j):i*j);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
