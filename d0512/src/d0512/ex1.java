package d0512;
/*
 * 課本例題，用以測試this在建構子中的用法
 */

class Mynumber {
    private int n;

    public Mynumber(int i){this.n= i;}
    public Mynumber(int j, String s){this(j);}

    public int getnumber(){return n;} 
}

class ex1 {
    public static void main(String[] args) {
        Mynumber M = new Mynumber(10, "abcde");
        System.out.println("M.getnumber : " + M.getnumber());	
    }
}
