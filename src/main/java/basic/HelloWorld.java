package basic;

public class HelloWorld {
	//from dev-2 (conflict mgt-demo)
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	// from b1 branch
	public void m1() {
		System.out.println("from m1");
	}

	// from b11 branch + dev-1 changes
	public void m2() {
		System.out.println("from m2");
	}

	// from b111 branch + dev-1 changes
	public void m3() {
		System.out.println("from m2");
	}
}
