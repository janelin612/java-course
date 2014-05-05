package d0310;
//將字串轉為ASCII碼及二進位表示
//僅支援轉換A-Z a-z 以及空白

public class showILoveYou {
			
	public static void main(String[] args){
		String st="I Love You";
		char ch[]=st.toCharArray(); //Break String to Char Array

		for (int i=0;i<ch.length;i++){
			int ASCII = (int)ch[i];
			System.out.println(ch[i]);
			System.out.println(ASCII);
			System.out.println(new Integer(ASCII).toBinaryString(ASCII));
			System.out.println("-----");
		}
	}
}
