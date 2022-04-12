package ClassandObject;

public class Overload {
	//function with no argument
	//1/2+1/3+1/4+1/5+....1/10 series sum
	//0.5+0.3333+0.25+
	void series()
	{
	
	
		float s=0;
		for(int i=2;i<=10;i++)
		{
			s=s+((float)1/i); //0.5
		}
			
		System.out.println("sum="+s);
	}

	//function with one arg
	//1.8,27,64,125
	//0,7,26,63,124...
	void series (int p)
	{
		int cube=0;
		for(int i=1;i<=p;i++)
		{
			cube=(i*i*i)-1;
			System.out.println(cube+"  ,");
		}}
		void series(int x, int n)
		{
			float s=0;
			for(int i=1;i<=n;i++)
			{
				s=(float)  (s+Math.pow(x, i));
			
			}
			System.out.println("sum="+s);
		}
	
	
	public static void main(String[] args)
	{
		Overload ob= new Overload();
		ob.series(8);
		ob.series();
		ob.series(2, 5);
	
	}
}
		