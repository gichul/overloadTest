package handong.edu.csee.java.overloadTest;
// TODO Auto-generated method stub
public class overloadExample {

	public static void main(String[] args) 
	{
		double average1 = overloadExample.getAverage(35, 321);
		double average2=overloadExample.getAverage(32, 32);
		char average3 = overloadExample.getAverage('a','b');
	
		
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);
		
		
	}
	
	
	
	
	
	public static double getAverage(double first, double second)
	{
		return (first+second)/2;
	}
	
	
	public static double getAverage(int first, int second)
	{
		return (first+second)/2;
		
	}
	public static char getAverage(char first, char second)
		{
			return (char)(((int)first+(int)second)/2);
			
		}

}
