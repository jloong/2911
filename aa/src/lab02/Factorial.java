package lab02;

import java.math.BigInteger;

public class Factorial
{
	int	n;
	
	public Factorial (int n)
	{
		this.n = n;
	}
	
	public int asInt ()
	{
		int result = 1;
		for (int i = 2; i <= n; ++i)
			result *= i;
		return result;
	}
	
	public long asLong ()
	{
		long result = 1;
		for (int i = 2; i <= n; ++i)
			result *= i;
		return result;
	}
	
	public float asFloat ()
	{
		float result = 1;
		for (int i = 2; i <= n; ++i)
			result *= i;
		return result;
	}
	
	public double asDouble ()
	{
		double result = 1;
		for (int i = 2; i <= n; ++i)
			result *= i;
		return result;
	}
	
	public BigInteger asBigInteger ()
	{
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= n; ++i)
			result = result.multiply (BigInteger.valueOf (i));
		return result;
	}
}
