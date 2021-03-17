package ywkim;

public class ifTest {

	public static void main(String[] args) {
		int a = 110;

		if (a < 100) {
			System.out.printf("100보다 작군요..\n");
			System.out.printf("참이면 이 문장도 보이겠죠? \n");

		} else if (100 < a && a < 200) {
			System.out.printf("100크고 200보다 작군요 \n");
			System.out.printf("ㅋㅋㅋ");
		} else {
			System.out.println("아무것도 포함되지 않습니다");

		}

		System.out.printf("프로그램 끝! \n");
	}

}
