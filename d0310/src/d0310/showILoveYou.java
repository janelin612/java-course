package d0310;
//將字串轉為ASCII碼及二進位表示

public class showILoveYou {
			
	public static void main(String[] args){
		String st="I Love You";
		char ch[]=st.toCharArray(); //Break String to Char Array

		for (int i=0;i<ch.length;i++){
			int ASCII = (int)ch[i];
			System.out.println(ch[i]); 							//印出字元
			System.out.println(ASCII); 							//印出字元的ascii code
			System.out.println(Integer.toBinaryString(ASCII));	//印出ascii code的二進位形式
			System.out.println("-----");
		}
	}
}
