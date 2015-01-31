package lib;

public class Calclation_lib {
	//	フィールドの定義
	private int m , n ;
	
	public Calclation_lib(int m,int n){
		this.m = m;
		this.n = n;
		
	}
	public int getPlus(){
		return m+n;
	}
    public int getMinus(){
    	return m-n;
    }
    public int getMultiple(){
    	return m*n;
    }
    public int getDivide(){
    	return m/n;
    }
}
