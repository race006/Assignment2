package labA2;

public class IterationMathLib extends MathLib 
{

	public IterationMathLib() 
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public int gcd(int x, int y) 
	{
		// TODO Auto-generated method stub
		if(!(x == 0 || y == 0)) 
		{
			for(int a = x; a > 0; a--) 
			{
				if(x % a == 0 && y % a == 0) 
				{
					return a;
				}
			}
		}
		return x + y;
	}

	@Override
	public int ack(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int fib(int x) 
	{
		// TODO Auto-generated method stub
		int fib1 = 0, fib2 = 1, n = 0;
		for(int a = 0; a < x; a++) 
		{
			n = fib1 + fib2;
			fib1 = fib2;
			fib2 = n;
		}
		return fib1;
	}

	@Override
	public int hanoi(int n) 
	{
		// TODO Auto-generated method stub
		int increment = 2;
		for(int x = 1; x < n; x++) 
		{
			increment *= 2;
		}
		return increment-1;
	}

}
