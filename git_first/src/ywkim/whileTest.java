package ywkim;

public class whileTest {

	public static void main(String[] args) {
		
		int i = 2; 
		int j = 1;
		
		while(i <= 9) {
			
			j = 1;  
			
			while(j <= 9) { 
				
				System.out.printf("%d x %d = %d", i, j, i*j);
				System.out.println();
				j++;  
				
			}
			
			System.out.println();
			
			i++; 
			
			
		}
	}
}


