package d0428;
//debug

class Num{
	int n=0;
	void addN(int i){
		n+=i;
	}
	
	int getN(){
		return n;
	}
}

public class ObjectC {

	public static void main(String[] args) {
		
		Num N=new Num();
		N.addN(10);
		int kb=N.getN();

	}

}
