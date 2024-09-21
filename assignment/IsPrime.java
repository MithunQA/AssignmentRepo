package week1.assignment;

public class IsPrime {

	public static void main(String[] args) {
		
		int num = 15;
		
		for (int i = 2; i < num; i++) {
			
			if (num%i == 0) {
				
				System.out.println("It is not a Prime number : " +num);
				
				return;
				
			}

		}
		
		System.out.println("It is a Prime number : " +num);
		
		
		
		

	}

}
