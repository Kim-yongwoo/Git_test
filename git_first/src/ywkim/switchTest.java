package ywkim;

import java.util.Scanner;

public class switchTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // �̰� �ܿ���
		int a; // --?
		
		
			System.out.printf("1~4�߿� �����ϼ��� : ");
			a = s.nextInt();
			
			switch (a) {
			case 1:
				System.out.printf("1�� �����ߴ�\n");
				break; // �� ������ ��������>?
			case 2: 
				System.out.printf("2�� �����ߴ�\n");
				break;
			case 3:
				System.out.printf("3�� �����ߴ�\n");
				break;
			case 4:
				System.out.print("4�� �����ߴ�\n");
				break;
				default: // �� case���� ������ ���� �� ����
					System.out.printf("�̻��Ѱ� �����ߴ�.\n");
				
			}

			// �ñ��� �� : �ؿ��ٰ��� �̷��� �Ἥ �� �� �ִ� ������>>??
	}

}
