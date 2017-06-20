import java.util.*;
public class testingrunner {
	public static void change (int one, int two) {
		one = 10;
		two = 9;
		
	}
	public static void main (String[] args) {
		String a = "apples";
		String b = "bagels";
		int i = 9;
		int j = 10;
		Integer ii = 4;
		Integer jj = 20;
		
		List ray = new ArrayList();
		ray.add(i);
		ray.add(a);
		
		i =ii;
		ii=jj;
		jj=i;
		
		change(i,j);
		Scanner read = new Scanner("A E I O U");
		
		ArrayList<String> aa= new ArrayList<String>();
		while(read.hasNext()){
		aa.add(read.next());
		}
		
		
		System.out.println(aa);
		System.out.println(b);
		System.out.println(i);
		System.out.println(j);
		System.out.println(ii);
		System.out.println(jj);
		System.out.println(ray);
	}
}
