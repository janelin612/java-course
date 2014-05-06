package d0310;
//字元轉換

public class convert65 {
	static int a=65;
	public static void main(String[] args){
		System.out.println(a+":");

		System.out.println(Integer.toBinaryString(a)); //二進位
		System.out.println(Integer.toOctalString(a));  //八進位
		System.out.println("0x"+Integer.toHexString(a));  //十六進位
		System.out.println("\'\\u"+Integer.toHexString(a)+"\'"); //Unicode
	}

}
