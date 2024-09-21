package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int fnum = 0;
		int snum = 1;
		int tnum ;
		
		System.out.println(fnum);
		
		for (int i = 1; i < 8; i++) {
			
			tnum = fnum+snum;
			fnum = snum;
			snum = tnum;
			
			System.out.println(fnum);
			
			
		}

	}

}
