package d0421;
//發出指定次數的聲響，並可重複執行

import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true){
			int d = 0;
			System.out.print("Key in a integer less than 10:");
			d=scan.nextInt();
	
			for(int i=0;i<d;i++){
				System.out.print('\u0007');
			}
			System.out.print("\n");
		}
	}
}
