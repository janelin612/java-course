package d0421;
//發出指定次數的聲響，並可重複執行

import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true){
			String input;
			System.out.print("請輸入一到三之間的數字:");
			
			input=scan.next();
			if(input.equals("1")||input.equals("2")||input.equals("3")){
				//將輸入字串轉字元陣列後取第一個元素，並配合ASCII code進行偏移
				int times=(int)input.toCharArray()[0]-'0';
				
				for(int i=0;i<times;i++){
					System.out.print('\u0007');
				}
				System.out.print("\n");
			}
			else{
				System.out.println("範圍錯誤 請重新輸入");
			}
		}
	}
}
