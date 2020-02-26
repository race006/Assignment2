package labA2;

public class RecursiveMathLib extends MathLib 
{

	public RecursiveMathLib() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int gcd(int x, int y)
	{
		// TODO Auto-generated method stub
		if(y==0) 
		{
			return x;
		}
		else if(x >= y && x != 0) 
		{
			return gcd( y, x % y);
		}
		return 0;
	}

	@Override
	public int ack(int x, int y)
	{
		// TODO Auto-generated method stub
		if(x == 0) 
		{
			return y + 1;
		}
		else if(y == 0) 
		{
			return ack(x - 1, 1);
		}
		else if(x == 0 && y != 0) 
		{
			ack(x -1, ack(x, y - 1));
		}
		return 0;
	}

	@Override
	public int fib(int x) 
	{
		// TODO Auto-generated method stub
		if(x == 0) 
		{
			return 0;
		}
		else if(x == 1) 
		{
			return 1;
		}
		else if(x > 1) 
		{
			return fib(x - 1) + fib(x - 2);
		}
		return 0;
	}

	@Override
	public int hanoi(int n)
	{
		// TODO Auto-generated method stub
		if(n == 1) 
		{
			return 1;
		}
		else if(n > 1) 
		{
			return 2 * hanoi(n - 1) + 1;
		}
		return 0;
	}

}
