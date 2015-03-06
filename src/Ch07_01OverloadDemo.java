class OverloadDemo{
	void test(){
		System.out.println("Hello OverloadDemo with no parameters");
	}
	
	void test(int a){
		System.out.println("Hello OverloadDemo with one parameter " +a);
	}
	
	void test(int a, int b){
		System.out.println("Hello OverloadDemo with two parameters " +a +"and" +b); 
	}
}

class Ch07_01OverloadDemo{
	public static void main(String args[]){
		
		OverloadDemo demo1 = new OverloadDemo();
		demo1.test();
		demo1.test(15);
		demo1.test(15,30);
		
	}
}