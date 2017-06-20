//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14d {
	public static void main(String args[]) {
		// add test cases
		Grades test = new Grades();
		float[] nums = { 100, 90, 85, 72.5f, 95.6f };
		test.setGrades(5, nums);
		System.out.println(test);
		float[] num = { 50.0f, 100.0f, 80.0f };
		test.setGrades(3, num);
		System.out.println(test);
		float[] nu = { 93.4f, -90.0f, 90.0f };
		test.setGrades(3, nu);
		System.out.println(test);
		float[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		test.setGrades(9, n);
		System.out.println(test);

	}

}