//It picks up box's defintion from 01Boxdemo

class Ch6_02BoxDemo{
	public static void main(String args[]){
		Box mybox = new Box();
		double volume;
		
		mybox.width=10;
		mybox.height=10;
		mybox.depth=10;
		
		volume=mybox.width*mybox.height*mybox.depth;
		System.out.println("Volume of Box 1 = " +volume);
		
		Box mybox2 = new Box();
	
		
		mybox2.width=20;
		mybox2.height=20;
		mybox2.depth=20;
		
		volume=mybox2.width*mybox2.height*mybox2.depth;
		System.out.println("Volume of Box 2 = " +volume);
		
	}
	
}
