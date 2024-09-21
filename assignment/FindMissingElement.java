package week1.assignment;

import java.util.Arrays;
import java.util.Iterator;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int a[] = {1,4,3,2,8,6,7};
		
		Arrays.sort(a);
		
		int n = a.length + 1;
		
		int sum = (n*(n+1))/2;
		
		for (int i = 0; i < a.length; i++) {
			
			sum = sum -a[i];
				
			}
			
		System.out.println("The Missing Element is : " +sum);
		

	}

}
