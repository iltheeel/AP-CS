
public class eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eggs = 1;
		boolean found = false; 
		while (!found) {
			if(eggs%2 ==1) {
				if(eggs%3 ==0) {
					if(eggs%4 ==1) {
						if (eggs%5 ==4) {
							if(eggs%6 ==3) {
								if(eggs%7==0) {
									if(eggs%8==1) {
										if(eggs%9 ==0) {
											found = true;
											System.out.println(eggs);
										
										}
									}
								}
							}
						}
					}
				}
			}
			eggs++;
		}
	}

}
