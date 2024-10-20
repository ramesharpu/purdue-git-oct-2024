package basic;

public class HelloWorld {

	//from dev-1 (conflict mgt) + from dev-2 (conflict mgt-demo)
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	// from b1 branch | stash demo from dev1 + stash-demo-dev2
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
	
	//multiple commit demo
	public void m4() {
		int a = 5;
		int b = 10;
		int c = a + b;
		System.out.println("sum of the two numbers = " + c);
	}
	
	//amend demo
	public void m5() {
		int a = 10;
		int b = 6;
		int c = a - b;
		System.out.println("difference of two numbers = " + c);
	}
	
}
