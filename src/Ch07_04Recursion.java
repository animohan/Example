class Factorial{
	int fact(int n){
		int result;
		
		if(n==1){ 
			return 1;}
		else{
			result=fact(n-1)*n;
			return result;
		}
	}
	
}

class Fibonnaci{
		
	int fibo(int in){
		if (in==0)	return 0;
		if (in==1) return 1;
		else return (fibo(in-1)+fibo(in-2));
			
	}
}

class Ch07_04Recursion{
	public static void main(String args[]){
		
		Factorial f= new Factorial();
		System.out.println("Factorial of 3:"+ f.fact(3));
		System.out.println("Factorial of 4:"+ f.fact(4));
		System.out.println("Factorial of 5:"+ f.fact(5));
		
		Fibonnaci g = new Fibonnaci();
		int k=7;
		for (int i=0;i<k;i++){		
			System.out.println(+i+" Fibonnaci number is:"+g.fibo(i));
		}
		//for later: Think of way (Dynamic programming way) so that you are
		//calculating the value of the same fibonaccis again and again.
	}
	
}