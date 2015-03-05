class Box{
		double width;
		double height;
		double depth;	
}

class Ch6_01BoxDemo{
	public static void main(String args[]){
		Box mybox = new Box();
		double volume;
		
		mybox.width=10;
		mybox.height=10;
		mybox.depth=10;
		
		volume=mybox.width*mybox.height*mybox.depth;
		System.out.println("Volume= " +volume);
		
	}
	
}
