class TestStudent
{
	// Creating objects
	// public static void main(String[] args)
	// {
		// Student stud1 = new Student();  // stud1 is a reference variable referring to one object of the student class; new keyword allocates space for the new object to be created; stud1 is not an object of the student class. It only holds the reference of the new object created.
		Student stud2 = new Student(); 
		// Student stud2 = stud1;
		// System.out.println("stud1 contains "+stud1);
		// System.out.println("stud2 contains "+stud2);
	// }
	
	
	// Instance fields
	public static void main(String[] args)
	{
		Student stud1 = new Student();  // stud1 is a reference variable referring to one object of the student class; new keyword allocates space for the new object to be created; stud1 is not an object of the student class. It only holds the reference of the new object created.
		System.out.println("stud1 roll no is "+stud1.roll_no); // If roll_no is not initialised, it will get automatically initialised by the constructor to the default value of 0
		System.out.println("stud1 name is "+stud1.name); // If name is not initialised, it will get automatically initialised by the constructor to the default value of null
	}
	
}