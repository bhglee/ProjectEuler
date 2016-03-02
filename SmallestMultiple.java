
public class SmallestMultiple {
	
	public static void main(String [] args) {
		
		int n = 1;
		while (n <= 1000000000){
			if (n % 20 == 0 && n % 19 == 0 && n % 18 == 0 && n % 17 == 0 && n % 16 == 0 && n % 15 == 0 && n % 14 == 0 && n % 13 == 0 && n % 12 == 0 && n % 11 == 0) {
		
			
			System.out.println(n);
			break;
		} else {
			n++;
		}
		
		}
	}

}
