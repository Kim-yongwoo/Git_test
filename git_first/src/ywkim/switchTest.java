package ywkim;

import java.util.Scanner;

public class switchTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // 이건 외워라
		int a; // --?
		
		
			System.out.printf("1~4중에 선택하세요 : ");
			a = s.nextInt();
			
			switch (a) {
			case 1:
				System.out.printf("1을 선택했다\n");
				break; // 이 이유가 뭐엿더라>?
			case 2: 
				System.out.printf("2를 선택했다\n");
				break;
			case 3:
				System.out.printf("3을 선택했다\n");
				break;
			case 4:
				System.out.print("4를 선택했다\n");
				break;
				default: // 위 case에서 조건이 없을 떄 실행
					System.out.printf("이상한걸 선택했다.\n");
				
			}

			// 궁금한 것 : 밑에다가만 이렇게 써서 할 수 있는 것인지>>??
	}

}
