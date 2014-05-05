package d0428;
//debug

class Number{
	static int n=0;
	static void addN(int i){
		n+=i;
	}
	static int getN(){
		return n;
	}
}
public class ObjB {

	public static void main(String[] args) {
		Number.addN(10);
		Number.getN();
		Number.n=20;

	}

}
