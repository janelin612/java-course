package d0414;
/*
 * 九九乘法表最原始版本
 * 保留此檔案供後續其他作業複製
 */

public class ex0 {

	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				System.out.print(i*j<10?("0"+i*j):i*j); //如果小於十，前方補零以方便對齊
				System.out.print(" ");
			}
			System.out.print("\n"); //印一排後換行
		}
	}

}
