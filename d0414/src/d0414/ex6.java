package d0414;
//while ver.

public class ex6 {

	public static void main(String[] args) {
		int i=1,j=1;
		while(i<10){
			while(j<10){
				System.out.print(i*j<10?("0"+i*j):i*j);
				System.out.print(" ");
				j++;
			}
			System.out.print("\n");
			j=1; //計數器執行完後歸位
			
			i++;
		}
			

	}

}
