package d0428;
//debug

public class ObjA {

	public static void main(String[] args) {
		int k;
		Study2 Lily= new Study2();
		Study2 john=new Study2();
		Lily.addCredit(65);
		k=john.totalCredit();
		
	}

}
class Study2{
	private int credit=0;
	
	public void addCredit(int c){
		this.credit+=c;
	}
	public int totalCredit(){
		return this.credit;
	}
}