package d0317;
//印出教授指定的字

public class ex1 {
	public static void main(String[] args) {
		char[][] c={{'張','林','王'},{'陳','李'}};
		String s[][]={{"圓圓","oo"},{"園園","洞洞","靈玲"}};
		System.out.print("祝\"");
		System.out.print(c[1][0]+s[0][0]);
		System.out.print("\"漂亮，\\");
		System.out.print(c[0][1]+s[1][2]);
		System.out.print("\\快樂。\n");
	}
}