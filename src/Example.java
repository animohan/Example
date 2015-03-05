class Exmaple{
	public static void main(String args[]){
		//Simple Hello World Program
		System.out.println("Hello World ");
		
		// Number assignment
		double pi=3.141;
		System.out.println("The value of Pi is: " +pi);
		
		//Control statement:
		if(pi>3.141){
			System.out.println("Pi is greater than 3");
		}
		else if(pi==3.141){
			System.out.println("Pi=3.141");
		}
		else{
			System.out.println("Pi is less than 3");
		}
		
		//loops
		int counter=0;
		for(counter=0;counter<10;counter++){
			System.out.print(" " +counter);
		}
		System.out.print("");
		counter=0;
		
		while(counter<10)
		{
			System.out.print(" " +counter);
			counter++;
		}
			
		
	}
}