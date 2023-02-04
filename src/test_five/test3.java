package test_five;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		/* 3 6 9 게임을 하던 경곽이는 3 6 9 게임에서 잦은 실수로 계속해서 벌칙을 받게 되었다.
		3 6 9 게임의 왕이 되기 위한 마스터 프로그램을 작성해 보자.
		입력
		10보다 작은 정수 한 개가 입력된다.
		(1 ~ 10)
		출력
		1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
		3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
		입력 예시 
		9
		출력 예시
		1 2 X 4 5 X 7 8 X
		도움말
		중첩의 원리
		반복 실행구조 안에 선택 실행구조를 자유롭게 중첩할 수 있다.
		예시
		int i;
		for(i=1; i<=100; i++) //1부터 100까지 반복
		{
		  if(i%3==0 || i%5==0) printf("%d ", i); //3또는 5의 배수인 경우 그 수 출력
		}
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("369게임의 범위를 정해주세요>");
		int a = sc.nextInt();

		for(int i = 1; i<=a; i++) {
			if(i==3 || i==6 || i==9) {
				System.out.print(" X");
			}else {
				System.out.print(" "+i);
			}
		}
	}
}
