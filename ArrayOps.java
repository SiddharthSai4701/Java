/**/
import java.util.Arrays; // Java contains a package called util which contains the class Arrays. We are importing that class
class ArrayOps
{
	public static void main(String[] args)
	{
		// int[] marks = {2,7,5,4,8};
		// String mStr = Arrays.toString(marks);
		// System.out.println(mStr);
		
		// int[] marks = {2,7,5,4,8};
		// Arrays.sort(marks); // Performs IN PLACE sorting
		// String mStr = Arrays.toString(marks); //Converts the array elements from integers to strings
		// System.out.println(mStr); 
		
		// int[] marks = {2,7,5,4,8};
		// Arrays.fill(marks,6);
		// String mStr = Arrays.toString(marks);
		// System.out.println(mStr);
		
		// int[] marks = {2,7,5,4,8};
		// int[] marksCopy;
		// marksCopy = Arrays.copyOf(marks,3); // First argument: array name; Second argument: number of elements to copy
		// marksCopy = Arrays.copyOf(marks,8); // Since marks only has 5 elements, the remaining three elements in marksCopy will be set to the default value 0 
		// String mStr = Arrays.toString(marksCopy);
		// System.out.println(mStr);
		
		
		int[] marks = {2,7,5,4,8};
		int[] marksCopy;
		marksCopy = Arrays.copyOfRange(marks,1,4); // First argument: array name; Second argument: first index to copy from(inclusive); Third argument: last index to copy from(exclusive)	
		String mStr = Arrays.toString(marksCopy);
		System.out.println(mStr);
		
	}
}