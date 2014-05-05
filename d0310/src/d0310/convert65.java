package d0310;
//字元轉換

public class convert65 {
	static int a=65;
	public static void main(String[] args){
		System.out.println(a+":");
		System.out.println(new Integer(a).toBinaryString(a)); //二進位
		System.out.println(new Integer(a).toOctalString(a));  //八進位
		System.out.println("0x"+new Integer(a).toHexString(a));  //十六進位
		System.out.println("\'\\u"+new Integer(a).toHexString(a)+"\'"); //Unicode
	}

}
