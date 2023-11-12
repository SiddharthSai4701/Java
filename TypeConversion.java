/**/
class TypeConversion
{
	public static void main(String[] args)
	{
		// int a = 5;
		// float b;
		// b = a;
		// System.out.println(b);
		
		// int a;
		// float b = 2.5f;
		// a = b; // Gives an error. Explicit type conversion required from float to int but not from int to float
		// a = (int)b;
		// System.out.println(a);
		
		
		// int a;
		// char c = 'm';
		// a = (int) c;
		// System.out.println(a); // Prints the ascii value of m which is 109
		
		// int a;
		// char c = '5';
		// a = (int) c;
		// System.out.println(a); // Prints the ascii value of 5 which is 53
		
		// int a;
		// String s = "6";
		// a = (int)s;
		// System.out.println(a); //Error
		
		int a;
		String s = "6";
		String s2 = "65.43";
		a = Integer.parseInt(s);
		float b = Float.parseFloat(s);
		System.out.println(a); //Prints 6
		System.out.println(b); //Prints 6.0
	}
}