package hw0_elisa_rosse;

public class CalculatorPrototype implements CalculatorIF{
	
	@Override
	public int sum(int m, int n) {
		int result = m;
		while (n!=0)
		{
			result+=1;
			n-=1;
		}
		return result;
	}
	
	@Override
	public int subtract(int m, int n){
		int result = m;
		while (n!=0)
		{
			result-=1;
			n-=1;
		}
		return result;
	}
	
	@Override
	public int divide(int m, int n) {
		int result = 0;
		while(m>0)// suffit si la division tombe juste
		{
			m-=n;
			result++;
		}
		if (m!=0) // si la division ne tombe pas juste ( reste!=0)
		{
			result-=1;
		}
		return result;
	}
	
	@Override
	public int multiply(int m, int n){
		int result = 0;
		while(n>0)
		{
			result+=m;
			n-=1;
		}
		return result;
	}
	
	

}
