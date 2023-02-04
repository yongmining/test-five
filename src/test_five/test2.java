package test_five;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		/* 하루는 24시간이다.
		일(day)이 입력으로 주어지면 시간으로 변환하시오
		입력
		일(day)이 입력된다.
		출력
		시간으로 변환해서 출력한다.
		입력 예시 
		2
		출력 예시
		48
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일을 입력해주세요>");
		int day = sc.nextInt();
		
		System.out.println("일을 시간으로 변환한 결과> "+(day*24)+" 시간입니다.");
		
	}

}
