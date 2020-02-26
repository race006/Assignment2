package labA2;

public class Driver {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MathLib recursiveMathLib = new RecursiveMathLib();
		MathLib iterationMathLib = new IterationMathLib();
		System.out.println("---Recursion Test ---");
		runTests(recursiveMathLib);
		System.out.println("\n---Iteration Test ---");
		runTests(iterationMathLib);
	}
	private static void runTests(MathLib mathLibrary) 
	{
		System.out.println("gcd(4,2) = "+ mathLibrary.gcd(4, 2));
		System.out.println("ack(2, 4) = "+ mathLibrary.ack(2,  4));
		System.out.println("fib(5) = "+ mathLibrary.fib(5));
		System.out.println("hanoi(3) = "+ mathLibrary.hanoi(3));
	}

}
