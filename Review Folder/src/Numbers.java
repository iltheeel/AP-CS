
public class Numbers {
	public static void main(String[] args) {
		// System.out.println(isGoofy(12));
		// System.out.println(isGoofy(15));
		// System.out.println(isGoofy(26));
		// System.out.println(isGoofy(8));
		// System.out.println(isGoofy(1234));
		System.out.println(getSomeGoofyNumbers(1));
	}

	/**
	 * @param num
	 *            is a positive non-decimal value
	 * 
	 *            Precondition : num >= 0
	 * 
	 * @return true if the sum of digit divisors of num is odd
	 * 
	 * @return false if the sum of the digit divisors of num is even
	 * 
	 */

	public static boolean isGoofy(int num)

	{
		int goofsum = 0;
		int orig = num;
		while (num > 0) {
			int gooftest = num;
			while (gooftest > 10) {
				gooftest = num % 10;
			}
			if (orig % gooftest == 0)
				goofsum = gooftest + goofsum;
			num = (num - gooftest) / 10;
		}

		if (goofsum % 2 == 0) return false;
			return true;
		
	}

	/*
	 * @param count is a positive non-decimal value
	 * 
	 * Precondition : count > 0
	 * 
	 * @return an array containing count Goofy numbers
	 * 
	 */

	public static int[] getSomeGoofyNumbers(int count)

	{
		int goofs = 0;
		int[] goofy = { 1, 2, 3 };
		for (int i = 0; goofs < count; i++) {
			if (isGoofy(i)) {
				goofy[goofs] = i;
				goofs++;
			}
		}
		return goofy;

	}
}
