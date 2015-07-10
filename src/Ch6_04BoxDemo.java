//introduction to Constructors
class Box4 {
	double width, height, depth;

	// constructor for no initialized variable
	Box4() {
		this.width = 0;
		this.height = 0;
		this.depth = 0;
	}

	// constructor with double/float
	Box4(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// constructor with integer
	Box4(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	double getVolume() {
		return width * height * depth;

	}

	double getSurfaceArea() {
		return 2 * (width * height + height * depth + depth * width);
	}

}

class Ch6_04BoxDemo {
	public static void main(String args[]) {
		Box4 myBox1 = new Box4();
		System.out.println("Surface Area = " + myBox1.getSurfaceArea());
		System.out.println("Volume = " + myBox1.getVolume());

		Box4 myBox2 = new Box4(2, 2, 2);
		System.out.println("Surface Area = " + myBox2.getSurfaceArea());
		System.out.println("Volume = " + myBox2.getVolume());

		Box4 myBox3 = new Box4(0.5, 0.5, 0.5);
		System.out.println("Surface Area = " + myBox3.getSurfaceArea());
		System.out.println("Volume = " + myBox3.getVolume());

	}

}