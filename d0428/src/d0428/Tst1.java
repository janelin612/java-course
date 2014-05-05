package d0428;
//debug

class Tst { int i;static int j;}
public class Tst1 {
	static int j;
	int i;
	public static void main(String[] args) {
		int i=50;
		Tst T=new Tst();
		T.i=10;
		Tst1 T1=new Tst1();
		T1.i=20;
		Tst.j=30;
		Tst1.j=40;
		i=50;
		j=60;
		
	}

}
