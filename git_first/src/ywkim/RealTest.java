package ywkim;

public class RealTest {

	public static void main(String[] args) {


		int i = 1; 
		int j = 1;
		
		while(i <= 9) { // 1부터 9까지 
			
			j = 1; // 1*1 2*1 3*1 되기위함?
			
				
				System.out.printf("%d x %d = %d", i, j, i*j); 
				System.out.println();
				j++; // 9까지 증감 
				
			}
			
			System.out.println();
			
			i++; // 9까지 증감
			
		
		}
	}
	



