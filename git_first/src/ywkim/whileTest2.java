package ywkim;

public class whileTest2 {

	public static void main(String[] args) {
		
		int i = 2;
		int j = 1;
		
		while(i <= 9) {
			
			if(i == 3) if(j == 1) {
                System.out.println("<3´Ü>");
             }
             if(i == 5) if(j == 1) {
                System.out.println("<5´Ü>");
             }
		
			
			System.out.printf("%d x %d = %d", i, j, i*j);
			System.out.println();
			
			
			j++;
			if(j > 9) { 
				i++; 
				j = 1; 
				System.out.println();
				
		}	
		}

		}
}
