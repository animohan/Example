//introduction of object methods
class Box3{
	double width, height, depth;
	
	void setBox3vals(){
		this.width=0;
		this.height=0;
		this.depth=0;
	}
	
	void setBox3vals(double width, double height, double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	void getBox3volume(){
		System.out.println("Volume = " + width*height*depth);
		
	}
	
	void getBox3SurfaceArea(){
		System.out.println("Surface Area = " + 2*(width*height+height*depth+depth*width));
	}
	
}


class Ch6_03BoxDemo{
	public static void main(String args[]){
		Box3 myBox1 = new Box3();
		
		//set default values to object variables
		myBox1.setBox3vals();
		myBox1.getBox3volume();
		myBox1.getBox3SurfaceArea();
		
		Box3 myBox2 = new Box3();
		//uses method to set values to object variables
		myBox2.setBox3vals(2,2,3);
		myBox2.getBox3volume();
		myBox2.getBox3SurfaceArea();
		
		
		Box3 myBox3 = new Box3();
		//sets values to object variables directly
		myBox3.width=5;
		myBox3.height=5;
		myBox3.depth=5;
		myBox3.getBox3volume();
		myBox3.getBox3SurfaceArea();
		

	}
	
}
