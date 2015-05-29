class stringNum{
	String s;
	int i;
	
	stringNum(String s, int i){
		this.s=s;
		this.i=i;
	}
	
	stringNum duplicate_stringNum(stringNum A1){
		A1.s=this.s;
		A1.i=this.i;
		return A1;
	}
	
	
}
class Ch07_03ReturningObj{
	public static void main(String args[]){
		String H="hello"; 
		String W="World";
		stringNum A2=new stringNum(H,5);
		stringNum A3=new stringNum(W,20);
		
		System.out.println("Before values: String:"+ A2.s+" Integer:"+A2.i);
		A3.duplicate_stringNum(A2);
		System.out.println("Before values: String:"+ A2.s+" Integer:"+A2.i);
		
	}
	
}