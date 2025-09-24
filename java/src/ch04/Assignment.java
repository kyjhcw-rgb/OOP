package ch04;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int account = 0;
		int money;
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int number = Integer.parseInt(scanner.nextLine());
			
			if(number==1) {
				System.out.print("예금액> ");
				money = Integer.parseInt(scanner.nextLine());
				account+=money;
			} else if(number==2) {
				System.out.print("출금액> ");
				money = Integer.parseInt(scanner.nextLine());
				if(money<=account) {
					account-=money;
				} else {
					System.out.println("잔고가 부족합니다.");
				}
			} else if(number==3) {
				System.out.println("잔고> "+account);
			} else if(number==4) {
				break;
			} else {
				System.out.println("올바른 번호로 다시 입력해주세요.");
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
