class dualNumber {
	int a, b;

	dualNumber(int a, int b) {
		this.a = a;
		this.b = b;
	}

	/*
	 * dualNumber(double a, double b){ this.a=a; this.b=b; } #Need to check how
	 * to fix typecasting here.
	 */
	dualNumber(int a) {
		this.a = a;
		this.b = a;
	}

	// # Note how the the object itself is referenced as a parameter to the
	// # to the class function.
	boolean dualTest(dualNumber n1) {
		if ((this.a == n1.a) && (this.b == n1.b))
			return true;
		else
			return false;

	}

}

class Ch07_02ObjAsParam {
	public static void main(String args[]) {

		// # tests object overloading and the object passing as parameter.
		dualNumber num1 = new dualNumber(15);
		dualNumber num2 = new dualNumber(15, 15);

		System.out.println(num1.dualTest(num2));

		// # showing that the else side of the loop works as well for mismatch.
		dualNumber num3 = new dualNumber(15, 16);
		dualNumber num4 = new dualNumber(15, 15);

		System.out.println(num3.dualTest(num4));

	}

}