class Stack{
	
	int stck[] = new int[10];
	int tos=-1;
	
	void push(int element){
		tos++;
		if(tos>=10){
			System.out.println("Stack is full; Pop before pushing");	
		}
		else{
			stck[tos]=element;
		}
	}
	
	int pop(){
		if(tos<0){
			System.out.println("Stack is empty");
			return 0;
		}
		else{
			return stck[tos--];
		}
		
	}
	
	void printstck(){
		int i=tos;
		System.out.println("Stack elements are:");
		for(i=tos;i>0;i--){
			System.out.print(" "+stck[i]);
		}
		System.out.println("");
	}
	
	
}

class Ch6_05Stack{
 	public static void main(String args[]){
		Stack mystack = new Stack();
		int i=0;
		
		for(i=0;i<10;i++){
			mystack.push(i*i);
		}
		
		mystack.printstck();
		System.out.println("Popping stack:" +mystack.pop());
		System.out.println("Popping stack:" +mystack.pop());
		
		mystack.printstck();
		
		
	
 }
	
}