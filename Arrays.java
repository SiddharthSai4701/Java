/**/
class Arrays
{
	public static void main(String[] args)
	{
		// int[] rainfall = {25,33,12,14,56,27,89};
		// rainfall[2] = 2;
		// System.out.println(rainfall[2]);
		
		int[] squares = new int[10];
		squares[0] = 1;
		squares[1] = 4;
		squares[2] = 9;
		squares[3] = 16;
		
		// System.out.println(squares[5]);
		
		// for(int i=0;i<4;i++)
		// {
			// System.out.println(squares[i]);
		// }
		
		// int n,x;
		
		// for(x=4;x<10;x=x+1)
		// {
			// n = x+1;
			// squares[x] = n*n;
			// System.out.println(squares[x]);
		// }
		
		int n,x;
		
		for(x=0;x<10;x=x+1)
		{
			n = x+1;
			squares[x] = n*n;
			System.out.println(squares[x]);
		}
		
		
	}
}